package org.example;

import java.util.Random;
import java.util.Scanner;

public class BateriaRandom {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        /*
        int dado1 = aleatorio.nextInt(1,6)+1;
        int dado2 = aleatorio.nextInt(1,6)+1;
        int resultado = dado1 + dado2;
        System.out.println("-Dado 1: " + dado1 + " -Dado 2: " + dado2 + " -Resultado:" + resultado);
         */
/*
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contraseña = "";

        for (int i = 0; i < 12; i++) {
            contraseña += caracteres.charAt(aleatorio.nextInt(1,caracteres.length() +1));
        }
        System.out.println(contraseña);
 */
        /*
        int numero1= 0;
        int numero2 = 0;

        try {
            System.out.println("Introduce un numero");
            numero1 = entrada.nextInt();
            System.out.println("Introduce un numero mayor que el primero");
            numero2 = entrada.nextInt();
        }catch (Exception e){
            System.out.println("No es un numero");
            return;
        }

        if (numero1 < numero2){
            String aleat = "";
            System.out.println("Cuantos numeros quieres que se genere");
            int intentos = entrada.nextInt();
            for (int i = 0; i < intentos; i++) {
                aleat += aleatorio.nextInt(numero2-numero1 + 1) + numero1 + " ";
            }
            System.out.println(aleat);
        }else{
            System.out.println("El primer numero no es mayor que el segundo");
        }

         */
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int rango = aleatorio.nextInt(7,11) +1;
        String contraseña ="";
        String comparar;
        int mayus = 0;
        int minus = 0;
        int numer = 0;
        int posi = 0;
        do {
            contraseña ="";
            for (int i = 0; i < rango; i++) {
                contraseña += caracteres.charAt(aleatorio.nextInt(0, caracteres.length() ));
                comparar = contraseña.substring(i, i+1);
                for (int j = 0; j < caracteres.length() -1; j++) {
                    if (comparar.equals(caracteres.substring(j,j+1))) {
                        posi = j;
                    }
                }
                    if (posi <= 26) {
                        mayus++;
                    } else if (posi >= 27 && posi <= 52) {
                        minus++;
                    } else {
                        numer++;
                    }
            }
        }while (mayus == 0 || minus == 0 || numer == 0);
            System.out.println(contraseña);




    }
}
