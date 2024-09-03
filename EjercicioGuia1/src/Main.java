import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Reuniones agenda = new Reuniones();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el lugar de la reunion ");
        String lugar = entrada.nextLine();
        agenda.setLugar(lugar);

        System.out.println("Ingrese los asistentes de la reunion ");
        String asistentes = entrada.nextLine();
        agenda.setAsistentes(asistentes);

        System.out.println("Ingrese el tema de la reunion");
        String tema = entrada.nextLine();
        agenda.setTema(tema);

        System.out.println("Ingrese la duracion de la reunion");
        int duracion = entrada.nextInt();
        agenda.setDuracion(duracion);

        agenda.getLugar();
        agenda.getAsistentes();
        agenda.getTema();
        agenda.getDuracion();


    }
}