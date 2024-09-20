public abstract class Ciclista {
    private int identificador;
    private String nombreCiclista;
    private int tiempoCarrera;

    protected String imprimirTipo() {
        return "Es un " + getClass();
    }

    public Ciclista(int identificador, String nombreCiclista, int tiempoCarrera){
        this.identificador  = identificador;
        this.nombreCiclista = nombreCiclista;
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreCiclista() {
        return nombreCiclista;
    }

    public void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }
}
