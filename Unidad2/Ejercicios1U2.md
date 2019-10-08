# Ejercicios1U2

1. Comprueba los valores máximos y mínimos límites de los tipos básicos: byte, short, int, long, float, double.

2. (Convertir de millas a km): Escribe un programa que lea millas como valor double de la consola y lo convierta en km 
mostrando el resultado. La fórmula para la conversión es: `1 milla = 1.6 km`
Ejemplo:
```
Enter miles: 96 
96 miles is 153.6 kilometers
```

3. Crea un programa llamado **MostrarTiempo.java** que tomando una cantidad por teclado de segundos (entero positivo) muestre la cantidad de minutos y segundos contenidos. Ejemplo salida:
```
Introduzca un entero para segundos: 500
500 seconds son 8 minutos y 20 segundos
```
Nota: para calcular los segundos se puede hacer uso de módulo pues el resto son los segundos que faltan.

4. El paquete o librería Scanner puede leer desde teclado varios valores según el tipo: byte, short, int, long, double, float. Estos son los métodos u operaciones para leer los diversos tipos de datos:
```
nextByte() // lee un tipo byte
nextShort() // lee un tipo short
nextInt() // lee un tipo int
nextLong() // lee un tipo long
nextFloat() // lee un tipo float
nextDouble() // lee un tipo double
```
Prueba las siguientes sentencias para ver cómo se capturan diversos tipos de datos. Prueba también a capturar distintos tipos de datos, por ejemplo en nextByte() introduce 128 para ver qué ocurre.

```
 1 Scanner input = new Scanner(System.in);
 2 System.out.print("Enter a byte value: ");
 3 byte byteValue = input.nextByte();
 4
 5 System.out.print("Enter a short value: ");
 6 short shortValue = input.nextShort();
 7
 8 System.out.print("Enter an int value: ");
 9 int intValue = input.nextInt();
10
11 System.out.print("Enter a long value: ");
12 long longValue = input.nextLong();
13
14 System.out.print("Enter a float value: ");
15 float floatValue = input.nextFloat();

```

5. (Volumen de un triángulo) Escribe un programa que lee la longitud de los lados de un triángulo equilátero y calcula el area y y volumen utilizando las siguientes fórmulas:

Area = ( Sqrt(3) / 4 ) * lado^2
Volumen = area * longitud (todos los lados)

 
