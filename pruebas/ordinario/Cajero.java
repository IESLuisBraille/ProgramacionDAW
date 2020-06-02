package cajero;

import java.util.Scanner;


public class Cajero 
{
	private boolean usuarioAutenticado;	//	si el usuario está autenticado
	private int numCuentaCorriente; //	número de cuenta corriente
	private RepartidorEfectivo repartidorEfectivo;	//	repartidor de efectivo
	
	
	private BaseDatosBanco basedatosBanco;	//	base de datos bancaria
	
	//	constantes para el menú
	private static final int CONSULTASALDO = 1;
	private static final int RETIRO = 2;
	private static final int DEPOSITO = 3;
	private static final int SALIDA = 4;
	
	public Cajero()
	{
		usuarioAutenticado = false;	//	ponemos que el usuario está NO autenticado al inicio
		numCuentaCorriente = 0;	//	sin cuenta correinte al comenzar
		repartidorEfectivo = new RepartidorEfectivo();	//	creamos este objeto
		
		basedatosBanco = new BaseDatosBanco();	//	creamos base de datos.
	}	
	
	//	inicio del menú
	public void inicio()
	{
		while (true)
		{
			//	utilizamos un loop hasta que autentiquemos
			while (!usuarioAutenticado)
			{
				System.out.println(" _____________________RedTar de Cajeros__________________");			
				System.out.println("|_______________________________________________________|");
				System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
				System.out.println("|_________________________Login_________________________|");
				System.out.print("|\tIntroduce la información de usuario \t\t|\n");
				
				
				autenticarUsuario();		//	autenticamos, si es false volvemos otra vez.
			}	
			
			realizarTransacciones();	//	usuario autenticado, en esta funciones realizamos las transacciones
			usuarioAutenticado = false;	//	una vez hechas las transacciones podemos resetear. Esto es algo de añadidura, no se solicita.
			numCuentaCorriente = 0;	//	reseteamos la cuenta corriente.
			System.out.println("\n Gracias por usar el Cajero");
		
		}		
	}	
	
	/*
	 * Realmente aquí hacemos toda la lógica de autenticar el usuario
	 */
	private void autenticarUsuario()
	{
		System.out.println("\nIntroduce tu número de cuenta: ");
		Scanner sc = new Scanner(System.in);
		
		int accountNumber = sc.nextInt();	
		System.out.println("\nIntroduce el PIN: ");
		int pin = sc.nextInt();
		
		//	validamos cuenta y pin
		usuarioAutenticado =
				basedatosBanco.autenticarUsuario(accountNumber, pin);
		
		if (usuarioAutenticado)
		{
			numCuentaCorriente = accountNumber;	//	save user's account #
		}	
		else
			System.out.println("\n Número de cuenta o PIN inválida. Por favor, inténtalo otra vez");
		
	}	
	
	
	private void realizarTransacciones()
	{
		Transaccion transaccionActual = null;
		boolean salidaUsuario = false;	// para salir del menú
		
		//	bucle si el usuario aún no ha decidido salir del menú
		while (!salidaUsuario)
		{
			int seleccionMenuPrinicipal = mostrarMenuPrincipal();
			
			switch (seleccionMenuPrinicipal)
			{
				//	Realmente utilizaremos una sóla opción con un método de crearTransacción para todo tipo de transacción
				case CONSULTASALDO:
				case RETIRO:
				case DEPOSITO:
					
					transaccionActual = 
						crearTransaccion(seleccionMenuPrinicipal);
					
					transaccionActual.ejecutar();	
					break;
					
				case SALIDA:	
					System.out.println("\nSaliendo del sistema");
					salidaUsuario = true;	
					break;
				default:	
					System.out.println("\nOpción inválida. Intente de nuevo");
					break;
			}	
		}	
	}	
	
	private int mostrarMenuPrincipal()
	{
		System.out.println("\nMenú principal:");
		System.out.println("1 - Ver mi balance");
		System.out.println("2 - Retirada efectivo");
		System.out.println("3 - Depositar efectivo");
		System.out.println("4 - Salir");
		System.out.println("Introduzca una opción: ");
		
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		return key;	//	opción usuario
	}	
	
	private Transaccion crearTransaccion(int tipo)
	{
		Transaccion temp = null;	//	variable temporal de Transaccion
		
		/* Las tranascciones según el diagrama UML del examen
		 * pueden especializarse en consultasaldo, retiro, deposito
		 */
		switch (tipo)
		{
			case CONSULTASALDO:	
				temp = new ConsultaSaldo(
						numCuentaCorriente, basedatosBanco);
				break;
			case RETIRO:	
				temp = new Retiro(numCuentaCorriente, 
						basedatosBanco, repartidorEfectivo);
				break;
			case DEPOSITO:	
				temp = new Deposito(numCuentaCorriente,
						basedatosBanco);
				break;
		}	
		
		return temp;	
	}	
	
	/**
	 * Bloque principal del programa
	 * @param args
	 */
	public static void main(String[] args)
    {
        Cajero cajero = new Cajero();
        cajero.inicio();
    }   
}	


