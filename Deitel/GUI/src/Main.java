import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String nombre =  JOptionPane.showInputDialog("Nombre: ");
        // String mensaje = String.format("Chupame el choto %s ", nombre);
        // JOptionPane.showMessageDialog(null, mensaje);

        String entero1 = JOptionPane.showInputDialog("Entero 1: ");
        String entero2 = JOptionPane.showInputDialog("Entero 2: ");

        int numero1 = Integer.parseInt(entero1);
        int numero2 = Integer.parseInt(entero2);
        int suma = numero1 + numero2;
        String mensaje = String.format("La suma de sus numero es %d ", suma);
        JOptionPane.showMessageDialog(null, mensaje);

    }
}