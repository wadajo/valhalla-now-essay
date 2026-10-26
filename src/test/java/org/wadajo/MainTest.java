package org.wadajo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void debeDiferenciarDosEjemplaresDelMismoLibro() {
        var ejemplar1=new Libro(1L,"Autor 1","Titulo 1");
        var ejemplar2=new Libro(1L,"Autor 1","Titulo 1");
        assertNotEquals(ejemplar1, ejemplar2);
    }
}