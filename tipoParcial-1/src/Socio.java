public class Socio {
    int dni;
    String nombre;
    String domicilio;
    int telefono;
    int numTarjeta = -1;
    int puntos = 0;
    double descuento;

    public Socio(int dni, String nombre, String domicilio, int telefono, int numTarjeta, int puntos) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.numTarjeta = numTarjeta;
        this.puntos = puntos;
    }

    public Socio (){}

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double calcularDescuento(int puntos, Socio socio) {
        puntos = socio.getPuntos();
        while (puntos > 100){
            descuento += 0.2;
            puntos += 100;
        }
        return descuento;
    }
}
