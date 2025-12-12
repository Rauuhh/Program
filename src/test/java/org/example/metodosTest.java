package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class metodosTest {

    @Test
    void cubo() {
        assertAll(
                () -> assertEquals(8 ,metodos.cubo(2)),
                () -> assertEquals(27, metodos.cubo(3)),
                () -> assertFalse(metodos.par(3))
        );
    }


}