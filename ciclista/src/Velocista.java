public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombreCiclista, int tiempoCarrera, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombreCiclista, tiempoCarrera);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public Velocista(){}

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    protected String imprimirTipo() {
        String tipo = "Velocista";
        return tipo;
    }

    @Override
    public void imprimirAtributos() {
        super.imprimirAtributos();
    }

}
