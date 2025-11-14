package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Cuadrado3 {

    public static boolean casoDePrueba() {
        /**
         * @param tam - es el tamaño que nosotros le indicamos que va a tener, tiene que ser mayor a 0, sino, no existiria matriz
         * @param tamano - es la matriz ya creada con el tamaño dicho antes
         * @return true mientras tam no sea 0
         */
        Scanner entrada = new Scanner(System.in);
        int tam = 0;
        try {
            tam = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException | InputMismatchException e) {
            return true;
        }
        if (tam == 0) {
            return false;
        } else {
            int[][] tamano = new int[tam][tam];
            if (tam % 2 == 0) {
                if (!leerMatriz(tamano, entrada)) {
                    System.out.println("NO");
                    return true;
                }
                if (!verificarFilas(tamano) || !verificarColumnas(tamano) || !verificarDiagonales(tamano)) {
                    System.out.println("NO");
                    return true;
                }


                if (esEsotericoPar(tamano)) {
                    System.out.println("ESOTERICO");
                } else {
                    System.out.println("DIABOLICO");
                }
            } else {
                if (!leerMatriz(tamano, entrada)) {
                    System.out.println("NO");
                    return true;
                }


                if (!verificarFilas(tamano) || !verificarColumnas(tamano) || !verificarDiagonales(tamano)) {
                    System.out.println("NO");
                    return true;
                }


                if (esEsotericoImpar(tamano)) {
                    System.out.println("ESOTERICO");
                } else {
                    System.out.println("DIABOLICO");
                }
            }
            return true;
        }
    }

    public static boolean leerMatriz(int[][] matriz, Scanner entrada) {
        /**
         * @param valores -  es un vector donde nos vamos a guardar los datos introducidos 1 por 1 donde cada valor esta separado por 1 espacio
         * @param tam - es un int donde vamos a saber el numero de valores que vamos a necesitar crear en la matriz, si nuestra matriz es de 3, tam sera 3 * 3, si devuelve false es que faltan o sobran valores
         * @param contador - es una variable para ir metiendo cada valor a su posicion correspondiente y la vamos sumando cada vez que un valor se introduzca en la matriz
         * @param cantidadEsperada - es un int donde le indicamos los numeros que el usuario debe meter
         * @ return true si los datos fueron introducidos correctamente
         */
        String[] valores = entrada.nextLine().split(" ");
        int tam = matriz.length;
        int cantidadEsperada = tam * tam;
        if (valores.length != cantidadEsperada) {
            return false;
        }
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {


                if (Validar2(valores[contador]))
                    matriz[i][j] = Integer.parseInt(valores[contador++]);
                else
                {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean Validar2(String valores) {
        /**
         *
         * @param valoresint - pasamos los valores a tipo entero, porque les habia puesto String para poder hacer el metodo split
         * @return true si el formato son numeros enteros
         */
        try {
            int valoresint = Integer.parseInt(valores);
        } catch (InputMismatchException | NumberFormatException e) {
            return false;
        }
        return true;
    }


    public static boolean verificarFilas(int[][] matriz) {
        /**
         * @param sumafila - Nos dice cuanto es la suma de cada fila de la matriz
         * @param sumafilacomp - es una variable auxiliar, al principio vale 0 asi que le daremos el valor de la primera fila sumada y se usara solo para comparar las filas de despues
         * @return true si las filas suman lo mismo
         */

        int sumafila = 0;
        int sumafilacomp = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumafila += matriz[i][j];
            }
            if (sumafilacomp == 0)
            {
                sumafilacomp = sumafila;
            }
            if(sumafilacomp != sumafila)
            {
                return false;
            }
            sumafila = 0;
        }
        return true;
    }


    public static boolean verificarColumnas(int[][] matriz) {

        /**
         * @param sumacolumna - Nos dice cuanto es la suma de cada columna de la matriz
         * @param sumafilacomp - es una variable auxiliar, al principio vale 0 asi que le daremos el valor de la primera columna sumada y se usara solo para comparar las columnas de despues
         * @return true si las columnas suman lo mismo
         */

        int sumacolumna = 0;
        int sumacolumnacomp = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumacolumna += matriz[j][i];
            }
            if (sumacolumnacomp == 0)
            {
                sumacolumnacomp = sumacolumna;
            }
            if(sumacolumnacomp != sumacolumna)
            {
                return false;
            }
            sumacolumna = 0;
        }
        return true;
    }


    public static boolean verificarDiagonales(int[][] matriz) {
        /**
         * @param sumaDiagonal1 - Nos suma la diagonal principal de la matriz cuando la posicion fila/columna es la misma
         * @param sumaDiagonal2 - Nos suma la otra diagonal principal y va en paralelo con la primera diagonal principal( si la primera suma en 0,0 la seguna suma en 0,longitud - i - 1 que es la ultima posicion y mientras la priera diagonal suma, la segunda resta)
         * @return true si las diagonales suman lo mismo
         */
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int longitud = matriz.length;


        for (int i = 0; i < longitud; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][longitud - i - 1];
        }


        return true;
    }


    public static boolean esEsotericoPar(int[][] matriz) {
        /**
         * @param longitud - la longitud de la matriz
         * @param sumaBordes - Suma los numeros de las posiciones esquina de la matriz
         * @param sumaMedios - Suma la posicion que esta a la mitad de la longitud de cada longitud del array, como es un numero par,no hay una mitad de un numero, asi que tenemos que sumar el matriz/2 - 1 y el matriz /2 de los 4 lados les cuadrado
         * @param SumaCentro - Suma la posicion de los 4 numeros centrales de la matriz
         * @return true si la matriz es esoterica, false si no lo es
         */
        int longitud = matriz.length;
        int sumaBordes = matriz[0][0] + matriz[0][longitud - 1] + matriz[longitud - 1][0] + matriz[longitud - 1][longitud - 1];
        int sumaMedios = matriz[0][longitud / 2] + matriz[0][longitud / 2 - 1] + matriz[longitud - 1][longitud / 2] + matriz[longitud - 1][longitud / 2 - 1] +
                matriz[longitud / 2][0] + matriz[longitud / 2 - 1][0] + matriz[longitud / 2][longitud - 1] + matriz[longitud / 2 - 1][longitud - 1];
        int sumaCentro = matriz[longitud / 2][longitud / 2] + matriz[longitud / 2 - 1][longitud / 2] + matriz[longitud / 2][longitud / 2 - 1] + matriz[longitud / 2 - 1][longitud / 2 - 1];


        return sumaBordes == sumaCentro && sumaMedios / 2 == sumaBordes;
    }


    public static boolean esEsotericoImpar(int[][] matriz) {
        /**
         * @param longitud - la longitud de la matriz
         * @param sumaBordes - Suma los numeros de las posiciones esquina de la matriz
         * @param sumaMedios - Suma la posicion que esta a la mitad de la longitud de cada longitud del array
         * @param SumaCentro - Multiplica por 4 la posicion del numero central de la matriz
         * @return true si la matriz es esoterica, false si no lo es
         */
        int longitud = matriz.length;
        int sumaBordes = matriz[0][0] + matriz[0][longitud - 1] + matriz[longitud - 1][0] + matriz[longitud - 1][longitud - 1];
        int sumaMedios = matriz[0][longitud / 2] + matriz[longitud / 2][0] + matriz[longitud - 1][longitud / 2] + matriz[longitud / 2][longitud - 1];
        int sumaCentro = matriz[longitud / 2][longitud / 2] * 4;


        return sumaBordes == sumaMedios && sumaBordes == sumaCentro;
    }
    public static void main(String[] args) {
        while (casoDePrueba()) {


        }
    }
}