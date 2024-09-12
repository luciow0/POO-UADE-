public class Equipo extends Ciclista {
    public Equipo(int identificador, String nombreCiclista, int tiempoCarrera) {
        super(identificador, nombreCiclista, tiempoCarrera);
    }

    @Override
    public int getIdentificador() {
        return super.getIdentificador();
    }

    @Override
    public void setIdentificador(int identificador) {
        super.setIdentificador(identificador);
    }

    @Override
    public String getNombreCiclista() {
        return super.getNombreCiclista();
    }

    @Override
    public void setNombreCiclista(String nombreCiclista) {
        super.setNombreCiclista(nombreCiclista);
    }

    @Override
    public int getTiempoCarrera() {
        return super.getTiempoCarrera();
    }

    @Override
    public void setTiempoCarrera(int tiempoCarrera) {
        super.setTiempoCarrera(tiempoCarrera);
    }
}
