/*package org.example;

import java.util.Scanner;

public class Problema158 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int arriba = 0;
        int abajo = 0;
        int tamano = entrada.nextInt();
        int[] vector = new int [tamano];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = entrada.nextInt();
        }

        for (int i = 0; i < vector.length -1; i++) {

                if (vector[i] > vector[i + 1]) {
                    abajo++;
                } else if(vector [i+1] > vector[i]) {
                    arriba++;
                }
            }

        System.out.println(arriba + " " + abajo);
    }
}

public class solution { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static void casoDePrueba() {

        int arriba = 0;
        int abajo = 0;
        int tamano = in.nextInt();
        int[] vector = new int [tamano];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = in.nextInt();
        }

        for (int i = 0; i < vector.length -1; i++) {

            if (vector[i] > vector[i + 1]) {
                abajo++;
            } else if(vector [i+1] > vector[i]) {
                arriba++;
            }
        }

        System.out.println(arriba + " " + abajo);

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}

 */