package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rabasa {
    static void main(){

        //Constantes para controlar la altura maxima y el peso maximo
        final int PESO_MAXIMO = 120;
        final int ALTURA_MAXIMA = 230;
        Scanner entrada = new Scanner(System.in);
        int altura = 0;
        int 
        boolean estado = true;
        System.out.println("*** BIENVENIDO AL RATÓN JUGUETÓN ***");
        System.out.println();
        do {
            try {
                //Pedir la altura
                System.out.println("Leyendo altura (cm)...");
                altura = entrada.nextInt();
                estado = false;
            } catch (InputMismatchException e ) {
                System.out.println("Formato incorrecto. Vuelve a introducirla");
                System.out.println();
            }
        }while (estado);
        estado = true;
    }
}
