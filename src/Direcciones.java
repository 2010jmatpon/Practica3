public class Direcciones {
    private String calle;
    private Integer numero;
    private String puerta;
    private Integer codPostal;
    private String localidad;
    private String provincia;

    Direcciones(

    ){}

    String getCalle() {
        return calle;
    }

    void setCalle(String calle) {
        this.calle = calle;
    }

    Integer getNumero() {
        return numero;
    }

    void setNumero(Integer numero) {
        this.numero = numero;
    }

    String getPuerta() {
        return puerta;
    }

    void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Integer getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void Direccion(){
        System.out.println("El alumno vive en la calle " + getCalle() + " en el número " + getNumero() + " y en la puerta " + getPuerta() + " en la localidad de " + getLocalidad()+ " con código postal  " + getCodPostal()  + " de la provincioa de" + getProvincia());
    }
}
