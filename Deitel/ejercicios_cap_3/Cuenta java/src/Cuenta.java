//clase cuenta que contiene una variable de instancia llamada nombre
//y metodos para establecer su valor

public class Cuenta
{
    private String nombre;
    // variable de instancia, siempre se declaran antes de los metodos de la clase
    // los atributos de los objetos son las variables de instancia, que existen antes durante y despues de la ejecucion del objeto
    // cada objeto (instancia) tiene su propia copia de las variables de instancia de la clase
    // puesto que es una variable de instancia, muchos objetos cuenta pueden tener su propio nombre que cada uno de los metodos de la clase

    //metodo para establecer el nombre en el objeto
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre; //almacenar nombre
        //cuando un metodo hace referencia a una variable, no lo hace a la variable de instancia sino a la variable local dentro del meto
    }

    //metodo para obtener el nombre del objeto
    public String obtenerNombre()
    {
        return nombre;  //devuelve el valor de nombre a quien lo invoco
    }
}