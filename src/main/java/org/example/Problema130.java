package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Problema130 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int tamano = entrada.nextInt();
        int matriz[][] = new int[tamano][tamano];
        entrada.nextLine();

        String cor = entrada.nextLine();
        String[] coor = cor.split(" ");
        System.out.println(Arrays.toString(coor));

        matriz[Integer.parseInt(coor[1])][Integer.parseInt(coor[0])] = 1;
        matriz[Integer.parseInt(coor[3])][Integer.parseInt(coor[2])] = 1;
        for (int i = matriz.length -1  ; i >= 0; i--) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }
}
