package org.example;

import java.util.Scanner;

public class Programa171 {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int montaña = entrada.nextInt();
        int[] vector = new int [montaña];
        int abadias = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = entrada.nextInt();
        }
        int mayor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length -1) {
                continue;
            }else{
                if (mayor > vector[i + 1]) {
                    abadias++;
                } else {
                    abadias = 0;
                    mayor = vector[i + 1];
                }
            }
        }
        System.out.println(abadias);
    }
}
