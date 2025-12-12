package org.example;

public class solution { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static void casoDePrueba() {

        String [][] matriz = new String[8][8];

        String lineaEntera = in.nextLine();
        int contador = -1;
        externo:
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                contador++;
                if (lineaEntera.charAt(contador) == '/')
                {
                    i--;
                    continue externo;
                } else if (lineaEntera.charAt(contador) >= '1' && lineaEntera.charAt(contador) <= '8') {
                    j += Integer.parseInt(String.valueOf(lineaEntera.charAt(contador))) -1;
                }else{
                    matriz[i][j] = String.valueOf(lineaEntera.charAt(contador));
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] == null){
                    matriz[i][j] = String.valueOf(0);
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        String [][] copia = matriz.clone();
        int tablero = 64;
        boolean estado;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                switch (matriz[i][j]){
                    case "r":

                    case "n":

                    case "b":

                    case "q":
                    case "k":
                    case "p":
                    case "P":
                }

            }
        }



    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}