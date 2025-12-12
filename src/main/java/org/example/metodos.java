package org.example;

import java.util.Random;
import java.util.Scanner;

public class metodos {
    static Scanner entrada = new Scanner(System.in);

    static void main() {
        System.out.println("Introduce un numero");
        int numero = entrada.nextInt();
        int cub = cubo(numero);
        System.out.println(cub);


    }
    public static int cubo(int num){
        int resul = num * num * num;
        return resul;
    }

    public static boolean par(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static String menu(int op){
        System.out.println("1. Opcion1");
        System.out.println("2. Opcion2");
        System.out.println("3. Opcion3");
        System.out.println("4. Opcion4");
        System.out.println("5. Opcion5");
        while (op != 5){
            System.out.println("elige opcion");
            op = entrada.nextInt();
        }
        return "Adios";
    }
}
