public class cuentaBancaria {
    String nombreDelTitular;
    String apellidosDelTitular;
    int numeroDeCuenta;
    String tipoDeCuenta;
    int saldoDeCuenta;

    public cuentaBancaria(String nombreDelTitular, String apellidosDelTitular, int numeroDeCuenta, String tipoDeCuenta,  int saldoDeCuenta) {
        this.nombreDelTitular = getNombreDelTitular();
        this.apellidosDelTitular = apellidosDelTitular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldoDeCuenta = 0;
    }

    public cuentaBancaria() {} // constructor vacio

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

    public int actualizarSaldo(int saldoActualizado) {
        this.saldoDeCuenta = saldoActualizado;
        return this.saldoDeCuenta;
    }

    public int retirarSaldo(int dineroRetirado){
        this.saldoDeCuenta -= dineroRetirado;
        return this.saldoDeCuenta;
    }
}
