import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        cuentaBancaria cuenta = new cuentaBancaria();

        // ingreso del nombre
        System.out.println("ingrese el nombre de su cuenta bancaria ");
        String nombre = scanner.next();
        cuenta.setNombreDelTitular(nombre);

        // ingreso de el/ los apellidos
        System.out.println("ingrese los apellidos del titular ");
        String apellidos = scanner.next();
        cuenta.setApellidosDelTitular(apellidos);

        // ingreso del numero de cuenta
        System.out.println("ingrese su numero de cuenta ");
        int numeroCuenta = scanner.nextInt();
        cuenta.setNumeroDeCuenta(numeroCuenta);

        //ingreso del tipo de cuenta
        System.out.println("ingrese su tipo de cuenta (cuenta de ahorros o cuenta corriente) ");
        String tipoCuenta = scanner.next();

        // Validación del tipo de cuenta
        while (!tipoCuenta.equals("cuenta de ahorros") && !tipoCuenta.equals("cuenta corriente")) {
            System.out.println("Ingrese un tipo de cuenta válido (cuenta de ahorros o cuenta corriente): ");
            tipoCuenta = scanner.next();
        }

        // ingreso saldo de cuenta
        System.out.println("ingrese el nombre de su cuenta bancaria ");
        int saldo = scanner.nextInt();
        cuenta.setSaldoDeCuenta(saldo);



        System.out.println(cuenta.getNombreDelTitular());
        System.out.println(cuenta.getApellidosDelTitular());
        System.out.println(cuenta.getNumeroDeCuenta());
        System.out.println(cuenta.getTipoDeCuenta());
        System.out.println(cuenta.getSaldoDeCuenta());
    }

}
