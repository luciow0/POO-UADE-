public class Main {
    public static void main(String[]args){

        System.out.println(new Velocista(123,"Lucio",26,500,30).getPotenciaPromedio());

        Velocista X = new Velocista(123,"Lucio",26,500,30);
        System.out.println(X.getPotenciaPromedio());
        System.out.println(X.getVelocidadPromedio());
        System.out.println(X.imprimirTipo());
        System.out.println(X.getNombreCiclista());
        System.out.println(X.getTiempoCarrera());
    }
}
