package org.example;

import java.util.Scanner;

public class LuckyNumber {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");
        String fecha = entrada.nextLine();
        String reemplazar;
        final int ANIO = 2025;
        final int MES = 12;
        final int DIA = 31;
        int dia = 0;
        int mes = 0;
        int anio = 0;
        boolean estado = false;
        try {
            if (fecha.charAt(2) == '/' && fecha.charAt(5) == '/' && fecha.length() == 10) {

                    reemplazar = fecha.replace("/", "");
                    dia = Integer.parseInt(reemplazar.substring(0, 2));
                    mes = Integer.parseInt(reemplazar.substring(2, 4));
                    anio = Integer.parseInt(reemplazar.substring(4, 8));
                    estado = true;
            }else {
                System.out.println("El formato dd/mm/aaaa no es correcto");
            }
        }catch (Exception e) {
            System.out.println("No has introducido numeros");
        }
        if (estado) {
            if (ANIO >= anio && MES >= mes && DIA >= dia) {
                int resultado = dia + mes + anio;
                System.out.println(dia + "+" + mes + "+" + anio + " = " + resultado);
                String anio2 = Integer.toString(resultado);
                int num1 = Integer.parseInt(anio2.substring(0, 1));
                int num2 = Integer.parseInt(anio2.substring(1, 2));
                int num3 = Integer.parseInt(anio2.substring(2, 3));
                int num4 = Integer.parseInt(anio2.substring(3, 4));
                resultado = num1 + num2 + num3 + num4;
                System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + resultado);
                System.out.println("Tu numero de la suerte es " + resultado);
            } else {
                System.out.println("DIA, MES O AÑO NO EXISTE");
            }
        }

    }
}
