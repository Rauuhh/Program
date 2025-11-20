package org.example;

import java.util.Random;
import java.util.Scanner;

public class BateriaMatrices {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        /*
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Numero a buscar");
        int num = entrada.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == num){
                    System.out.println("El nùmero " + num + " se encuentra en la posicion (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("El numero no se encuentra en la matriz");

         */
        /*
        int random = aleatorio.nextInt(5) +1;
        int [][]matriz = new int[random][random];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = aleatorio.nextInt(20) +1;
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int fila = 0;
        System.out.println("Suma de filas:");
        for (int i = 0; i < matriz.length; i++) {
            fila = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                fila += matriz[i][j];
            }
            System.out.print("Fila " + (i+1) +": " + fila);
            System.out.println();
        }

        int columna = 0;
        System.out.println("Suma de columnas:");
        for (int i = 0; i < matriz[0].length; i++) {
            columna = 0;
            for (int j = 0; j < matriz.length; j++) {
                columna += matriz[j][i];
            }
            System.out.print("Columna " + (i+1) +": " + columna);
            System.out.println();
        }
         */
        System.out.println("Cuantos estudiantes tienes");
        int alumnos = entrada.nextInt();
        System.out.println("Cuantas asignaturas tienes");
        int asignaturas = entrada.nextInt();
        String[][]matriz = new String[alumnos +1][asignaturas +1];

        matriz[0][0] = "Estudiantes";
        for (int i = 1; i < matriz.length; i++) {
            System.out.println("Introduce nombre del estudiante " + (i));
            matriz[i][0] = entrada.next();
        }

        for (int i = 1; i < matriz[0].length; i++) {
            System.out.println("Introduce nombre de la asignatura " + (i));
            matriz[0][i] = entrada.next();
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                System.out.println("Inserta la nota de " + matriz[i][0] + " para la asignatura " + matriz[0][j]);
                if (entrada.hasNextInt()){
                    matriz[i][j] = entrada.next();
                }else{
                    System.out.println("No es una nota");
                    return;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        double media = 0;
        for (int i = 1; i < matriz.length; i++) {
            media = 0;
            for (int j = 1; j < matriz[0].length; j++) {
                media += Integer.parseInt(matriz[i][j]);
            }
            media = media / asignaturas;
            System.out.println("La nota media del alumno " + matriz[i][0] + " es " + media);
        }


        for (int i = 1; i < matriz[0].length; i++) {
            media = 0;
            for (int j = 1; j < matriz.length; j++) {
                media += Integer.parseInt(matriz[j][i]);
            }
            media = media / alumnos;
            System.out.println("La nota media de la asignatura " + matriz[0][i] + " es " + media);
        }
    }
}
