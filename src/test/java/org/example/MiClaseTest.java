package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MiClaseTest {

    @org.junit.jupiter.api.Test
    void dia_laboral() {

        assertEquals(true,MiClase.dia_laboral("Lunes"));
    }
}