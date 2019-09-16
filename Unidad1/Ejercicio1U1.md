# Ejercicios Unidad 1

## Previamente recordamos

![1568628088611](/home/ivanji/.config/Typora/typora-user-images/1568628088611.png)

#### Primero vamos a ver una serie de programas sencillos en java:

1. TresMensajesBienvenida.java

```java
public class TresMensajesBienvenida { //El fichero tendrá este nombre y la extensión .java
 	public static void main(String[] args) { // Esto es siempre igual 
 		System.out.println("Programar es divertido!!"); //Imprime y luego salta de línea
 		System.out.println("Empecemos con lo fundamental"); //ídem
 		System.out.println("Resolución de problemas sencillos"); //ídem
	} 
} //Esto es un comentario de una línea
/* Esto es un comentario de 
varias líneas
*/
```

* Para compilar y ejecutar

```bash

$> cd <directorio donde tengas el fichero TresMensajesBievenida.java>
$> javac TresMensajesBienvenida.java
$> java TresMensajesBienvenida
Programar es divertido!!
Empecemos con lo fundamental
Resolución de problemas sencillos

```

2. Otro ejercicio

   Resolver:

   ![1568628569239](/home/ivanji/.config/Typora/typora-user-images/1568628569239.png)

```java
public class ComputeExpression {
	public static void main(String[] args) {
    	System.out.print("(10.5 + 2 * 3) / (45 – 3.5) = "); //Imprime sin salto de línea
 		System.out.println((10.5 + 2 * 3) / (45 – 3.5));
    }
} 
```



### Proceso de compilación y ejecución de un programa Java

![1568629064364](/home/ivanji/.config/Typora/typora-user-images/1568629064364.png)

![1568629103281](/home/ivanji/.config/Typora/typora-user-images/1568629103281.png)



### Estilos para escribir código

![1568629182047](/home/ivanji/.config/Typora/typora-user-images/1568629182047.png)

![1568629203919](/home/ivanji/.config/Typora/typora-user-images/1568629203919.png)

#### Errores sintácticos

Compila el siguiente código:

```java
// ShowSyntaxErrors.java
public class ShowSyntaxErrors {
	public static main(String[] args) {
		System.out.println("Welcome to Java);
	}
}
```

Estos errores salen en la fase de compilación, con lo que son sencillos de detectar a priori.

- Error 1: la palabra reservada `void`
- Error 2: cierre de comillas dobles



#### Errores de Ejecución

```java
// ShowRuntimeErrors.java
public class ShowRuntimeErrors {
	public static void main(String[] args) {
	System.out.println(1 / 0);
	}
}
```

- En este caso nos dará un error en tiempo de ejeución, los cuales son a veces un poco más difíciles de detectar ya que el programa compila perfectamente pero no se ejecuta
- Véase que en este caso, la división por cero es un error de ejecución pero no hay ningún error sintáctico, sino que es un error de operación.

#### Errores Lógicos

```java
// ShowLogicErrors.java
public class ShowLogicErrors {
	public static void main(String[] args) {
        //Fórmula (35 °C × 9 / 5) + 32 = 95 °F
		System.out.print("Pasar 35ºC a Fahrenheit: ");
		System.out.println((9 / 5) * 35 + 32);
	}
} 
```

- En tiempo de compilación y ejecución no se reciben errores, el error está en el cálculo, el resultado es 63 pero el resultado correcto es 95.
- Esto es porque `(9/5)` es un cálculo que no es entero, sino real. Para arreglarlo, debemos ponerlo como número real `( 9.0 / 5.0)`



#### Ejercicios

1. Imprime el siguiente patrón por pantalla ayudándonte de `\n`y `\t`:

   ![1568631642768](/home/ivanji/.config/Typora/typora-user-images/1568631642768.png)

2. Imprime la siguiente tabla:

![1568631689590](/home/ivanji/.config/Typora/typora-user-images/1568631689590.png)

3. Realiza esta operación:

![1568631772112](/home/ivanji/.config/Typora/typora-user-images/1568631772112.png)