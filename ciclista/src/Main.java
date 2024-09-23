import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        Equipo equipoX = new Equipo();
        System.out.println("Ingrese el nombre de su equipo ");
        String nombreEquipo = sc.next();
        equipoX.setNombreEquipo(nombreEquipo);
        System.out.println("Ingrese el numero de su equipo ");
        int numeroEquipo = sc.nextInt();
        equipoX.setNumeroEquipo(numeroEquipo);

        System.out.println("Añada los contra relojistas de su equipo ");
        equipoX.añadirContraRelojista();

        System.out.println("Añada los velocistas de su equipo ");
        equipoX.añadirVelocista();

        System.out.println("Añada los escaladores de su equipo ");
        equipoX.añadirEscalador();

        equipoX.mostrarDatosDelEquipo();

        equipoX.listarNombres();

    }
}
