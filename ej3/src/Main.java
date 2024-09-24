import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creacion de productos existentes para añadir a la orden de compra
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

        OrdenCompra orden = new OrdenCompra();
        System.out.println("Ingrese el DNI del proveedor: ");

        boolean flag = false;
        while(flag == false){
            int dniProveedor = sc.nextInt();
            if (orden.verificarProveedor(dniProveedor)){
                System.out.println("El proveedor esta verificado");
                flag = true;
            }
            else{
                System.out.println("El proveedor no esta verificado");
            }
        }

        System.out.println("Por favor ingrese la fecha de orden de compra: ");
        int fecha = sc.nextInt();
        orden.setFecha(fecha);

        System.out.println("Por favor ingrese el codigo del producto: ");
        int codigo = sc.nextInt();
        orden.setProducto(codigo);

        System.out.println("Por favor ingrese la cnatidad de productos que desea añadir ");
        int cantidad = sc.nextInt();
        orden.setCantidadComprar(cantidad);


        if (productos[codigo].verificarExistencias(productos,codigo, cantidad)){

        }



    }


}