public class EjercicioMain {
    public static void main(String[] args) {

        Hombre hombre = new Hombre();
        Mujer mujer = new Mujer();

        Hombre hombre1 = new Hombre( "Masculino", "Eduardo", 27);
        hombre1.printHombre();

        mujer.setEdad(29);
        mujer.setNombre("Loreto");

        hombre.setEdad(27);
        hombre.setNombre("Eduardo");

        hombre.setGenero("hombre");
        mujer.setGenero("Mujer");

        hombre.printHombre();
        mujer.printMujer();
        hombre.printPersona();
        mujer.printPersona();

        mujer.setNombre("Loreto Lucero");
        mujer.printMujer();


    }
}
