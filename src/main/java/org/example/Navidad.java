package org.example;

import java.util.Scanner;

public class Navidad {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Inserta la palabra a imprmir...");
        String palara = entrada.nextLine();
        String[] palabra_vector = palara.split("");

        System.out.println("Numero de letras a imprimir...");
        String cantidad = entrada.nextLine();
        String[] cantidad_vector = cantidad.split(" ");

        if (palabra_vector.length == cantidad_vector.length){

            for (int i = 0; i < palabra_vector.length; i++) {
                for (int j = 0; j < Integer.parseInt(cantidad_vector[i]); j++) {
                    System.out.print(palabra_vector[i]);
                }
            }
        }else{
            System.out.println("La palabra y las cifras introducidas no coinciden");
        }


    }
}
