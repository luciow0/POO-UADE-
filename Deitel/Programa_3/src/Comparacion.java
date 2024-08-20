/* compara enteros utilizando instrucciones if */

import java.util.Scanner;

public class Comparacion
{
 public static void main(String [] args) /*void pq no devulve nada main es la clase que tiene que existir si o si para que ejecute el goyete*/
 {
     Scanner entrada = new Scanner(System.in); /* se crea el objeto entrada de la clase scanner*/

     int numero1; /* declaracion de variables */
     int numero2;

     System.out.println("Escriba el primer numero ");
     numero1 = entrada.nextInt();

     System.out.println("Escriba el segundo numero");
     numero2 = entrada.nextInt();

     if (numero1 == numero2) /* al final del if no va nada */
         System.out.printf("%d es igual a %d", numero1, numero2);
     if (numero1 > numero2)
         System.out.printf("%d es mayor a %d", numero1, numero2);
     if (numero1 < numero2)
         System.out.printf("%d es menor a %d ", numero1, numero2);


 }
}