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
 System.currentTimeMillis() `
5. (Volumen de un triángulo) Escribe un programa que lee la longitud de los lados de un triángulo equilátero y calcula el area y y volumen utilizando las siguientes fórmulas:
```
Area = ( Sqrt(3) / 4 ) * lado^2

Volumen = area * longitud (todos los lados)

 ```
6. **Lab Práctico**

Puedes utilizar la función `System.currentTimeMillis()` que devuelve el número total de milisegundos desde el 01/01/1970. Este tiempo se llama **Unix epoch**. Comienza en 1970 que es cuando se introdujo Unix. 

Puedes utilizar este método para saber cuál es el minuto, hora y segundo actuales:
* Obtener el total de milisegundos con `System.currentTimeMillis()`. Obtenlo en una variable totalMilisegundos.
* Obtener el total de segundos en una variable totalSegundos (totalMilisegundos/1000).
* Obtener el segundo en el que estamos (actual), simplemente con totalSegundos % 60.
* Obtener el númeto total de minutos: totalSegundos / 60 en una variable totalMinutos.
* Obtener el minuto actual mediante: totalMinutos % 60.
* Obtener el número total de horas mediante: totalMinutos / 60 en una variable totalHoras.
* Obtener la hora actual mediante totalHoras % 24.

El programa debe de calcular todo lo anterior y mostrar el mensaje con los cálculos hechos de la hora actual:
`La hora del sistema es 17:35:07 GMT`

7. **Lab Práctico** Crear un conversor de unidades informáticas. El programa debe pedir la entrada por teclado de la cantidad y luego de la unidad origen: 
```
0 = byte
1 = Kilobyte
2 = Megabyte
3 = Gigabyte
4 = Terabyte
```
Y luego debe realizar la conversión para el resto de unidades. Es decir, si se pasan Kb debe pasar a byte, MB, GB y TB etc.

8. Escribe un programa que muestre la siguiente tabla calculando el punto medio de dos puntos. El punto medio se calcula sumando las dos coordenadas por separado y dividirla entre 2.
```
  a      b       Punto medio
(0, 0) (2, 1)  (1.0, 0.5)
(1, 4) (4, 2)  (2.5, 3.0)
(2, 7) (6, 3)  (4.0, 5.0)
(3, 9) (10, 5) (6.5, 7.0)
(4, 11) (12, 7) (8.0, 9.0)
```
9. (Ejercicio Financiero): Supón que tienes 100€ de beneficio mensual en una cuenta bancaria con un interés anual de 3.75%. El interés mensual sería: 0.0375/12 = 0.003125. 

* Después del primer mes la ganancia sería: 100 + (0.003125 *100) = 100.3125
* Después del segundo mes sería de: (100.3125 + 100) * ( 1 + .003125) = 200.9384765625

Realiza un programa que calcule y muestre por pantalla el beneficio de los 6 primeros meses. De entrada pide el beneficio mensual, ej 100€.

10. Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.

Ejemplo 1:
```
Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
```
Ejemplo 2:
```
Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen
```
11. Crea un un programa que pida dos puntos por teclado (x1, x2) e (y1, y2) y muestre la distancia de ambos puntos. La fórmula utilizada es sqrt((x2 - x1)^2 + (y2-y1)^2)) . El símbolo sqrt es raíz cuadrada y ^ es el exponente. Se pueden utilizar la funciones Math.pow y Math.sqrt.

12. (Separación de los dígitos en un entero) Escribe una aplicación que reciba del usuario un número compuesto por cinco dígitos, que separe ese número en sus dígitos individuales y los imprima, cada uno separado de los demás 
por tres espacios. Por ejemplo, si el usuario escribe el número 42339, el programa debe imprimir
```
4   2   3   3   9
```
Nota: 
- si hacemos 42339 % 10 = 9
- si hacemos 42339 /10 = 4233
- Y así podemos saber cuál es la descomposición y además ir reduciendo el número hasta llegar al último

13. (**Lab Práctico**): Vamos a crear un programa de gestión de préstamos en el que se solicitan los siguientes requisitos:
* El usuario debe introducir la tasa de interés, la cantidad total del préstamo y los años en los que los pagos de la deuda se realizan.
* Debe procesarse y mostrar el pago mensual y la cantidad total de los pagos.

El pago mensual y el total del pago se calculan con las siguientes fórmulas:
```
pagoMensual = ( totalPrestamo * tasaDeInteresMensual ) / (1 - 1 / ((1  + tasaDeInteresMensual ) ^ ( numAnyos x 12 )))

