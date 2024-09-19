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

        // ingreso del tipo de cuenta
        // establezco tipo cuenta en null para que entre directamente en el bucle y validar
        String tipoCuenta = null;
        // Validación del tipo de cuenta
        while (tipoCuenta == null || (!tipoCuenta.equals("cuenta de ahorros") && !tipoCuenta.equals("cuenta corriente"))) {
            System.out.println("Ingrese un tipo de cuenta válido (cuenta de ahorros o cuenta corriente): ");
            tipoCuenta = scanner.nextLine();
            cuenta.setTipoDeCuenta(tipoCuenta);
        }

        // ingreso saldo de cuenta
        System.out.println("ingrese el saldo de su cuenta bancaria ");
        int saldo = scanner.nextInt();
        cuenta.setSaldoDeCuenta(saldo);

        // mostrar datos por pantalla
        System.out.println(cuenta.getNombreDelTitular());
        System.out.println(cuenta.getApellidosDelTitular());
        System.out.println(cuenta.getNumeroDeCuenta());
        System.out.println(cuenta.getTipoDeCuenta());
        System.out.println(cuenta.getSaldoDeCuenta());

        // consulta del saldo de cuenta actualizado
        System.out.println("Desea consultar el saldo de su cuenta? responda 'true' para si, 'false' para no ");
        boolean consultarSaldo = scanner.nextBoolean();
        if(consultarSaldo == true)
            System.out.println(cuenta.getSaldoDeCuenta());
        else
            System.out.println("ok");

        // actualizar saldo de cuenta
        System.out.println("Desea actualizar el saldo de su cuenta? ingrese el valor actualizado ");
        int saldoActualizado = scanner.nextInt();
        System.out.println("Su saldo ahora es: ");
        System.out.println(cuenta.actualizarSaldo(saldoActualizado));

        // retiro de dinero
        System.out.println("ingrese la cantidad de dinero que desea retirar de la cuenta ");
        int dineroRetirado = scanner.nextInt();
        System.out.println("retirando de su cuenta : " + dineroRetirado);
        saldoActualizado = cuenta.retirarSaldo(dineroRetirado);
        System.out.println("su saldo ahora es " + saldoActualizado);



    }

}
