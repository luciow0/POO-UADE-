import java.util.Scanner;

public class PruebaCuenta
{
    public static void main(String [] args)
    {
        // crea un objeto Scanner para obtener la entrada desde terminal
        Scanner entrada = new Scanner(System.in);

        // crea un objeto cuenta y lo asigna a miCuenta
        // osea crea una instancia de la clase Cuenta
        Cuenta miCuenta = new Cuenta(); // los parentesis de la derecha son obligatorios
        // los parentesis junto al nombre de una clase representan una llamada a un constructor, que es similar a un metodo pero es invocado de manera implicita por el operador new
        // para inicializar variables de instancia de un objeto al momento de crearlo

        System.out.printf("el nombre inicial es : %s%n%n", miCuenta.obtenerNombre());

        //pide y lee el nombre
        System.out.println("Introduzca el nombre de cuenta: ");
        String elNombre = entrada.nextLine();
        miCuenta.establecerNombre(elNombre);
        System.out.println();

        System.out.printf("el nombre en el objeto mi cuenta es: %n%s%n", miCuenta.obtenerNombre());
    }
}