totalPago = pagoMensual * numAnyos * 12
```
* El interés debe ser un porcentaje 4.5% por ejemplo, si quieres obtener el interés mensual debes dividir por 100 y luego dividir por 12. 
* Puedes utilizar las funciones Math que necesites.

Un ejemplo sería de programa sería:

```
Introduce la tasa de interés, por ejemplo, 7.25: 5.75
Introduce el número de años como entero, por ejemplo 5: 15
Introduce la cantidad del pŕestamo, por ejemplo: 120000.95: 250000 
La mensualidad a pagar es: $2076.02
El pago total es: $373684.53
```

### Cuestiones/

1. Qué asignaciones son correctas en Java:

```
int value = (float) 4.5;
float value = 4 (double);
double value = 2.12;
char value = 5c;
 
double money = 12;
double money = 12.0;
double money = 12.0d;

char aChar = 5.5;
char aChar = “W”;
char aChar = '*';
```
2. Qué valor numérico tienen las siguientes expresiones en Java:
```
a. 4 + 6 * 2
b. 10 / 5 + 8
c. 12 / 4 + 16 / 2
d. 17 / 2
e. 22 / 5
f. 39 / 10
g. 19 % (2 + 3)
h. 3 + 4 * 20 / 3
i. 36 % (6 + 2)
j. 8 % 2 * 0
```
3. Cuál es valor booleano si x = 1:

```
(x > 0)
(x < 0)
(x != 0)
(x >= 0)
(x != 1) 
```
4. Qué está mal en las siguientes sentencias:
```  
  a. System.out.printf("%5d %d", 1, 2, 3);
  b. System.out.printf("%5d %f", 1);
  c. System.out.printf("%5d %f", 1, 2);
  d. System.out.printf("%.2f\n%0.3f\n", 1.23456, 2.34);
  e. System.out.printf("%08s\n", "Java");
```
5. Muestra la salida de las siguientes sentencias:
```   
  a. System.out.printf("amount is %f %e\n", 32.32, 32.32);
  b. System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
  c. System.out.printf("%6b\n", (1 > 2));
  d. System.out.printf("%6s\n", "Java");
  e. System.out.printf("%−6b%s\n", (1 > 2), "Java");
  f. System.out.printf("%6b%−8s\n", (1 > 2), "Java");
  g. System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
  h. System.out.printf("%05d %06.1f\n", 32, 32.32);
```

6. Teniendo esta sentencia `double d = 75.0;` pasa d a tipo byte, short, int, long, float, char y revisa el resultado.

7. Según la sentencia `char c = '\u2277'` pasar a byte, short, int, long, float y double y revisa el resultado.

. Probar el siguiente código para ver el funcionamiento de printf:


```java
public class FormatDemo {
	public static void main(String[] args) {
        // Display the header of the table
 		System.out.printf("%−10s%−10s%−10s%−10s%−10s\n", "Degrees",
  			"Radians", "Sine", "Cosine", "Tangent");
 
  		// Display values for 30 degrees
  		int degrees = 30;
  		double radians = Math.toRadians(degrees);
 		System.out.printf("%−10d%−10.4f%−10.4f%−10.4f%−10.4f\n", degrees,
 			radians, Math.sin(radians), Math.cos(radians),
 			Math.tan(radians));

 		// Display values for 60 degrees
 		degrees = 60;
 		radians = Math.toRadians(degrees);
 		System.out.printf("%−10d%−10.4f%−10.4f%−10.4f%−10.4f\n", degrees,
 			radians, Math.sin(radians), Math.cos(radians),
 			Math.tan(radians));
 	}
}
```




