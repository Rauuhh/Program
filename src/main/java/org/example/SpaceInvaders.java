package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceInvaders {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int tamano = entrada.nextInt();
        String[][] matriz = new String[tamano][3];
        for (int i = 0; i < matriz.length; i++) {
            String[] aux = entrada.next().split("");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = aux[j];
            }
        }
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]);
            }
        }
    }
}
