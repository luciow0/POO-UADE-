import java.util.Scanner;

public class Producto {
    int codigo;
    int precio;
    String descripcion;
    int cantidad;

    Scanner sc = new Scanner(System.in);

    public Producto(int codigo, int precio, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Producto(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean verificarExistencias(Producto[] productos, int codigo, int cantidad, int pos){
        boolean flag = false;
        if(productos[pos].getCantidad() >= cantidad){
            flag = true;
        }
        return flag;
    }
}
