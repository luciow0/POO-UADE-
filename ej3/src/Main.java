import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creacion de productos existentes para añadir a la orden de compra
        Producto[] productos = new Producto[3];
        for (int i = 0; i < 3; i++) {
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
        while (!flag) {
            int dniProveedor = sc.nextInt();
            if (orden.verificarProveedor(dniProveedor)) {
                System.out.println("El proveedor esta verificado");
                flag = true;
            } else {
                System.out.println("El proveedor no esta verificado");
            }
        }

        System.out.println("Por favor ingrese la fecha de orden de compra: ");
        int fecha = sc.nextInt();
        orden.setFecha(fecha);

        System.out.println("Por favor ingrese la descrpcion del producto: ");
        String descripcion = sc.next();
        orden.setDescripcion(descripcion);

        System.out.println("Por favor ingrese el codigo del producto: ");
        int codigo = sc.nextInt();
        orden.setProducto(codigo);

        System.out.println("Por favor ingrese el numero de compra: ");
        int num = sc.nextInt();
        orden.setNum(num);

        System.out.println("Por favor ingrese la cnatidad de productos que desea añadir ");
        int cantidad = sc.nextInt();

        int pos = -1;
        for (int i = 0; i < 3; i++) {
            if (productos[i].getCodigo() == codigo) {
                pos = i;
            }
        }

        while (!productos[pos].verificarExistencias(productos, codigo, cantidad, pos)) {
            System.out.println("Por favor ingrese una cantidad de productos valida ");
            cantidad = sc.nextInt();
        }

        System.out.println("Orden de compra generada, mostrando..");
        System.out.println("...");
        System.out.println("Cantidad a comprar " + orden.getCantidadComprar());
        System.out.println("Fecha de compra " + orden.getFecha());
        System.out.println("DNI del proveedor " + orden.getDniProveedor());
        System.out.println("codigo del Producto seleccionado " + orden.getProducto());
        System.out.println("Numero de compra " + orden.getNum());
        System.out.println("Producto adquirido " + orden.getDescripcion());

        System.out.println("Ingrese el dni del proveedor del que desea verificar las ordenes de compra asociadas ");
        int dniComprobar = sc.nextInt();
        if (orden.getDniProveedor() == dniComprobar) {
            System.out.println("Orden asociada al proveedor " + orden.getNum());
        }
    }
}

