package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ExcepcionHasNextInt {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        final int ANIOMIN = 1900;
        System.out.println("ELIGE MODO ");
        System.out.println("[1] AÑO DE NACIMIENTO");
        System.out.println("[2] EDAD");
        if (entrada.hasNextInt()) {
            int modo = entrada.nextInt();
            LocalDateTime hoy = LocalDateTime.now();

            int anio = 0;
            boolean estado = false;
            if (modo == 1) {
                if (entrada.hasNextInt()){
                    System.out.println("Introduce tu año de nacimiento");
                    String eda = entrada.nextLine();
                    anio = Integer.parseInt(eda);
                    estado = true;
                }else {
                    System.out.println("Eso no es un año");
                }
            } else if (modo == 2) {
                System.out.println("Introduce tu edad");
                if (entrada.hasNextInt()) {
                    int edad = entrada.nextInt();
                    if (edad >= 0) {
                        anio = hoy.getYear() - edad;
                        estado = true;
                    } else {
                        System.out.println("No puedes tener una edad negativa");
                    }
                } else {
                    System.out.println("Formato incorrecto");
                }
            } else {
                System.out.println("No has introducido un modo correcto");
            }
            if (estado) {
                if (anio >= ANIOMIN && anio <= 1927) {
                    System.out.println("Eres de la epoca sin generacion bautizada");
                } else if (anio >= 1928 && anio <= 1944) {
                    System.out.println("Eres de la generacion silent");
                } else if (anio >= 1945 && anio <= 1964) {
                    System.out.println("Eres de la generacion Baby boomers");
                } else if (anio >= 1965 && anio <= 1981) {
                    System.out.println("Eres de la generacion X");
                } else if (anio >= 1982 && anio <= 1994) {
                    System.out.println("Eres de la generacion millenials");
                } else if (anio >= 1995 && anio <= hoy.getYear()) {
                    System.out.println("Eres de la generacion centenials");
                } else {
                    System.out.println("No puede ser tu año de nacimiento");
                }
            }
        }else {
            System.out.println("Valor del modo incorrecto");
        }
    }
}
