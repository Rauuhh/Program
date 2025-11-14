package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria{
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int[] combinacion = new int[6];
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i] = aleatorio.nextInt(49) + 1;
        }
        boolean estado = true;
        Arrays.sort(combinacion);
        while (estado) {
            estado = false;
            for (int i = 0; i < combinacion.length; i++) {
                if (i != combinacion.length -1  && combinacion[i] == combinacion[i + 1]) {
                   combinacion[i] = aleatorio.nextInt(49) + 1;
                    estado = true;
                }
            }
        }
        System.out.println();
        Arrays.sort(combinacion);
        System.out.println(Arrays.toString(combinacion));
    }
}
