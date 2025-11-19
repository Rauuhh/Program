package org.example;

import java.util.Arrays;

public class Matrices {
    static void main() {

        int[][] matriz ={{1,2,3},{4,5,6},{6,7,8}};
        hola:
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = matriz[0].length -1 -i ; j >= 0; j--) {
                    System.out.print(matriz[i][j]  + " ");
                    continue hola;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------");


        int[][] matriz1 = {{1,2,3},{6,7,8},{10,8,15}};
        int[][] matriz2 = {{5,1,4},{7,3,11},{11,12,13}};
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[0].length; j++) {
                if (matriz1[i][j] > matriz2[i][j]){
                    matriz3[i][j] = matriz1[i][j];
                }else{
                    matriz3[i][j] = matriz2[i][j];

                }
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[0].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
