package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bateria {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        /*
        float horas  =0;
        float salario = 0;
        float salariobruto = 0;

        try {
            System.out.println("Numero de horas trabajadas");
             horas = entrada.nextInt();
            System.out.println("Salario por Hora");
             salario = entrada.nextInt();
             salariobruto = salario * horas;
        } catch (InputMismatchException e) {
            System.out.println("Formato incorrecto");
        }
        System.out.println("Tu salario bruto es de " + salariobruto);
         */
        /*
         double horas = 0;
         double salario = 0;
        try {
            System.out.println("Numero de horas trabajadas");
            horas = entrada.nextDouble();
            System.out.println("Salario por Hora");
            salario = entrada.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Formato incorrecto");
        }
        double salariobruto;
        if (horas > 40)
        {
            double horasextra = horas - 40;
            double salarioextra = horasextra * 1.5;
            salariobruto = (horas * salario) + salarioextra;
        }else{
            salariobruto = horas * salario;
        }
        System.out.println("Tu salario bruto es de " +  salariobruto);
        */
        /*
        double numero = 0;
        System.out.println("Introduce un numero");
        try{
            numero = entrada.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Formato incorrecto");
        }
        if (numero <0){
            System.out.println("El numero es negativo");
        } else if (numero > 0) {
            System.out.println("El numero es positivo");
        }else {
            System.out.println("Ni positivo ni negativo, es 0");
        }


         */
        /*
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        try {
            System.out.println("Introduce el primer numero");
            num1 = entrada.nextDouble();
            System.out.println("Introduce el segundo numero");
            num2 = entrada.nextDouble();
            System.out.println("Introduce el tercer numero");
            num3 = entrada.nextDouble();
        }catch (InputMismatchException e ){
            System.out.println("Formato incorrecto");
        }
        if (num1 == num2 || num1 == num3 || num3 == num2){
            System.out.println("ERROR: hay numero que son iguales");
        }else
        {
            if (num1 < num2 && num1 < num3){
                System.out.println(num1 + " es el numero mas pequeño");
            } else if (num2 < num1 && num2 < num3) {
                System.out.println(num2 + " es el numero mas pequeño");
            }else {
                System.out.println(num3 + " es el numero mas pequeño");
            }
        }

        */

        double divid = 0;
        double divis = 0;
        double result = 0;

        boolean estado = true;
        do {
            try {
                System.out.println("Introduce el dividendo");
                divid = entrada.nextDouble();
                System.out.println("Introduce el divisor");
                divis = entrada.nextDouble();
                estado = false;
            } catch (InputMismatchException e) {
                System.out.println("Formato Incorrecto");
            }
            entrada.nextLine();
        }while (estado);
        if (divis != 0){
            result = divid / divis;
            System.out.println("El resultado es " + result);
        }else {
            System.out.println("No puedes dividir entre 0");
        }

        /*

       Ejercicio6
        System.out.println("CALCULAR AREA TRIANGULO");
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("Introduce la base");
        double base = entrada.nextDouble();
        while (base <= 0)
        {
            System.out.println("El valor de la base tiene que ser positivo");
            System.out.println("Introduce la base");
            base = entrada.nextDouble();
        }
        System.out.println("Introduce la altura");
        double altura = entrada.nextDouble();
        while (altura <= 0)
        {
            System.out.println("El valor de la altura tiene que ser positivo");
            System.out.println("Introduce la altura");
            altura = entrada.nextDouble();
        }
        double result = base*altura/2;
        System.out.println("El area de triangulo es " + result);
         */
        /*
       Ejercicio7
        System.out.println("¿Tenemos tomate?(Si/No)");
        String tomate = entrada.nextLine();
        System.out.println("¿Tenemos aceite?(Si/No)");
        String aceite = entrada.nextLine();
        System.out.println("¿Tenemos jamon?(Si/No)");
        String jamon = entrada.nextLine();

        if (tomate.toLowerCase().equals("si") && aceite.toLowerCase().equals("si") &&  jamon.toLowerCase().equals("si")){
            System.out.println("¡No tenemos que ir a comprar!");
        }else {
            System.out.println("¡Tenemos que ir a comprar!");
        }
         */
        /*
       Ejercicio8
        System.out.println("Introduce el primer lado del triangulo");
        double lado1 = entrada.nextDouble();
        System.out.println("Introduce el segundo lado del triangulo");
        double lado2 = entrada.nextDouble();
        System.out.println("Introduce el tercer lado del triangulo");
        double lado3 = entrada.nextDouble();
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
        {
            System.out.println("Ningun lado puede medir 0 o menos");
        }else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Tu triangulo es equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Tu triangulo es isosceles");
            } else {
                System.out.println("Tu triangulo es escaleno");
            }
        }
         */
    }
}
