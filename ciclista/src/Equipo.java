import java.util.Scanner;

public class Equipo {
    // atributos propios de la clase equipo
    String nombreEquipo;
    int numeroEquipo;
    int tiempoTotalCarrera;
    int[] identificadores = new int[6];


    public Equipo(String nombreEquipo, int numeroEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.numeroEquipo = numeroEquipo;
    }

    public Equipo(){}

    Scanner sc = new Scanner(System.in);

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getNumeroEquipo() {
        return numeroEquipo;
    }

    public void setNumeroEquipo(int numeroEquipo) {
        this.numeroEquipo = numeroEquipo;
    }

    // cada equipo tendra como maximo 6 ciclistas, ya que los arreglos son estaticos y se debe predefinir la cantidad de elementos
    ContraRelojista[] contraRelojistas = new ContraRelojista[2];
    Escalador[] escaladores = new Escalador[2];
    Velocista[] velocistas = new Velocista[2];

    public void añadirContraRelojista() {
        for (int i = 0; i < 2; i++) {

            contraRelojistas[i]  = new ContraRelojista();

            System.out.println("Ingrese el nombre del contraRelojista " + i);
            String nombre = sc.next();
            contraRelojistas[i].setNombreCiclista(nombre);

            System.out.println("Ingrese el tiempo del contraRelojista " + i);
            int tiempo = sc.nextInt();
            contraRelojistas[i].setTiempoCarrera(tiempo);
            tiempoTotalCarrera += tiempo;

            System.out.println("Ingrese el identificador del contraRelojista " + i);
            int identificador = sc.nextInt();
            contraRelojistas[i].setIdentificador(identificador);
            identificadores[i] = identificador;

            System.out.println("Ingrese al velocidad maxima del contraRelojista " + i);
            int velocidadMaxima = sc.nextInt();
            contraRelojistas[i].setVelocidadMaxima(velocidadMaxima);
        }
    }

    public void añadirEscalador() {
        for (int i = 0; i < 2; i++) {

            escaladores[i] = new Escalador();

            System.out.println("Ingrese el nombre del escalador " + i);
            String nombre = sc.next();
            escaladores[i].setNombreCiclista(nombre);

            System.out.println("Ingrese el tiempo del escalador " + i);
            int tiempo = sc.nextInt();
            escaladores[i].setTiempoCarrera(tiempo);
            tiempoTotalCarrera += tiempo;

            System.out.println("Ingrese el identificador del escalador " + i);
            int identificador = sc.nextInt();
            escaladores[i].setIdentificador(identificador);
            identificadores[i + 2] = identificador;

            System.out.println("Ingrese la aceleracion promedio de subida del escalador " + i);
            float aceleracionPromedio = sc.nextFloat();
            escaladores[i].setAceleracionPromedioDeSubida(aceleracionPromedio);

            System.out.println("Ingrese el grado de rampa soportado por el escalador " + i);
            float grado = sc.nextFloat();
            escaladores[i].setGradoDeRampaSoportada(grado);
        }
    }

    public void añadirVelocista() {
        for (int i = 0; i < 2; i++) {

            velocistas[i] = new Velocista();

            System.out.println("Ingrese el nombre del velocista " + i);
            String nombre = sc.next();
            velocistas[i].setNombreCiclista(nombre);

            System.out.println("Ingrese el tiempo del velocista " + i);
            int tiempo = sc.nextInt();
            velocistas[i].setTiempoCarrera(tiempo);
            tiempoTotalCarrera += tiempo;

            System.out.println("Ingrese el identificador del velocista " + i);
            int identificador = sc.nextInt();
            velocistas[i].setIdentificador(identificador);
            identificadores[i + 4] = identificador;

            System.out.println("Ingrese la potencia promedio del velocista " + i);
            double potenciaPromedio = sc.nextDouble();
            velocistas[i].setPotenciaPromedio(potenciaPromedio);

            System.out.println("Ingrese la velocidad promedio del velocista " + i);
            double velocidadPromedio = sc.nextDouble();
            velocistas[i].setVelocidadPromedio(velocidadPromedio);
        }
    }


    public void mostrarDatosDelEquipo(){
        System.out.println("Nombre del equipo: " + getNombreEquipo());
        System.out.println(" ");
        System.out.println("Numero del equipo " + getNumeroEquipo());
        System.out.println(" ");
        System.out.println("Tiempo de carrera total del equipo " + tiempoTotalCarrera);

        System.out.println("Contra Relojistas del equipo: ");
        for (int i = 0; i < 2; i++) {
        System.out.println("1. " + contraRelojistas[i].getNombreCiclista());
        System.out.println("Identificador " + contraRelojistas[i].getIdentificador());
        System.out.println("Tiempo de carrera " + contraRelojistas[i].getTiempoCarrera());
        System.out.println("Velocidad maxima " + contraRelojistas[i].getVelocidadMaxima());
        }

        System.out.println("Velocistas del equipo: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("1. " + velocistas[i].getNombreCiclista());
            System.out.println("Identificador " + velocistas[i].getIdentificador());
            System.out.println("Tiempo de carrera " + velocistas[i].getTiempoCarrera());
            System.out.println("Velocidad maxima " + velocistas[i].getPotenciaPromedio());
            System.out.println("Velocidad pronedio " + velocistas[i].getVelocidadPromedio());
        }
        System.out.println("Escaladores del equipo: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("1. " + escaladores[i].getNombreCiclista());
            System.out.println("Identificador " + escaladores[i].getIdentificador());
            System.out.println("Tiempo de carrera " + escaladores[i].getTiempoCarrera());
            System.out.println("Aceleracion promedio de subida " + escaladores[i].getAceleracionPromedioDeSubida());
            System.out.println("Grado de rampa soportada " + escaladores[i].getGradoDeRampaSoportada());
        }

    }

    public void listarNombres(){
        for (int i = 0; i < 2; i++){
            System.out.println("Nombre Velocista " + i + velocistas[i].getNombreCiclista());
        }
        for (int i = 0; i < 2; i++){
            System.out.println("Nombre Escalador " + i + escaladores[i].getNombreCiclista());
        }
        for (int i = 0; i < 2; i++){
            System.out.println("Nombre Velocista " + i + contraRelojistas[i].getNombreCiclista());
        }

    }

}
