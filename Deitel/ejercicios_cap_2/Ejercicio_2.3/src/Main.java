import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
     int c;
     int estaEsUnaVariable;
     int q76543;
     int numero;
     Scanner entrada = new Scanner(System.in);

     System.out.println("ingrese el numero: ");

     c = entrada.nextInt();

     System.out.printf("el numero que introdujo es %d%n ", c);

     if (c != 7)
         System.out.println("la variable no es igual a 7");


     System.out.println("this its a program in java, yes, im java boy ");
     System.out.printf("%s%n%s%n", "this is a blabla", "yes a i am");
    }
}