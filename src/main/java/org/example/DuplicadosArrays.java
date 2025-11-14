package org.example;

import java.util.Arrays;

public class DuplicadosArrays {
    static void main() {
        int[] vector = {1,2, 2, 3, 4, 6, 7, 7};
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                if (vector[i] == vector[i + 1]) {
                    contador++;
                }
            }
        }
        int[] vectorsin = new int[vector.length - contador];
        contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                if (vector[i] != vector[i + 1]) {
                    vectorsin[contador] = vector[i];
                    contador++;
                }
            }
        }
        vectorsin[contador] = vector[vector.length - 1];
        System.out.println(Arrays.toString(vectorsin));

    }
}
