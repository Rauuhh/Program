/*package org.example;

// Asume fichero llamado solution.java
public class solution {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int num = in.nextInt();
        if (num < 0)
        return false;
        else {
            String numero = Integer.toString(num);
            boolean estado = true;
            for (int i = 0; i < numero.length(); i++) {
                if (Integer.parseInt(numero.substring(i,i+1)) % 2 != 0){
                    estado = false;
                    break;
                }

            }
            if (estado){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}

 */