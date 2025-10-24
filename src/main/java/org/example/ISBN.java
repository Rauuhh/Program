package org.example;

import java.util.Scanner;

public class ISBN {
     static void main() {
         Scanner entrada = new Scanner(System.in);

         System.out.println("****VALIDADOR ISBN****");
         System.out.println();
         System.out.println("1 - Validar ISBN");
         System.out.println("2 - Reparar ISBN");
         System.out.println("X - Salir");
         System.out.println();
         System.out.println("Introduzca opcion");
         String modo = entrada.nextLine().toUpperCase();
         String isbn;
         int suma = 0;
         int multi = 10;
         switch (modo){
             case "1":
                 System.out.println("Introduzca ISBN");
                 isbn = entrada.nextLine();
                 if (isbn.length() == 10) {
                     for (int i = 0; i < isbn.length(); i++) {
                         if (i == isbn.length() - 1 && isbn.substring(i).equals("X")) {
                             int ultimo = 10;
                             suma += ultimo * multi;
                         } else {
                             try {
                                 suma += Integer.parseInt(isbn.substring(i, i + 1)) * multi;
                                 multi--;
                             } catch (NumberFormatException e) {
                                 System.out.println("Formato incorrecto");
                                 return;
                             }
                         }
                     }
                     if (suma % 11 == 0) {
                         System.out.println("ISBN VALIDO OLEOLEOLE");
                     } else {
                         System.out.println("ISBN no valido");
                     }
                 }else {
                     System.out.println("El ISBN no tiene 10 caracteres");
                 }

                 break;
             case "2":
                 break;
             case "X":
                 break;
             default:
                 break;
         }
    }
}
