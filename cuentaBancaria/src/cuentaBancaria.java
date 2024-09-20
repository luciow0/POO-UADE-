public class cuentaBancaria {

    // variables
    String nombreDelTitular;
    String apellidosDelTitular;
    int numeroDeCuenta;
    String tipoDeCuenta;
    int saldoDeCuenta;
    float porcentajeDeInteresMensual =  0.90f; //hardcodeado
    boolean actividad;

    // constuctor
    public cuentaBancaria(String nombreDelTitular, String apellidosDelTitular, int numeroDeCuenta, String tipoDeCuenta,  int saldoDeCuenta) {
        this.nombreDelTitular = getNombreDelTitular();
        this.apellidosDelTitular = apellidosDelTitular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldoDeCuenta = 0;
    }

    // constructor vacio
    public cuentaBancaria() {}

    // geters y seters
    public String getNombreDelTitular() {
        return nombreDelTitular;
    }

    public void setNombreDelTitular(String nombreDelTitular) {
        this.nombreDelTitular = nombreDelTitular;
    }

    public String getApellidosDelTitular() {
        return apellidosDelTitular;
    }

    public void setApellidosDelTitular(String apellidosDelTitular) {
        this.apellidosDelTitular = apellidosDelTitular;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public int getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public void setSaldoDeCuenta(int saldoDeCuenta) {
        this.saldoDeCuenta = saldoDeCuenta;
    }

    // metodo actualizar saldo
    public int actualizarSaldo(int saldoActualizado) {
        this.saldoDeCuenta = saldoActualizado;
        return this.saldoDeCuenta;
    }

    // metodo retirar dinero
    public int retirarSaldo(int dineroRetirado){
        this.saldoDeCuenta -= dineroRetirado;
        return this.saldoDeCuenta;
    }

    // metodo aplicar taza de interes
    public int aplicarInteres(){
        this.saldoDeCuenta *= porcentajeDeInteresMensual ;
        return this.saldoDeCuenta;
    }

    // metodo comparar saldo cuentas
    public boolean compararCuentas(cuentaBancaria cuentaCompararUno, cuentaBancaria cuentaCompararDos){
        if(cuentaCompararUno.getSaldoDeCuenta() > cuentaCompararDos.getSaldoDeCuenta()){
            return true;
        }
        else{
            return false;
        }
    }

    // metodo transferir dinero a cuenta
    public void transferirDinero(cuentaBancaria cuentaBancariaTransferir, cuentaBancaria cuentaBancariaRecibir, int saldoTransferir){

        if(cuentaBancariaTransferir.retirarSaldo(saldoTransferir) < 0){
            System.out.println("La cuenta no posee los fondos necesarios para realizar esta transaccion ");
        }
        else {
        cuentaBancariaTransferir.retirarSaldo(saldoTransferir);
        int saldoNuevo = cuentaBancariaRecibir.getSaldoDeCuenta();
        saldoNuevo += saldoTransferir;
        cuentaBancariaRecibir.setSaldoDeCuenta(saldoNuevo);
        }
    }

    public boolean activarDesactivar(cuentaBancaria cuenta){
        if (cuenta.getSaldoDeCuenta() < 0){
            actividad = false;
        }
        else{
            actividad = true;
        }

        return actividad;
    }

}
