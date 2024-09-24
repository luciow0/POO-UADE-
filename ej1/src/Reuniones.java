public class Reuniones {
    private String lugar;
    private String asistentes;
    private String tema;
    private int duracion;

    // Uso de this en los setters: Es crucial porque permite distinguir entre los parámetros del
    // método y los atributos de la clase. Sin this, no se asignarían los valores a los atributos de
    //    la instancia de la clase.
    //Aquí, this es necesario porque el nombre del parámetro es el mismo que el nombre del atributo de la clase.
    // Sin this, Java trataría de asignar el valor del parámetro a sí mismo,
    // lo cual no cambiaría el valor del atributo de la clase.


    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setAsistentes(String asistentes) {
        this.asistentes = asistentes;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /*---------------------------------------*/

    //En estos métodos, no es necesario usar this para acceder a los atributos porque no hay ambigüedad:
    // no hay variables locales ni parámetros con los mismos nombres que los atributos de la clase.

    public String getLugar() {
        System.out.printf("el lugar de la reunion es %s\n", lugar);
        return lugar;
    }
    public String getAsistentes() {
        System.out.printf("los asistentes de la reunion son %s\n", asistentes);
        return asistentes;
    }
    public String getTema() {
        System.out.printf("el tema de la reunion es %s\n", tema);
        return tema;
    }
    public int getDuracion() {
        System.out.printf("la duracion de la reunion es %d\n", duracion);
        return duracion;
    }
}
