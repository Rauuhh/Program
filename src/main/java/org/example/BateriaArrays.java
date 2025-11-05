package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaArrays {
    static void main() {
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        /*
        int[] array = new int[8];
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(1,500 + 1);
            total += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("La suma de los elementos es " + total);

         */
/*
        int[] array = {1,2,3,4,5};
        System.out.print("Array original: ");
        for (int i = 0; i <= array.length -1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int aux = 0;
        System.out.print("Array invertido: ");
        for (int i = 0; i < array.length / 2; i++) {
            aux = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length-1-i] = aux;
        }
        System.out.println(Arrays.toString(array));


 */
        /*
        int[] array = new int[25];
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(1,100 + 1);

        }
        System.out.println("Ingresa numero a buscar entre 0 y 100");
        int numero = entrada.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]){
                total++;
            }
        }
        System.out.println("El numero " + numero + " esta " + total +" veces en el array");
         */
        /*
        int[] array = {1,3,5,7,9};
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Ingresa el indice a eliminar");
        int posicion = entrada.nextInt();
        int[] array2 = new int[array.length -1];
        int posi = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != posicion) {
                array2[posi] = array[i];
                posi++;
            }
        }
        System.out.println("Array resultante:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
         */
        /*
        int[] vector = {1, 2, 3, 4, 5};
        int aux = 0;
        int aux2 = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i == 0) {
                aux = vector[i];
                vector[i] = vector[vector.length-1];
            }else if (i <= vector.length -1){
                aux2 = aux;
                aux = vector[i];
                vector[i] = aux2;
            }
        }
        System.out.println(Arrays.toString(vector));

         */
        /*
        int[] array = {1,4,3,4,1};
        boolean estado = true;
        for (int i = 0; i < array.length/ 2; i++) {
            if (array[i] != array[array.length-1-i]){
                estado = false;
            }
        }
        if (estado){
            System.out.println("ES SIMETRICO: SI");
        }else{
            System.out.println("ES PLAINDROMO: NO");
        }
         */
        /*
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] arrayF = new int [array1.length +array2.length];
        int num = 0;
        for (int i = 0; i < arrayF.length; i++) {
            if (num < array1.length){
                arrayF[i] = array1[i];
                num++;
            } else if (num < arrayF.length) {
                arrayF[i] = array2[num-3];
                num++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arrayF));
*/
        int[] array = {1,3,5,7,9,11};
        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int num = 4;
        int posicion = 3;
        int[] array2 = new int[array.length +1];
        int posi = 0;
        for (int i = 0; i < array2.length ; i++) {
            if (posicion == i){
                posi = array[i];
                array2[i]= num;
            }
            else if (i > posicion && i < array.length){
                array2[i]= posi;
                num = posi;
                posi = array[i];
            }else if (i > posicion && i == array.length) {
                array2[i]= posi;
                num = posi;
            }
            else{
                array2[i] = array[i];
            }
        }
        System.out.print("Array resultante: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
