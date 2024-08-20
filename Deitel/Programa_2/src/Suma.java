/* programa de suma, el programa utiliza la clave Scanner (inputs) */

import java.util.Scanner;

public class Suma
{
    public static void main(String [] args)
    {
        /* crea objeto Scanner 'entrada' para obtener la entrada de la ventana de comandos */
        /* 'entrada' va a ser tu objeto Scanner por el que el usuario va a ingresar los valores */

        Scanner entrada = new Scanner(System.in);

        int numero1; /* definicion de variables enteras */
        int numero2;
        int suma;

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt(); /* lee el primer numero del usuario, entrada es el obejto Scanner definido anteriormente, nextint asumo que es el metodo para decirle al Scanner que tome el proximo int y lo asigne a la variable*/

        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;

        System.out.printf("la suma es: %d%n", suma);

    }
}