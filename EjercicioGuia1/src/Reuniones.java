public class Reuniones {
    private String lugar;
    private String asistentes;
    private String tema;
    private int duracion;

    public void asignarLugar(String lugar) {
        this.lugar = lugar;
    }

    public void asignarAsistentes(String asistentes) {
        this.asistentes = asistentes;
    }

    public void asignarTema(String tema) {
        this.tema = tema;
    }

    public void asignarDuracion(int duracion) {
        this.duracion = duracion;
    }

    /*---------------------------------------*/

    public String mostrarLugar() {
        System.out.printf("el lugar de la reunion es %s\n", lugar);
        return lugar;
    }
    public String mostrarAsistentes() {
        System.out.printf("los asistentes de la reunion son %s\n", asistentes);
        return asistentes;
    }
    public String mostrarTema() {
        System.out.printf("el tema de la reunion es %s\n", tema);
        return tema;
    }
    public int mostrarDuracion() {
        System.out.printf("la duracion de la reunion es %d\n", duracion);
        return duracion;
    }
}
