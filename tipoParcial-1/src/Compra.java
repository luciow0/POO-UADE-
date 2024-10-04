public class Compra {
    double importe;
   // int numTarjeta;
    int dni;
    int codigo;
    String descripcion;
    int fecha;
    int cantidad;

    public Compra(double importe, int numTarjeta, int dni, String descripcion, int fecha, int cantidad) {
        this.importe = importe;
       // this.numTarjeta = numTarjeta;
        this.dni = dni;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public Compra(){}

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    //public int getNumTarjeta() {
    //   return numTarjeta;
    //}

    //public void setNumTarjeta(int numTarjeta) {
    //    this.numTarjeta = numTarjeta;
    //}

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
