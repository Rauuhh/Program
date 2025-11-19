package org.example;

import java.util.Scanner;

public class BuclesAnidados {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        /*
        externo:
        for (int i = 0; i < 9; i++) {
            System.out.println();
            System.out.println("Soy el externo con i = " + i);
            interno:
            for (int j = 10; j >= 0 ; j--) {
                System.out.println("Soy el interno con j = " + j);
                if (j==5){
                   continue externo;
                }
                System.out.println("Hola: " + (j+i));
            }
        }
         */
        /*
        System.out.println("Introduce la altura del triangulo");
        int h = entrada.nextInt();
        int contadot;
        for (int i = 1; i <= h; i++) {
            contadot = 0;
            while (contadot < i){
                System.out.print("*");
                contadot++;
            }
            System.out.println();
        }
         */
        /*
        System.out.println("Introduce numero maximo");
        int max = entrada.nextInt();
        int contador = 1;
        int resul= 0;
        hola:
        for (;;){
            System.out.println();
            System.out.println("Tabla del " + contador);
            for (int i = 1; i <= 10; i++) {
                System.out.println();
                System.out.print(contador + " * " + i + " = " + (contador*i));
                resul = contador* i;
                if (resul > max){
                    System.out.print(" <- Se supera el numero maximo, se detiene todo");
                    break hola;
                }
            }
            contador++;
        }
         */
        System.out.println("Introduce numero");
        int num = entrada.nextInt();
        System.out.println("Numeros primos: ");
        boolean estado = true;
        hola:
        for (int i = 2; i < num; i++) {
            estado = true;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j){
                    estado = false;
                    continue hola;
                }else{
                    estado = true;
                }
            }
            if (estado){
                System.out.print(i + " ");
            }
        }
    }
}
