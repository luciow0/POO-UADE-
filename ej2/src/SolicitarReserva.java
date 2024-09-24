public class SolicitarReserva {
    private String ciudad;
    private String fechaMasTemprana;
    private String fechaMasTardia;
    private String clase;
    private String sector;

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setFechaMasTemprana(String fechaMasTemprana) {
        this.fechaMasTemprana = fechaMasTemprana;
    }
    public void setFechaMasTardia(String fechaMasTardia) {
        this.fechaMasTardia = fechaMasTardia;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCiudad() {
        return ciudad;
    }
    public String getFechaMasTemprana() {
        return fechaMasTemprana;
    }
    public String getFechaMasTardia() {
        return fechaMasTardia;
    }
    public String getClase() {
        return clase;
    }
    public String getSector() {
        return sector;
    }


}
