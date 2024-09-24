import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class EmitirPasaje {
    public static void main(String[] args) {

        SolicitarReserva reserva = new SolicitarReserva();

        List<String> listaDeCiudades = new ArrayList<>(Arrays.asList("Moscu", "Denber", "Buenos aires", "Nueva York", "Sao Pablo", "Rio de Janeiro", "Paris", "Roma", "Villa Elisa"));
        List<String> listaDeFechasMasTempranas = new ArrayList<>(Arrays.asList("11/05/2025", "12/05/2025", "13/05/2025", "14/05/2025", "15/05/2025", "16/05/2025", "17/05/2025", "18/05/2025", "19/05/2025"));
        List<String> listaDeFechasMasTardias = new ArrayList<>(Arrays.asList("Hola", "Mundo", "Java"));
        List<String> listaDeClases = new ArrayList<>(Arrays.asList("Hola", "Mundo", "Java"));
        List<String> listaDeSectores = new ArrayList<>(Arrays.asList("Hola", "Mundo", "Java"));




        reserva.getCiudad();
        reserva.getFechaMasTemprana();
        reserva.getFechaMasTardia();
        reserva.getClase();
        reserva.getSector();


    }
}
