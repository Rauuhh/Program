package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ExcepcionHasNextInt {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ELIGE MODO 1 O MODO 2");
        String modo = entrada.nextLine();
        LocalDateTime hoy = LocalDateTime.now();
        String eda;
        int anio = 0;
        int edad = 0;
        boolean estado = false;
        if (modo.equals("1")) {
            try {
                System.out.println("Introduce tu año de nacimiento");
                eda = entrada.nextLine();
                anio = Integer.parseInt(eda);
                estado = true;
            } catch (Exception e) {
                System.out.println("Formato incorrecto");
            }
        } else if (modo.equals("2")) {
            System.out.println("Introduce tu edad");
            if (entrada.hasNextInt()){

            edad = entrada.nextInt();
            if (edad >= 0) {
                anio = hoy.getYear() - edad;
                estado = true;
            } else {
                System.out.println("No puedes tener una edad negativa");
            }
        } else {
            System.out.println("Formato incrrecto");
        }
    }else{
            System.out.println("No has introducido un modo correcto");
        }
        if (estado){
            if (anio >= 1900 && anio <=1927){
                System.out.println("Sin generacion bautizada");
            } else if (anio >= 1928 && anio <= 1944) {
                System.out.println("Generacion silent");
            } else if (anio >=1945 && anio <= 1964) {
                System.out.println("Baby boomers");
            } else if (anio >= 1965 && anio <=1981) {
                System.out.println("Generacion X");
            } else if (anio >= 1982 && anio<= 1994) {
                System.out.println("Millenials");
            } else if (anio >= 1995 && anio <= hoy.getYear()) {
                System.out.println("Centenials");
            }else{
                System.out.println("No puede ser tu año de nacimiento");
            }
        }
    }
}
