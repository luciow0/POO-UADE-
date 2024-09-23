import java.util.Scanner;

public class Equipo extends Ciclista {
    public Equipo(int identificador, String nombreCiclista, int tiempoCarrera) {
        super(identificador, nombreCiclista, tiempoCarrera);
    }

    Scanner sc = new Scanner(System.in);

    public Equipo(){}

    @Override
    protected int getIdentificador() {
        return super.getIdentificador();
    }

    @Override
    protected void setIdentificador(int identificador) {
        super.setIdentificador(identificador);
    }

    @Override
    protected String getNombreCiclista() {
        return super.getNombreCiclista();
    }

    @Override
    protected void setNombreCiclista(String nombreCiclista) {
        super.setNombreCiclista(nombreCiclista);
    }

    @Override
    protected int getTiempoCarrera() {
        return super.getTiempoCarrera();
    }

    @Override
    protected void setTiempoCarrera(int tiempoCarrera) {
        super.setTiempoCarrera(tiempoCarrera);
    }

    @Override
    protected String imprimirTipo() {
        return "";
    }

    // cada equipo tendra como maximo 6 ciclistas, ya que los arreglos son estaticos y se debe predefinir la cantidad de elementos
    ContraRelojista[] contraRelojistas = new ContraRelojista[2];
    Escalador[] escaladores = new Escalador[2];
    Velocista[] velocistas = new Velocista[2];

    protected ContraRelojista[] añadirContraRelojista() {
        for (int i = 0; i < 2; i++) {

            System.out.println("Ingrese el nombre del contraRelojista " + i);
            String nombre = sc.next();
            contraRelojistas[i].setNombreCiclista(nombre);

            System.out.println("Ingrese el tiempo del contraRelojista " + i);
            int tiempo = sc.nextInt();
            contraRelojistas[i].setTiempoCarrera(tiempo);

            System.out.println("Ingrese el identificador del contraRelojista " + i);
            int identificador = sc.nextInt();
            contraRelojistas[i].setIdentificador(identificador);

            System.out.println("Ingrese al velocidad maxima del contraRelojista " + i);
            int velocidadMaxima = sc.nextInt();
            contraRelojistas[i].setVelocidadMaxima(velocidadMaxima);
        }
        return contraRelojistas;
    }

    protected Escalador[] añadirEscalador() {
        for (int i = 0; i < 2; i++) {

            System.out.println("Ingrese el nombre del escalador " + i);
            String nombre = sc.next();
            escaladores[i].setNombreCiclista(nombre);

            System.out.println("Ingrese el tiempo del escalador " + i);
            int tiempo = sc.nextInt();
            escaladores[i].setTiempoCarrera(tiempo);

            System.out.println("Ingrese el identificador del escalador " + i);
            int identificador = sc.nextInt();
            escaladores[i].setIdentificador(identificador);

            System.out.println("Ingrese la aceleracion promedio de subida del escalador " + i);
            float aceleracionPromedio = sc.nextFloat();
            escaladores[i].setAceleracionPromedioDeSubida(aceleracionPromedio);

            System.out.println("Ingrese el grado de rampa soportado por el escalador " + i);
            float grado = sc.nextFloat();
            escaladores[i].setGradoDeRampaSoportada(grado);
        }
        return escaladores;
    }

    protected Velocista[] añadirVelocista() {
        for (int i = 0; i < 2; i++) {

            System.out.println("Ingrese el nombre del velocista " + i);
            String nombre = sc.next();
            velocistas[i].setNombreCiclista(nombre);

            System.out.println("Ingrese el tiempo del velocista " + i);
            int tiempo = sc.nextInt();
            velocistas[i].setTiempoCarrera(tiempo);

            System.out.println("Ingrese el identificador del velocista " + i);
            int identificador = sc.nextInt();
            velocistas[i].setIdentificador(identificador);

            System.out.println("Ingrese la potencia promedio del velocista " + i);
            double potenciaPromedio = sc.nextDouble();
            velocistas[i].setPotenciaPromedio(potenciaPromedio);

            System.out.println("Ingrese la velocidad promedio del velocista " + i);
            double velocidadPromedio = sc.nextDouble();
            velocistas[i].setVelocidadPromedio(velocidadPromedio);
        }
        return velocistas;
    }


}
