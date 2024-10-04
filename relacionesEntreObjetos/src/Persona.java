public class Persona {
    private String documentoIdentidad;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private char genero;
    private Vehiculo vehiculo;

    public void crearPersona(String documentoIdentidad, String nombre, String fechaNac, char genero, Vehiculo vehiculo ){
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.vehiculo = vehiculo;

    }
}
