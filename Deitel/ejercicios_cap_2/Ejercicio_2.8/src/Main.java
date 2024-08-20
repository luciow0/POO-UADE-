import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.print("Ingrese el numero entero b: ");
        b =scanner.nextInt();
        System.out.print("Ingrese el numero entero c: ");
        c = scanner.nextInt();

        a = b * c;

        System.out.printf("%d * %d = %d %n", b, c, (b * c));

        System.out.printf("%d * %d = %d %n", b, c, a);

        System.out.println("1 2 3 4");
    }

}