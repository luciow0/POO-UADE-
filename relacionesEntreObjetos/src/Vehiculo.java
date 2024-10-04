public class Vehiculo {
    private String marca;
    private String referencia;
    private String modelo;
    private String placa;
    private String color;
    private int valor;

    public void crearVehiculo(String marca, String referencia, String modelo, String placa, String color, int valor) {
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.valor = valor;
    }

    public void cambiarValor(int valorNuevo){
        this.valor = valorNuevo;
    }

    public double calcularImpuesto(){
        //ni idea
    }

}
