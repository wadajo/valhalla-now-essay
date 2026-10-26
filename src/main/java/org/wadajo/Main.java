package org.wadajo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println("Hello and welcome!");

        var ejemplar1 = obtenerUnEjemplar();
        IO.println(ejemplar1);

        var ejemplar2 = obtenerUnEjemplar();
        IO.println(ejemplar2);

    }

    public static Libro obtenerUnEjemplar() {
        return new Libro(1L, "Borges", "El libro de arena");
    }
}
