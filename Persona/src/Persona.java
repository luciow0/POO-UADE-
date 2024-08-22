public class Persona
{
    private String nombre;
    private int edad;

    public void darNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public void cumplirAnios()
    {
        //this.edad=this.edad + 1;
        this.edad++;
    }

    public String saludar()
    {
        return "Hola, soy" + this.nombre;
    }

    public String decirNombre()
    {
        return this.nombre;
    }

    public int decirEdad()
    {
        return this.edad;
    }

    public void caminar()
    {
        System.out.println("Estoy caminando");
    }
}
