public class Escalador extends Ciclista {
    private float aceleracionPromedioDeSubida;
    private float gradoDeRampaSoportada;

    public Escalador(int identificador, String nombreCiclista, int tiempoCarrera, float aceleracionPromedioDeSubida, float gradoDeRampaSoportada) {
        super(identificador, nombreCiclista, tiempoCarrera);
        this.aceleracionPromedioDeSubida = aceleracionPromedioDeSubida;
        this.gradoDeRampaSoportada = gradoDeRampaSoportada;
    }

    public Escalador(){}

    public float getAceleracionPromedioDeSubida() {
        return aceleracionPromedioDeSubida;
    }

    public void setAceleracionPromedioDeSubida(float aceleracionPromedioDeSubida) {
        this.aceleracionPromedioDeSubida = aceleracionPromedioDeSubida;
    }

    public float getGradoDeRampaSoportada() {
        return gradoDeRampaSoportada;
    }

    public void setGradoDeRampaSoportada(float gradoDeRampaSoportada) {
        this.gradoDeRampaSoportada = gradoDeRampaSoportada;
    }

    @Override
    protected String imprimirTipo() {
        String tipo = "Velocista";
        return tipo;
    }

    @Override
    public void imprimirAtributos() {
        super.imprimirAtributos();
        System.out.println("Velocidad: " + aceleracionPromedioDeSubida);
        System.out.println("Grado de Rampa: " + gradoDeRampaSoportada);
    }
}
