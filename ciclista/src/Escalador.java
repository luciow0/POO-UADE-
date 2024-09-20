public class Escalador extends Ciclista {
    private float aceleracionPromedioDeSubida;
    private float gradoDeRampaSoportada;

    public Escalador(int identificador, String nombreCiclista, int tiempoCarrera, float aceleracionPromedioDeSubida, float gradoDeRampaSoportada) {
        super(identificador, nombreCiclista, tiempoCarrera);
        this.aceleracionPromedioDeSubida = aceleracionPromedioDeSubida;
        this.gradoDeRampaSoportada = gradoDeRampaSoportada;
    }

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
}
