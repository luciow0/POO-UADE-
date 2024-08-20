import java.util.Scanner;
//el programa calculara el producto de 3 enteros, sabes, reina
public class Main
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);

        int x;
        int y;
        int z;
        int resultado;

        System.out.println("Escriba el primer numero entero ");
        x = entrada.nextInt();
        System.out.println("Escriba el segundo numero entero ");
        y = entrada.nextInt();
        System.out.println("Escriba el tercer numero entero ");
        z = entrada.nextInt();
        resultado = x*y*z;
        System.out.printf("%d * %d * %d = %d", x, y, z, resultado);

    }

}