import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
        int producto;
        int diferencia;
        int cociente;
        System.out.println("ingrese el numero 1");
        numero1 = scanner.nextInt();
        System.out.println("ingrese el numero 2");
        numero2 = scanner.nextInt();

        if (numero1 > numero2)
            System.out.println("El numero 1 es mayor que el numero 2");
        if (numero2 > numero1)
            System.out.println("El numero 2 es mayor que el numero 1");
        if (numero1 == numero2)
            System.out.println("El numero 1 es igual a el numero 2");

        if (numero1 % 2 == 0)
            System.out.println("el nuemro 1 es par");
        else
            System.out.println("el numero 1 es impar");

        if (numero1 % numero2 == 0)
            System.out.println("son multiplos");
        else
            System.out.println("no son multiplos");

        suma = numero1 + numero2;
        producto = numero1 * numero2;
        diferencia = numero1 - numero2;
        cociente = numero1 / numero2;

        System.out.printf("suma %d producto %d diferencia %d coiente %d", suma, producto, diferencia, cociente);

    }
}