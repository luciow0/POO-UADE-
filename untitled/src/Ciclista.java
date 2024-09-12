public abstract class Ciclista {
    private int identificador;
    private String nombreCiclista;
    private int tiempoCarrera;

    protected String imprimirTipo() {
        return "Ciclista{" +
                "identificador=" + identificador +
                ", nombreCiclista='" + nombreCiclista + '\'' +
                ", tiempoCarrera=" + tiempoCarrera +
                '}';

    }
}