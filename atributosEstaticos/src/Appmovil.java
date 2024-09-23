public class Appmovil {
    private String nombre;
    private String proveedor;
    private int versionActual;
    public static int ultimaVersion;

    public Appmovil(String nombre, String proveedor) {
        this.nombre = nombre;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getVersionActual() {
        return versionActual;
    }

    public int getUltimaVersion(){
        return ultimaVersion;
    }

    public static void setUltimaVersion(int ultimaVersion) {
        Appmovil.ultimaVersion = ultimaVersion;
    }

    public void setVersionActual(int versionActual) {
        this.versionActual = versionActual;
    }

    public int actualizar(){
        return versionActual++;
    }

    public String consultarActualizacion(){
        if (versionActual<ultimaVersion){
            return "aplicacion desactualizada";
        }
        else {
            return "aplicacion en su ultima version";
        }
    }
}
