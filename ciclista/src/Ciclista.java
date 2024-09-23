public abstract class Ciclista {
    private int identificador;
    private String nombreCiclista;
    private int tiempoCarrera = 0;

    // constructor
    public Ciclista(int identificador, String nombreCiclista, int tiempoCarrera){
        this.identificador  = identificador;
        this.nombreCiclista = nombreCiclista;
        this.tiempoCarrera = tiempoCarrera;
    }

    // constructor vacio
    public Ciclista() {}

    // geters y seters
    protected int getIdentificador() {
        return identificador;
    }

    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    protected String getNombreCiclista() {
        return nombreCiclista;
    }

    protected void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    protected int getTiempoCarrera() {
        return tiempoCarrera;
    }

    protected void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    // esto metodo luego debera ser sobrescrito (Override) con getClass().getSimpleName() en el cuerpo del metodo para imprimir cada tipo de ciclista
    protected abstract String imprimirTipo();

    public void imprimirAtributos(){
        System.out.println(identificador);
        System.out.println(nombreCiclista);
        System.out.println(tiempoCarrera);
    }
}

