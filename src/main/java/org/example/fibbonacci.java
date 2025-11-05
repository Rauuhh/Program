package org.example;

import java.util.Scanner;

public class fibbonacci {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int numeros = 0;
        int num1 = 0;
        int num2 = 1;
        int suma = 1;
            try {
                System.out.println("Introduce la cantidad de numeros que quieres mostrar");
                numeros = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("No es un numero");
            }
            if (numeros <= 0){
                System.out.println("Tiene que ser un numero positivo");
            }else{
                for (int i = 0; i < numeros; i++) {
                    System.out.println(num1);
                    suma = num1 + num2;
                    num1 = num2;
                    num2 = suma;
                }
            }
    }

}
