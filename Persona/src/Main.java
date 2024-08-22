public class Main
{
    public static void main(String[] args)
    {
        Persona lucio = new Persona();
        lucio.darNombre("Lucio Claa");

        for (int i =0; i<25; i++)
        {
            lucio.cumplirAnios();
        }

        System.out.println("Lucio tiene " + lucio.decirEdad() + " años de edad.");

        System.out.println();

    }
}
