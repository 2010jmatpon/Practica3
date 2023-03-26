public class Casa {
    //Define una clase de nombre Casa que cumpla con las siguientes restricciones:
    private Integer precio;
    private Character calificacionEnergetica;
    private String referenciaCatastral;
    private final Integer Iva=21;
    private final Integer IvaReducido=16;
    protected Direcciones direccion;

    Casa() {
    }

    Integer precioConIva(Integer precio){
        Integer precioIva;
        precioIva=(precio*Iva/100)+precio;
        return precioIva;
    }

    Integer precioConIvaReducido(Integer precio){
        Integer precioConIva;
        precioConIva=(precio*IvaReducido/100)+precio;
        return precioConIva;
    }

    void imprimeRefereciaCatastralPrecioSinIvaConIvaReducido(String refrCatastral, Integer precio){
        System.out.println(this.referenciaCatastral);
        System.out.println(this.precio);
        System.out.println(this.precioConIva(this.precio));
        System.out.println(this.precioConIvaReducido(this.precio));
    }

    public Direcciones getDireccion(){
        return direccion;
    }

    public void setDireccion(Direcciones direccion){
        this.direccion=direccion;
    }
}