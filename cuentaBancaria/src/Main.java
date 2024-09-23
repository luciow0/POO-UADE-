import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        cuentaBancaria cuenta = new cuentaBancaria();

        // segunda cuenta para comunicarse con la otra, hardcodeada
        cuentaBancaria cuentaDos = new cuentaBancaria();
        cuentaDos.setNombreDelTitular("El perro");
        cuentaDos.setApellidosDelTitular("Roude");
        cuentaDos.setNumeroDeCuenta(592931);
        cuentaDos.setTipoDeCuenta("cuenta corriente");
        cuentaDos.setSaldoDeCuenta(45000);


        // ingreso del nombre
        System.out.println("Ingrese el nombre de su cuenta bancaria: ");
        String nombre = scanner.next();
        cuenta.setNombreDelTitular(nombre);

        // ingreso de el/ los apellidos
        System.out.println("Ingrese los apellidos del titular: ");
        String apellidos = scanner.next();
        cuenta.setApellidosDelTitular(apellidos);

        // ingreso del numero de cuenta
        System.out.println("Ingrese su numero de cuenta: ");
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
        System.out.println("Ingrese el saldo de su cuenta bancaria: ");
        int saldo = scanner.nextInt();
        cuenta.setSaldoDeCuenta(saldo);

        System.out.println("Determinando actividad de su cuenta, esto podria demorar unos segundos.. ");
        System.out.println("...");
        if(cuenta.activarDesactivar(cuenta)){
            System.out.println("Cuenta activa");
        }
        else {
            System.out.println("Cuenta inactiva");
        };


        // mostrar datos por pantalla
        System.out.println(" ");
        System.out.println("------------------------------------------------");
        System.out.println("MOSTRANDO LOS DATOS INGRESADOS: ");
        System.out.println("Nombre del titular: " + cuenta.getNombreDelTitular());
        System.out.println("Apellido/s del titular: " + cuenta.getApellidosDelTitular());
        System.out.println("Numero de cuenta del titular: " + cuenta.getNumeroDeCuenta());
        System.out.println("Tipo de cuenta: " + cuenta.getTipoDeCuenta());
        System.out.println("Saldo de cuenta: " + cuenta.getSaldoDeCuenta());
        System.out.println("------------------------------------------------");
        System.out.println(" ");

        // consulta del saldo de cuenta actualizado
        System.out.println("Desea consultar el saldo de su cuenta? responda 'true' para si, 'false' para no:  ");
        boolean consultarSaldo = scanner.nextBoolean();
        if(consultarSaldo)
            System.out.println("Saldo de cuenta: " + cuenta.getSaldoDeCuenta());
        else
            System.out.println("Perfecto! ");

        // actualizar saldo de cuenta
        System.out.println("Actualizacion de el saldo de su cuenta, ingrese el valor actualizado:  ");
        int saldoActualizado = scanner.nextInt();
        System.out.println("Su saldo ahora es: ");
        System.out.println(cuenta.actualizarSaldo(saldoActualizado));

        // retiro de dinero
        System.out.println("Ingrese la cantidad de dinero que desea retirar de la cuenta: ");
        int dineroRetirado = scanner.nextInt();
        System.out.println("Retirando de su cuenta: " + dineroRetirado);
        saldoActualizado = cuenta.retirarSaldo(dineroRetirado);
        if (cuenta.activarDesactivar(cuenta) == false){
            System.out.println("Cuenta con fondos menores iguales a 0, inactivando");
        }
        System.out.println("Su saldo ahora es " + saldoActualizado);

        // aplicar taza de interes
        saldoActualizado = cuenta.aplicarInteres();
        System.out.println("Su saldo se ha actualizado aplicando la taza de interes correpondiente del 10%, ahora es: " + saldoActualizado);

        // comparar saldos entre cuentas

        boolean saldoComparar = cuentaDos.compararCuentas(cuentaDos, cuenta);
        if(saldoComparar){
            System.out.println("El saldo de la cuenta de El Perro Roude es mayor al tuyo");
        }
        else {
            System.out.println("El saldo de tu cuenta es mayor al de la cuenta de El Perro Roude ");
        }

        // transferir plata entre cuentas
        System.out.println("Determinando si es posible transferir dinero al El Perro Roude, esto podria demorar unos segundos..");
        System.out.println("...");
        if (cuentaDos.activarDesactivar(cuentaDos)){
            System.out.println("Cuenta activa");
            System.out.println("Ingrese la cantidad de dinero que desea transferir a El Perro Roude: ");
            int dineroTransferir = scanner.nextInt();
            cuenta.transferirDinero(cuenta, cuentaDos, dineroTransferir);
            System.out.println("Transaccion realizada! ahora su dinero es: " + cuenta.getSaldoDeCuenta());
            System.out.println("Dinero en la cuenta de El Perro Roude " + cuentaDos.getSaldoDeCuenta());
        }
        else {
            System.out.println("Cuenta de El Perro Roude inactiva, no es posible enviar dinero ");
        }

    }

}
