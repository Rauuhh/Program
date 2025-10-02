package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplicacion {
    static void main(){
      /*  int numero = 435;
        String numero_string = Integer.toString(numero);
        String num1 = numero_string.substring(0,1);
        String num2 = numero_string.substring(1,2);
        String num3 = numero_string.substring(2,3);
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int numero3 = Integer.parseInt(num3);
        System.out.println("Resultado : " + numero * numero2);

       */
        Scanner entrada = new Scanner(System.in);
        //numeros de entrada y un booleano para el try-catch
        int numero1 = 0;
        int numero2 = 0;
        boolean estado = true;
        do {
            try {
                //bucle para que el numero tenga 3 cifras
                do {
                    System.out.println("Introduce el multiplicando(3 cifras)");
                    numero1 = entrada.nextInt();
                }while (numero1 > 999 || numero1 < 100);
                    estado = false;
            }catch (InputMismatchException e){
                System.out.println("Formato no correcto, Vuelva a introducirlo...");
                entrada.nextLine();
            }
        }while (estado);
        //pones la variable en true para volver a hacer otro try-catch con la misma variable
        estado = true;
        do {
            try {
                do {
                    //bucle para que el numero tenga 3 cifras
                    System.out.println("Introduce el multiplicador(3 cifras)");
                    numero2 = entrada.nextInt();
                }while (numero2 > 999 || numero2 < 100);
                estado = false;
            }catch (InputMismatchException e){
                System.out.println("Formato no correcto, Vuelva a introducirlo...");
                entrada.nextLine();
            }
        }while (estado);
        int resultado = numero1 * numero2;

        //pasas el numero de int a string
        String numero_string = Integer.toString(numero2);
        //coger el digito de cada posicion
        String num1 = numero_string.substring(2,3);
        String num2 = numero_string.substring(1,2);
        String num3 = numero_string.substring(0,1);
        //pasar esa posicion a un numero
        int num1I = Integer.parseInt(num1);
        int num2I = Integer.parseInt(num2);
        int num3I = Integer.parseInt(num3);

        //el resultado
        System.out.println();
        System.out.println("El producto de la multiplicacion es " + resultado);
        System.out.println("El proceso es:");
        System.out.println("    " + (numero1));
        System.out.println("  x " + numero2);
        System.out.println("___________");
        System.out.println();
        System.out.println("   " + (num1I * numero1));
        System.out.println("  " + (num2I * numero1) + "x");
        System.out.println(" " + (num3I * numero1) + "xx");
        System.out.println("___________");
        System.out.println(" "+ resultado);
    }
}
