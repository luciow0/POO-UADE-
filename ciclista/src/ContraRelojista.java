public class ContraRelojista extends Ciclista {
    private int velocidadMaxima;

    public ContraRelojista(int identificador, String nombreCiclista, int tiempoCarrera, int velocidadMaxima) {
        super(identificador, nombreCiclista, tiempoCarrera);
        this.velocidadMaxima = velocidadMaxima;
    }

    public ContraRelojista(){}

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    protected String imprimirTipo() {
        String tipo = "Velocista";
        return tipo;
    }

    @Override
    public void imprimirAtributos() {
        super.imprimirAtributos();
        System.out.println("Velocidad Maxima: " + getVelocidadMaxima());
    }
}
