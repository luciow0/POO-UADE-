import java.util.Scanner;

public class OrdenCompra {
    int numeroCompra;
    int fecha;
    int dniProveedor;
    int cantidadComprar;
    int producto;
    boolean proveedorVerificado;

    Scanner sc = new Scanner(System.in);

    public OrdenCompra(int numeroCompra, int fecha, int dniProveedor, int cantidadComprar, int producto) {
        this.numeroCompra = numeroCompra;
        this.fecha = fecha;
        this.dniProveedor = dniProveedor;
        this.cantidadComprar = cantidadComprar;
        this.producto = producto;
    }

    public OrdenCompra(){}

    public int getNum() {
        return numeroCompra;
    }

    public void setNum(int num) {
        this.numeroCompra = numeroCompra;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getDniProveedor() {
        return dniProveedor;
    }

    public void setDniProveedor(int dniProveedor) {
        this.dniProveedor = dniProveedor;
    }

    public int getCantidadComprar() {
        return cantidadComprar;
    }

    public void setCantidadComprar(int cantidadComprar) {
        this.cantidadComprar = cantidadComprar;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public boolean verificarProveedor(int dniProveedor){
        int[] proveedores = new int[6];
        proveedores[0] = 36987192;
        proveedores[1] = 45947502;
        proveedores[2] = 12145765;
        proveedores[3] = 36287192;
        proveedores[4] = 26185610;
        proveedores[5] = 46444122;
        System.out.println("Ingrese el DNI de el proovedor");
        int dni = sc.nextInt();
        proveedorVerificado = false;
        for (int i = 0; i < 6; i++) {
            if (dniProveedor == proveedores[i]){
                proveedorVerificado = true;
            }
        }
        return proveedorVerificado;
    }

}

