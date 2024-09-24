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

    public Producto[] cargarProductos (){
        Producto[] productos = new Producto[5];

        for(int i = 0; i < 6; i ++){
            productos[i] = new Producto();
            System.out.println("Ingrese el codigo del producto ");
            int codigo = sc.nextInt();
            productos[i].setCodigo(codigo);
            System.out.println("Ingrese el precio del producto ");
            int precio = sc.nextInt();
            productos[i].setPrecio(precio);
            System.out.println("Ingrese la descripcion del producto");
            String descripcion = sc.next();
            productos[i].setDescripcion(descripcion);
            System.out.println("Ingrese la cantidad del producto ");
            int cantidad = sc.nextInt();
            productos[i].setCantidad(cantidad);
        }

        return productos;
    }

    public boolean verificarExistencias(Producto[] productos, int codigo, int cantidad){
        boolean flag = false;
        for(int i = 0; i < 6; i ++){
            if(productos[i].getCodigo() == codigo){
                if (productos[i].getCantidad() >= cantidad){
                    flag = true;
                }
            }
        }

        return flag;
    }
}
