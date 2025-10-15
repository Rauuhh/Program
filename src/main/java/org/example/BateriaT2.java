package org.example;

import java.util.Scanner;

public class BateriaT2 {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        /*System.out.println("Introduce una cadena de caracteres");
        String frase = entrada.nextLine();

        System.out.println(frase.length());
        System.out.println(frase.replace(" ",""));
        System.out.println("Primera mitad del texto es '" + frase.substring(0,frase.length()/2) + "' y la segunda mitad del texto es '" + frase.substring((frase.length()/2)) + "'.");
        System.out.println(frase.toUpperCase());

        System.out.println("Introduce una frase");
        String frase1 = entrada.nextLine();
        String frase2 = entrada.nextLine();

        if (frase1.length() < frase2.length()){
            System.out.println(frase2 + "tiene mas caracteres");
        } else if (frase2.length() < frase1.length()) {
            System.out.println(frase1 + "tiene mas caracteres");
        }else {
            System.out.println("Las 2 frases tienen los mismos caracteres");
        }

         */

/*
        System.out.println("Introduce un numero");
        int num1 = entrada.nextInt();
        System.out.println("Introduce los digitos a quitar");
        int num2 = entrada.nextInt();
        String numero = Integer.toString(num1);
        if (numero.length() < num2) {
            System.out.println("No puede quitar mas cifras que el numero tiene");
        } else {
            System.out.println(numero.substring(0, numero.length() - num2));

        }
 */
        System.out.println("Introduce una cadena de texto");
        String texto = entrada.nextLine();
        System.out.println("Introduce la subcadena para contarla");
        String subcadena = entrada.nextLine();
        int contador = 9;
        boolean estar = false;
        do
        if (texto.contains(subcadena)){
            System.out.println("La palabra esta en la cadena");
            estar = true;
        }else{
            System.out.println("La palabra no esta en la cadena, Prueba otra vez, te quedan " + contador + " intentos");
            subcadena = entrada.nextLine();
            contador--;

        }
        while (!estar && contador >= 1);

        if (!estar){
            System.out.println("Perdiste");
        }else{
            System.out.println("GANASTE");
        }

    }

}
