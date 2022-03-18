public class Persona {
    private String nombre;
    private Integer edad;

    void printPersona() {
        System.out.println("El nombre de la persona es: "+nombre+" y su edad es de: "+edad );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
