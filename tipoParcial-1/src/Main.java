import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // HARDCODE COMPRAS DE SOCIOS
        // ---------------------------------------------------------------------------------------

        Compra compra1 = new Compra(10000, 6666, 215, "banana phone", 911, 10);
        //compra1.setImporte(10000);
        //compra1.setNumTarjeta(111);
        //compra1.setDni(6666);
        //compra1.setCodigo(215);
        //compra1.setDescripcion("banana phone");
        //compra1.setFecha(911);
        //compra1.setCantidad(10);

        Compra compra2 = new Compra(15000, 7777, 315, "Sarandear la maracatunga", 912, 20);
        //compra2.setImporte(15000);
        //compra2.setNumTarjeta(222);
        //compra2.setDni(7777);
        //compra2.setCodigo(315);
        //compra2.setDescripcion("Sarandear la maracatunga");
        //compra2.setFecha(912);
        //compra2.setCantidad(20);

        Socio socio1 = new Socio(6666, "manolo", "avenida jose juan 123", 3447, 111, 500);
        //socio1.setDni(6666);
        //socio1.setNombre("manolo");
        //socio1.setDomicilio("avenida jose juan 123");
        //socio1.setTelefono(3447);
        //socio1.setNumTarjeta(111);
        //socio1.setPuntos(500);


        Socio socio2 = new Socio(777, "pepito", "avenida el perro maquiavelico roude 666", 3449, 222, 777);
        //socio2.setDni(7777);
        //socio2.setNombre("pepito");
        //socio2.setDomicilio("avenida el perro maquiavelico roude 666");
        //socio2.setTelefono(3449);
        //socio2.setNumTarjeta(222);
        //socio2.setPuntos(777);


        // ---------------------------------------------------------------------------------

        Scanner sc  = new Scanner(System.in);
        Socio socioUsuario = new Socio();
        Compra compraUsuario = new Compra();

        System.out.println("Esta usted creando un nuevo usuario como socio en la COOPERATIVA ARROCEROS");
        System.out.println("Ingrese su DNI: ");
        int dni = sc.nextInt();
        socioUsuario.setDni(dni);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.next();
        socioUsuario.setNombre(nombre);

        System.out.println("Ingrese su domicilio: ");
        String domicilo = sc.next();
        socioUsuario.setDomicilio(domicilo);

        System.out.println("Ingrese su telefono: ");
        int telefono = sc.nextInt();
        socioUsuario.setTelefono(telefono);

        System.out.println("Ingrese su numero de tarjeta, -1 en caso de no poseer una: ");
        int numTarjeta = sc.nextInt();
        socioUsuario.setNumTarjeta(numTarjeta);
        boolean flagDesc;
        if(numTarjeta == -1){
            flagDesc = false;
        }
        else{
            flagDesc = true;
        }

        //todo esto no va aca


        // ------------------------------------------------------------------------------------

        System.out.println("Registrando nueva compra ");
        System.out.println("...");

        System.out.println("Indique el importe de su compra: ");
        double importe = sc.nextInt();
        System.out.println("Calcuando descuento de su importe en base a sus puntos.. ");
        System.out.println("...");
        int puntos;
        if(!flagDesc){
            puntos = socioUsuario.getPuntos();
            puntos += 10;
            socioUsuario.setPuntos(puntos);
        }
        else{
            puntos = socioUsuario.getPuntos();
            puntos += 20;
            socioUsuario.setPuntos(puntos);
        }
        double descuento = socioUsuario.calcularDescuento(puntos, socioUsuario);
        importe = importe * descuento;
        System.out.println("Su importe ahora es " + importe);
        compraUsuario.setImporte(importe);



        System.out.println("indique su DNI: ");
        dni = sc.nextInt();
        compraUsuario.setDni(dni);

        System.out.println("Indique el codigo de producto: ");
        int codigo = sc.nextInt();
        compraUsuario.setCodigo(codigo);

        System.out.println("Indique la descripcion del producto: ");
        String descripcion = sc.next();
        compraUsuario.setDescripcion(descripcion);

        System.out.println("Indique la fecha de la compra");
        int fecha = sc.nextInt();
        compraUsuario.setFecha(fecha);

        System.out.println("Indique la cantidad deseada del producto: ");
        int cantidad = sc.nextInt();
        compraUsuario.setCantidad(cantidad);



        System.out.println("Ingrese el DNI de el cliente acerca de el cual desea averiguar la cantidad de compras");
        dni = sc.nextInt();





        // aca la logica re piola que tuve que dejar de lado

        /* int cantidadDeSocios;
        System.out.println("Ingrese la cantidad de socios que posee la coperativa ");
        cantidadDeSocios = sc.nextInt();

        Socio[] socios = new Socio[cantidadDeSocios];

        for (int i = 0; i < cantidadDeSocios; i++) {
             socios[i] = new Socio();

            System.out.println("Ingrese el nombre de el nuevo socio ");
            String nombre = sc.next();
             socios[i].setNombre(nombre);

            System.out.println("Ingrese el DNI de el socio ");
            int dni = sc.nextInt();
            socios[i].setDni(dni);

            System.out.println("Ingrese el telefono de el socio ");
            int tel = sc.nextInt();
            socios[i].setTelefono(tel);

            System.out.println("Ingrese el domicilio de el socio ");
            String domicilio = sc.next();
            socios[i].setDomicilio(domicilio);

            System.out.println("El socio posee tarjeta de cooperativa? 'true' para si, 'flase' para no ");
            boolean flag = sc.nextBoolean();

            if (flag) {
                System.out.println("Ingrese el numero de tarjeta de el socio ");
                int numTarjeta = sc.nextInt();
                socios[i].setNumTarjeta(numTarjeta);

            }

            // ------------------------------------------------------------------------------------

            System.out.println("Ingrese el numero de dni de socio que desea realizar la compra ");
             dni = sc.nextInt();

            System.out.println("Ingrese la cantidad de compras que desea realizar ");
                 int cantidadCompras = sc.nextInt();
                 Compra compras[] = new Compra[cantidadCompras];
                 for(i = 0; i < cantidadCompras; i ++){
                     compras[i] = new Compra();

                     compras[i].setDni(dni);

                     System.out.println("Ingrese el codigo de compra ");
                     int codigo = sc.nextInt();
                     compras[i].setCodigo(codigo);

                     System.out.println("Ingrese el importe de compra ");
                     int importe = sc.nextInt();
                     compras[i].setImporte(importe);

                     System.out.println("Ingrese el numero de tarjeta de el cliente, -1 si no tiene ");
                     int numTarjeta = sc.nextInt();
                     compras[i].setNumTarjeta(numTarjeta);

                     int posSoc = 0;
                     for (i = 0; i < cantidadDeSocios; i ++){
                         if (dni == socios[i].getDni()) {
                             posSoc = i;
                         }
                     }

                     if (numTarjeta != -1){
                         int puntos = socios[posSoc].getPuntos();
                         puntos += 10;
                         socios[posSoc].setPuntos(puntos);
                     }
                     else{
                        int puntos = socios[posSoc].getPuntos();
                        puntos += 20;
                        socios[posSoc].setPuntos(puntos);
                     }

                     System.out.println("Ingrese la descripcion del producto ");
                     String descripcion = sc.next();
                     compras[i].setDescripcion(descripcion);

                     System.out.println("Ingrese la cantidad de el producto");
                     int cantidad = sc.nextInt();
                     compras[i].setCantidad(cantidad);

                     System.out.println("Ingrese la fecha de la compra");
                     int fecha = sc.nextInt();
                     compras[i].setFecha(fecha);
                 }
        } */
    }
}