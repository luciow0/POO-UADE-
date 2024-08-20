import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
    Scanner scanner = new Scanner(System.in);
    float radio;
    float diametro;
    float circunferencia;
    float area;
    float elevado;

    double valorDouble = 3.14159;
    float valorFloat = (float) valorDouble;


    System.out.println("ingrese el radio de su circulo ");
    radio = scanner.nextFloat();
    diametro = radio * 2;
    circunferencia = (2 * valorFloat) * radio;
    //elevado = Math.pow(radio, 2);
    //area = valorFloat * (radio **;
    //no supe resolver la cuestion de la potencia de 2, tampoco busque mucho
    // pero encontre que "Incompatible types. Found: 'double', required: 'float"
    // se soluciona pasando tu double a float como esta especificado en las lineas 13 y 14
    }
}