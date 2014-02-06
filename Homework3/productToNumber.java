/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/
public class productToNumber {   
public static void main(String[] args) {
int x,i,r;
x= Integer.parseInt(args[0].toString()); 
r=1;
for(i=2;i<=x;i++){
r=r*i;
}
System.out.println("El resultado es:"+r);
}
}
