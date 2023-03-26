public class Main {
    public static void main(String[] args) {
        Alumnos juan = new Alumnos();
        juan.setNombre("Juan");
        juan.setApellido1("Román");
        juan.setApellido2("Riquelme");
        juan.setEdad(18);
        System.out.println(juan.getNombre()+" "+juan.getApellido1()+ " " + juan.getApellido2() + " tiene " + juan.getEdad());

        Direcciones direccion = new Direcciones();
        direccion.setCalle("Calle Los Naranjos");
        direccion.setNumero(47);
        direccion.setPuerta("3ºA");
        direccion.setCodPostal(11600);
        direccion.setLocalidad("Ubrique");
        direccion.setProvincia("Cádiz");
        System.out.println("El alumno vive en " + direccion.getCalle() + " en el número " + direccion.getNumero() + " y en la puerta " + direccion.getPuerta() + " en la localidad de " + direccion.getLocalidad()+ " con código postal  " + direccion.getCodPostal()  + "de la provincia de " + direccion.getProvincia());

        Alumnos ruben = new Alumnos();
       juan.setNotaMedia(4.65f);
       ruben.setNotaMedia(3.43f);
        float resultado=juan.notaMedia((float) juan.getNotaMedia(), (float) ruben.getNotaMedia());
        System.out.println(resultado);
    }
}
