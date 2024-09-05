//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Appmovil instancia1 = new Appmovil("Linuxeros", "kernel.org");
        Appmovil instancia2 = new Appmovil("Linuxeros", "kernel.org");

        System.out.println("Lucio tiene la version de la app: "+ instancia1.getVersionActual());
        System.out.println("Bruno tiene la version de la app: "+ instancia2.getVersionActual());

        System.out.println("Lucio "+ instancia1.consultarActualizacion());
        System.out.println("Bruno "+ instancia2.consultarActualizacion());

        Appmovil.ultimaVersion = 1;
        System.out.println("Lucio "+ instancia1.consultarActualizacion());
        System.out.println("Bruno "+ instancia2.consultarActualizacion());

        System.out.println("Actualizar el kernel a Lucio ");
        instancia1.actualizar();
        System.out.println("Lucio tiene la version actual");

        System.out.println("Actualizar el kernel a Bruno");
        instancia2.actualizar();
        System.out.println("Bruno tiene la version actual");

    }
}