# Ejercicios 2 Unidad 1

### Ejercicio 1
(Aritmética) Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números 
del usuario e imprima la suma, producto, diferencia y cociente (división) de los números.

### Ejercicio 2
(Comparación de enteross) Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga
los números del usuario y muestre el número más grande, seguido de las palabras “es más grande”. Si los números son 
iguales, imprima el mensaje “Estos números son iguales”.

### Ejercicio 3
(Aritmética: menor y mayorr) Escriba una aplicación que reciba tres enteros del usuario y muestre la suma, 
promedio, producto, menor y mayor de esos números. 

### Ejercicio 4
(Par o impar) Escriba una aplicación que lea un entero y que determine e imprima si es impar o par [sugerencia: use el operador residuo. Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un residuo de 0 cuando se divide entre 2]

### Ejercicio 5
(Múltiplos) Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e 
imprima el resultado. [Sugerencia: use el operador residuo].

### Ejercicio 6
**Nota Explicativa**

Existe una librería llamada Math la cual es estática y se puede llamar desde cualquir clase o programa java sin tener que declararla

En JShell se puede ver que podemos llamar al valor PI de la siguiente forma:
```
jshell> Math.PI
$25 ==> 3.141592653589793

```
Esto es, el **objeto estático** Math tiene componentes como el valor PI o cáluclo exponencial, p.e, si quiero calcular 2 elevado a 4 realizo lo siguiente:
```
jshell> Math.pow(2,4)
$26 ==> 16.0
```
Puedes utilizar otras expresiones matemáticas como el **Math.max(a,b)** como el **Math.min(a,b)**, máximo y mínimo de dos números:

```
jshell> Math.min(2,4)
$27 ==> 2

jshell> Math.max(2,4)
$28 ==> 4
```
(Diámetro, circunferencia y área de un círculoo) Java también puede representar números de punto flotante que contienen puntos decimales, 
como 3.14159. Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro, la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π. [nota: también puede utilizar la constante predefinida Math.PI para el valor 
de π. Esta constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang. Las clases en 
este paquete se importan de manera automática, por lo que no necesita importar la clase Math mediante la instrucción 
import para usarla]. Use las siguientes fórmulas (r es el radio):
- diámetro = 2r
- circunferencia = 2πr
- área = πr2

No almacene los resultados de cada cálculo en una variable. En vez de ello, especifique cada cálculo como el valor que 
se imprimirá en una instrucción `System.out.printf`. Los valores producidos por los cálculos del área y de la circunferencia son números de punto flotante. Dichos valores pueden imprimirse con el especificador de formato %f en una
instrucción `System.out.printf`. 

### Ejercicio 7

(Valor entero de un carácter)  Java puede también representar letras en mayúsculas, en minúsculas y en una considerable variedad
de símbolos especiales. Cada carácter tiene su correspondiente representación entera. El conjunto de caracteres que 
utiliza una computadora, junto con las correspondientes representaciones enteras de esos caracteres, se conocen 
como el conjunto de caracteres de esa computadora. Usted puede indicar un valor de carácter en un programa con 
sólo encerrar ese carácter entre comillas sencillas, como en ‘A’.

Usted puede determinar el equivalente entero de un carácter si antepone a ese carácter la palabra (int), como en

```(int) 'A'```

Esta forma se conoce como operador de conversión de tipo (casting). La siguiente instrucción imprime un carácter y su equivalente entero:
```
System.out.printf( “El caracter %c tiene el valor %d%n”, ‘A’, ((int) ‘A’));
```

Cuando se ejecuta esta instrucción, muestra el carácter A y el valor 65 (del conjunto de caracteres conocido como 
Unicode® como parte de la cadena. El especificador de formato %c es un receptáculo para un carácter (en este caso, 
elcarácter 'A').

Utilizando instrucciones similares a la mostrada anteriormente en este ejercicio, escriba una aplicación que 
muestre los equivalentes enteros de algunas letras en mayúsculas, en minúsculas, dígitos y símbolos especiales. 
Muestre los equivalentes enteros de los siguientes caracteres: A B C a b c 0 1 2 $ * + / y el carácter en blanco.

### Ejercicio 8

(Tabla de cuadrados y cuboss)
Escriba una aplicación que calcule los cuadrados y cubos de los números del 0 al 10, y que imprima los valores resultantes en formato de tabla, como se muestra a continuación.
```
número cuadrado cubo
0      0      0
1      1      1
2      4      8
3      9      27
4      16     64
5      25     125
6      36     216
7      49     343
8      64     512
9      81     729
10     100    1000
```
## Ejercicios de ampliación

### Ejercicio 9

(Valores negativos, positivos y ceroo) Escriba un programa que reciba cinco números, y que determine e imprima la cantidad de números negativos, positivos, y la cantidad de ceros recibidos.

### Ejercicio 10
(Calculadora del índice de masa corporal)  Las fórmulas para calcular el BMI son (en libras y kg):
```
BMI = ( pesoEnLibras × 703 ) / ( alturaEnPulgadas × alturaEnPulgadas)

BMI =  pesoEnKilogramos  / ( alturaEnMetros × alturaEnMetros )
```
Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso del 
usuario en kilogramos y la altura en metros), para que luego calcule y muestre el índice de masa corporal del usuario. 
Muestre además la siguiente información del Departamento de Salud y Servicios Humanos/Instituto Nacional de 
Salud para que el usuario pueda evaluar su BMI:
```
VALORES DE BMI
Bajo peso: menos de 18.5
Normal: entre 18.5 y 24.9
Sobrepeso: entre 25 y 29.9
Obeso: 30 o más
```
[Nota: en este capítulo aprendió a usar el tipo int para representar números enteros. Cuando se realizan los cálculos 
del BMI con valores int, se producen resultados en números enteros. En el capítulo 3 aprenderá a usar el tipo double
para representar a los números con puntos decimales. Cuando se realizan los cálculos del BMI con valores double,
producen números con puntos decimales; a éstos se les conoce como números de “punto flotante”].

### Ejercicio 11
(Cálculo trayecto del automóvil) Escriba una aplicación que calcule el coste del trayecto de un automóvil:

a. Total de kilómetros conducidos por trayecto
b. Costo por litro de gasolina/diesel.
c. Número litros/100km.

