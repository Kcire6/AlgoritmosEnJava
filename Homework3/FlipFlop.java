/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   
public static void main(String[] args) {
int x,i;
x= Integer.parseInt(args[0].toString()); 
for(i=0;i<=x;i++){
if((i%3==0)&&(i%5!=0))
{System.out.println("Flip");}
else if((i%5==0)&&(i%3!=0))
{System.out.println("Flop");}
else if((i%3==0) && (i%5==0))
{System.out.println("FlipFlop");}
else
{System.out.println(i);}
}
}
}
