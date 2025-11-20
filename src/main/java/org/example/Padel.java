package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Padel {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[4];
        int total = 0;
        System.out.println("Introduce el portentaje de los 4 factores externos (compi-pista-pala-pelota):");
        try {


            for (int i = 0; i < vector.length; i++) {
                vector[i] = entrada.nextInt();
                if (vector[i] < 1 || vector[i] > 90) {
                    System.out.println("Valor no valido");
                    return;
                }
                total += vector[i];
            }
        }catch (InputMismatchException e ){
            System.out.println("Formato incorrecto");
            return;
        }
        System.out.println("==================================================");
        if (total < 100){
            System.out.println("Tienes un " +  (100 - total)  + "% de culpa");
        }else{
            System.out.println("No puede sumar mas de 100");
        }

    }
}
