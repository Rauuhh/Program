package org.example;// Esquema de la entrada: número de casos
import java.util.*;

public class Solution {

    static Scanner in;

    public static void casoDePrueba() {

        int tamano = in.nextInt();
        String[][] matriz = new String[tamano][3];
        for (int i = 0; i < matriz.length; i++) {
            String linea = in.next();
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = linea.charAt(j) + "";
            }
        }
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]);
            }
        }
        System.out.println();
    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    } // main

}