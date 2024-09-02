import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Reuniones agenda = new Reuniones();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el lugar de la reunion ");
        String lugar = entrada.nextLine();
        agenda.asignarLugar(lugar);

        System.out.println("Ingrese los asistentes de la reunion ");
        String asistentes = entrada.nextLine();
        agenda.asignarAsistentes(asistentes);

        System.out.println("Ingrese el tema de la reunion");
        String tema = entrada.nextLine();
        agenda.asignarTema(tema);

        System.out.println("Ingrese la duracion de la reunion");
        int duracion = entrada.nextInt();
        agenda.asignarDuracion(duracion);

        agenda.mostrarLugar();
        agenda.mostrarAsistentes();
        agenda.mostrarTema();
        agenda.mostrarDuracion();


    }
}