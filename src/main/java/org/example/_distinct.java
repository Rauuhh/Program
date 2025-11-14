package org.example;

import java.util.Arrays;
import java.util.Random;

public class _distinct {
    static void main() {
        /*
        int numeritos[] = {1,2,2,3,4,5,5,6,7,8,8};
        int numerosdistinct[] = Arrays.stream(numeritos).distinct().toArray();
        System.out.println(Arrays.toString(numerosdistinct));
         */
        Random aleatorio = new Random();
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(10) +1;
        }

        boolean estado = true;
        while (estado) {
            estado = false;
            Arrays.sort(numeros);
            for (int i = 0; i < numeros.length; i++) {
                if (i != numeros.length - 1 && numeros[i] == numeros[i + 1]) {
                    numeros[i] = aleatorio.nextInt(10) + 1;
                    estado = true;
                }
            }
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
