package org.example;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
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
                System.out.println("Introduzca ISBN (con ? en alguna posicion)");
                isbn = entrada.nextLine();

                if (isbn.length() != 10) {
                    System.out.println("El ISBN no tiene 10 caracteres");
                    break;
                }
                int posInterrogacion = 40;
                suma = 0;
                multi = 10;
                int interro = 0;
                for (int i = 0; i < isbn.length(); i++) {
                    String posicion = isbn.substring(i, i + 1);
                    if (posicion.equals("?")) {
                        posInterrogacion = i;
                        multi--;
                        interro++;
                        continue;
                    }

                    if (i == isbn.length() - 1 && posicion.equals("X")) {
                        suma += 10 * multi;
                    } else {
                        try {
                            suma += Integer.parseInt(posicion) * multi;
                        } catch (NumberFormatException e) {
                            System.out.println("Formato incorrecto");
                            return;
                        }
                    }
                    multi--;
                }
                if (interro > 1){
                    System.out.println("No puedes poner mas de 1 ?");
                    break;
                }
                if (posInterrogacion == 40) {
                    System.out.println("No hay ningún '?' en el ISBN.");
                    break;
                }
                int multiplicar = 10 - posInterrogacion;
                boolean si = false;
                for (int i = 0; i <= 10; i++) {
                    int sumaConPosible = suma + (i * multiplicar);
                    if (sumaConPosible % 11 == 0) {
                        si = true;
                        if (i == 10) {
                            System.out.println("El carácter '?' debe ser 'X'");
                        } else {
                            System.out.println("El carácter '?' debe ser: " + i);
                        }
                        break;
                    }
                }
                if (!si) {
                    System.out.println("No existe ningún valor que haga el ISBN bien");
                }
                break;
            case "X":
                System.out.println("*** ESPERAMOS VOLVER A VERTE PRONTO ***");
                break;
            default:
                System.out.println("Opcion no correcta");
                break;
        }
    }
}


