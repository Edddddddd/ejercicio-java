public class Hombre extends Persona {

    private String genero;

    public Hombre ( String genero, String nombre, Integer edad) {
        this.genero = genero;
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public Hombre () {
    }

    public void printHombre () {
        System.out.println("El nombre del hombre es: "+getNombre()+" y su edad es de: "+getEdad() + " y es un " + genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
