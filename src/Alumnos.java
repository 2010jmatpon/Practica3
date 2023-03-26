public class Alumnos {
    private String nombre;
    private String apellido1;
    private String apellido2;

    private Integer edad;
    private String esRepetidor;
    private float notaMedia;
    private String correoElectronico;
    protected Direcciones direccion;

    Alumnos(){
    }
    Alumnos(String nombre, String apellido1, String apellido2, Integer edad){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;
    }


    float notaMedia (float unaNota,float otraNota){
        float mayor;
        mayor=Math.max(unaNota,otraNota);
        return mayor;
    }



    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getApellido1() {
        return apellido1;
    }

    void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    String getApellido2() {
        return apellido2;
    }

    void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    Integer getEdad() {
        return edad;
    }

    void setEdad(Integer edad) {
        this.edad = edad;
    }

    String getRepetidor() {
        return esRepetidor;
    }

    void setRepetidor(String esRepetidor) {
        this.esRepetidor = esRepetidor;
    }

    double getNotaMedia() {
        return notaMedia;
    }

    void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    String getCorreoElectronico() {
        return correoElectronico;
    }

    void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }
}

