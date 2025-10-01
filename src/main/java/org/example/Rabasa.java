package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rabasa {
    static void main(){

        //Constantes para controlar la altura minima y maxima y el peso maximo
        final int PESO_MAXIMO = 120;
        final int ALTURA_MAXIMA = 230;
        final int ALTURA_MINIMA = 140;
        Scanner entrada = new Scanner(System.in);
        int altura = 0;
        int peso = 0;
        boolean estado = true;
        System.out.println("*** BIENVENIDO AL RATÓN JUGUETÓN ***");
        System.out.println();
        //bucle que se hara hasta que pongas un numero en la entrada
        do {
            try {
                //Pedir la altura
                System.out.println("Leyendo altura (cm)...");
                altura = entrada.nextInt();
                estado = false;
            } catch (InputMismatchException e ) {
                //Mensaje de error
                System.out.println("Formato incorrecto. Vuelve a introducirla");
                entrada.nextLine();
            }
        }while (estado);
        estado = true;
        double pesominimo = altura * 2 / 8;
        //si la altura es negativa o mayor de 2.30m
        if (altura < 0 || altura > ALTURA_MAXIMA){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BASCULA Y VUELVE A SUBIR");
        }
        //si eres bajito
        else if (altura > 0 && altura < 140){
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + ( ALTURA_MINIMA -  altura) + " cm de altura");
            //Si la altura es correcta
        } else {
            //bucle que se hara hasta que pongas un numero en la entrada
            do {
                try {
                    //Pedir el peso
                    System.out.println("Leyendo peso (Kg)...");
                    peso = entrada.nextInt();
                    estado = false;
                } catch (InputMismatchException e) {
                    //Mensaje de error
                    System.out.println("Formato incorrecto. Vuelve a introducirla");
                    entrada.nextLine();
                }
            } while (estado);
            //peso menor o igual que 0
            if (peso < 0) {
                do {
                    System.out.println("No puedes pesar negativo, introduce un peso");
                    peso = entrada.nextInt();
                }while (peso <= 0);
            }
            //si pesas muy poco para la altura
           if (peso < pesominimo && peso > 0) {
                System.out.println("LO SIENTO. Te faltan " + (pesominimo - peso) + " kg del peso minimo de la atraccion");
            }

            //si pesas mas del peso maximo
            else if (peso > PESO_MAXIMO) {
                System.out.println("LO SIENTO. Sobrepasas " + (peso -  PESO_MAXIMO) + " kg el límite de la atraccion");
            }
            //todo correcto
            else {
                System.out.println("Pesas " + peso + " kg. Peso minimo calculado: " + pesominimo + " kg");
               System.out.println( "¡¡SUBE A LA ATRACCION!!");
            }
        }
    }
}
