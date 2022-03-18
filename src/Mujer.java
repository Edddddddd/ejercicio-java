public class Mujer extends Persona {
    private String genero;

    public void printMujer () {
        System.out.println("El nombre de la mujer es: "+getNombre()+" y su edad es de: "+getEdad() + " y es un " + genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
