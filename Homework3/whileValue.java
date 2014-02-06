/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   
public static void main(String[] args) {
int x,i;
x= Integer.parseInt(args[0].toString());
if(x>0){
for(i=0;i<x;i++){
System.out.println("El valor actual es: "+i);
 }
}
else
{System.out.println("El numero debe ser mayor a 0");}
}
}