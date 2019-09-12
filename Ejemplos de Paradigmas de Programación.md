### Ejemplos de Paradigmas de Programación

#### Ejemplo de Paradigma imperativo y general:

* Lenguaje Basic:

```basic
'****************************************************************
'*  Name    : Intercalar encendido de dos LEDs                  *
'*  Author  : https://mrchunckuee.blogspot.com/                 *
'*  Notice  : Copyright (c) 2014 MrChunckuee                    *
'*          : All Rights Reserved                               *
'*  Date    : 12/05/2014                                        *
'*  Version : 1.0                                               *
'*  Notes   :                                                   *
'*          :                                                   *
'****************************************************************
cmcon=7
DEFINE OSC 4
TRISIO = 0
GPIO = 0
INICIO:
    GPIO =%00000001
    pause 500
    GPIO =%00000010
    pause 500
goto inicio
end
```

Lenguaje Ensamblador:

```asm
MOV AH 2
MOV DX 17218
INT 33
MOV DL DH
INT 33
JMP M
L: ADD DL 5
INT 33
JMP N
M: MOV DL 65
INT 33
JMP L
N: MOV AH 76
INT 33
END
```



#### Paradigma Estructurado

* Lenguaje C

```C
#include <stdio.h>
#include <limits.h>

void bit_print(int a)
{
	int i;
	int n = sizeof(int) * CHAR_BIT;  /* find size of ints for this macine */
	int mask = 1 << (n - 1); /* set mask to 1000000...000 */

	for(i = 1; i <= n; ++i)
	{
		putchar(((a & mask) == 0) ? '0' : '1');
		a <<= 1; /* shift over by one bit */
		if(i % CHAR_BIT == 0 && i < n)
			putchar(' ');
	}
	putchar('\n');

}

int main()
{
	int number;

	for(number = 0; number <= 16; ++number)
	{
		bit_print(number);
	}

	return 0;
}
```



#### Paradigma Imperativo, estructurado y Objetos:

* Lenguaje Java:

```java
public class Animal {
    String nombre;
    float peso;
    String raza;
    
    Animal(String nombre, float peso, String raza)
    {
        this.nombre = nombre;
        this.peso = peso + 10;
        this.raza = raza;
    }
    
    public static void main(String[] args) {
        Animal animal1;
        
        animal1 = new Animal("Juan", 1.5f, "bulldog");
        
        Animal animal2 = new Animal("Pepe", 2, "bulldog");
        
        System.out.println(animal1.nombre);
        System.out.println(animal2.nombre);
    }
}
```



#### Paradigma funcional

* Lenguaje Javascript

```javascript
const sum = (x, y) => x + y;

const calculate = (fn, x, y) => fn(x, y);

calculate(sum, 1, 2);
// 3
```

#### Paradigma procedural:

* Lenguaje SQL:

```sql
SELECT billing_country, AVG(total) AS avg_invoice_size
FROM invoices
GROUP BY billing_country
ORDER BY avg_invoice_size DESC
LIMIT 10;
```

#### Paradigma Lógico

* Lenguaje Prolog:

```Prolog
likes(mary,food).
likes(mary,wine).
likes(john,wine).
likes(john,mary).

# Sentencias

 | ?- likes(mary,food). 
 yes.
 | ?- likes(john,wine). 
 yes.
 | ?- likes(john,food). 
 no.
```



[1]: https://attractivechaos.github.io/plb/	"Comparativa lenguajes"
[2]: https://benchmarksgame-team.pages.debian.net/benchmarksgame/fastest/python.html

