# Ejercicios propuestos de Unidad 3 

1. Crea una clase Geometria que tenga dos funciones que puedan ser utilizadas sin crear el objeto con new.
Dichas funciones son:

volumenCilindro -> retorna el volumen de un cilindro (Pi*r^2*h)
longitudCircunferencia -> retorna la longitud de la circunferencia (2*Pi*r)

Todos los datos son double.

2. Crea una clase FuncionesMatematicas que tenga la función **esPrimo** que comprueba si un número entero positivo es primo o no.Un número es primo cuando únicamente es divisible entre él mismo y la unidad. 

3. También crea otra función **cuentaDigitos** que devuelve el número de dígitos que contiene un número entero

4. Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber :
* el tamaño - mediana o familiar 
* el tipo - margarita, cuatro quesos o funghi 
* y su estado - pedida o servida. 
La clase debe almacenar información sobre el número total de pizzas que se han pedido y que se han servido. Siempre que se crea una pizza nueva, su estado es "pedida".

5. Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número de cuenta de 10 dígitos. Para simplificar, el número de cuenta se genera de forma aleatoria cuando se crea una cuenta nueva. La cuenta se puede crear con un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.

En una cuenta se pueden hacer ingresos y gastos. También es posible hacer una transferencia entre una cuenta y otra. Se permite el saldo negativo.

```java
Programa principal:
CuentaCorriente cuenta1 = new CuentaCorriente();
CuentaCorriente cuenta2 = new CuentaCorriente(1500);
CuentaCorriente cuenta3 = new CuentaCorriente(6000);
System.out.println(cuenta1);
System.out.println(cuenta2);
System.out.println(cuenta3);
cuenta1.ingreso(2000);
cuenta2.cargo(600);
cuenta3.ingreso(75);
cuenta1.cargo(55);
cuenta2.transferencia(cuenta3, 100);
System.out.println(cuenta1);
System.out.println(cuenta2);
System.out.println(cuenta3);
Salida:
Número de cta: 6942541557 Saldo: 0,00 €
Número de cta: 9319536518 Saldo: 1500,00 €
Número de cta: 7396941518 Saldo: 6000,00 €
Número de cta: 6942541557 Saldo: 1945,00 €
Número de cta: 9319536518 Saldo: 800,00 €
Número de cta: 7396941518 Saldo: 6175,00 €
```

5. Crea las clases Punto y Linea. De un punto se tienen que saber sus coorde?nadas x e y, mientras que una línea está definida por dos puntos. Define las clases y los métodos necesarios para que el siguiente código muestre la salida que se indica.

```java
Programa principal:
Punto p1 = new Punto(4.21, 7.3);
Punto p2 = new Punto(-2, 1.66);
Linea l = new Linea(p1, p2);
System.out.println(l);
Salida:
Programación orientada a objetos 204
Línea formada por los puntos (4.21, 7.3) y (-2.0, 1.66)

```
