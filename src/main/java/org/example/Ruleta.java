package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        final String [] COLORES = {"ROJO","NEGRO"};
        final Integer [] NUMEROS = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
        final String [] PAR = {"PAR","IMPAR"};
        System.out.println("Introduce un numero (0-36)");
        int numero = entrada.nextInt();
        String color = "";
        String par="";
        if(!Arrays.asList(NUMEROS).contains(numero)){
            System.out.println("ERROR, el numero no es valido");
            return;
        }
        if (numero != 0){
            System.out.println("Introduce color (Rojo,Negro)");
            color = entrada.next().toUpperCase();

            if (!Arrays.asList(COLORES).contains(color)){
                System.out.println("ERROR, el color no es valido");
                return;
            }
            System.out.println("Introduce Par-Impar");
             par = entrada.next().toUpperCase();

            if (!Arrays.asList(PAR).contains(par)){
                System.out.println("Error, tipo no valido");
                return;
            }
        }



        String coloor = COLORES[aleatorio.nextInt(2)];
        int numeroo = NUMEROS[aleatorio.nextInt(37)];
        String espar;
        if (numeroo % 2 == 0){
            espar = PAR[0];
        }else{
            espar = PAR[1];
        }

        System.out.println("NUMERO: " + numeroo + " - COLOR: " + coloor + " y es " + espar);
        if (numero == numeroo && coloor.equals(color) && par.equals(espar))
        {
            System.out.println("HAS GANADO");
        } else if (color.equals(coloor)) {
            System.out.println("Has acertado el color");
        } else if (par.equals(espar)) {
            System.out.println("Has acertado que es par/impar");
        } else if (numero == numeroo && numero == 0) {
            System.out.println("HAS GANADO Y LOS DEMAS PIERDEN");
        } else if (numero == numeroo ) {
            System.out.println("Has acertado el numero");
        }else{
            System.out.println("HAS PERDIDO");
        }

    }
}
