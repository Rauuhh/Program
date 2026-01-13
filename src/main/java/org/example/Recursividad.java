package org.example;

import java.util.Scanner;

public class ActRec {
    static Scanner entrada = new Scanner(System.in);
    static void main() {
        menu();
    }
    public static void menu(){
        System.out.println("*** BATERIA DE EJERCICIOS SOBRE RECURSIVIDAD ***");
        System.out.println("Selecciona a continuacion el modo que
quieras ejecutar:");
        System.out.println("    1 - Digitos");
        System.out.println("    2 - Potencias");
        System.out.println("    3 - Del reves");
        System.out.println("    4 - Binario");
        System.out.println("    5 - A binario");
        System.out.println("    6 - Orden alfabetico");
        System.out.println("    7 - Mostrar suma");

        System.out.println("Elije opción");
        int opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Escribe un numero y te dire la
cantidad de digitos que tiene");
                int digito = entrada.nextInt();
                System.out.println(digitos(digito));
                break;
            case 2:
                System.out.println("Escribe la base de la potencia");
                int base = entrada.nextInt();
                System.out.println("Escribe el exponente de la potencia");
                int exponente = entrada.nextInt();
                System.out.println(potencia(base,exponente));
                break;
            case 3:
                System.out.println("Quieres invertir una cadena o un numero");
                entrada.nextLine();
                String rev = entrada.nextLine();
                if (rev.equalsIgnoreCase("cadena")){
                    System.out.println("Escribe la cadena a invertir");
                    String cadena = entrada.nextLine();
                    int posicion = cadena.length()-1;
                    revesCadena(posicion, cadena.toCharArray());
                } else if (rev.equalsIgnoreCase("numero")) {
                    System.out.println("Escribe el numero");
                    int nume = entrada.nextInt();
                    revesNumero(nume);
                }else{
                    System.out.println("Parametro no valido");
                }
                break;
            case 4:

                System.out.println("Introduce el numero para comprobar
si es binario");
                int binario = entrada.nextInt();
                System.out.println(comprobarBinario(binario));
                break;
            case 5:
                System.out.println("Introduce un numero y t lo
transformare a binario");
                int num = entrada.nextInt();
                String holo = "";
                System.out.println(transformarBinario(num,holo));
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
    }

    public static int digitos(int numero){
        if (numero < 10){
        return 1+ digitos(numero);
        }else{
            return 1;
        }


    }
    public static int potencia(int base, int exponente){
            if (exponente == 1){
                return base;
            }else{
                return base * potencia(base,exponente -1);
            }
    }
    public static void revesNumero(int numero){
        if (numero < 10){
            System.out.println(numero);
        }else{
            System.out.print(numero % 10);
            revesNumero(numero/10);
        }
    }
    public static void revesCadena(int posicion, char[] frase){
        if (posicion == 0){
            System.out.print(frase[posicion]);
        }else{
            System.out.print(frase[posicion]);
            revesCadena(posicion-1,frase);
        }
    }
    public static boolean comprobarBinario(int binario) {
        if (binario >= 10)
        {
            if (binario % 10 == 0 || binario % 10 == 1){
                return comprobarBinario(binario/10);
            }else{
                return false;
            }
        }
        else if (binario == 0 | binario == 1)
        {
            return true;
        }else {
            return false;
        }
    }
    public static String transformarBinario(int binario,String coc){
            if (binario == 0 || binario == 1)
            {
                return coc += binario;
            }else {

                return transformarBinario(binario / 2, coc)+ binario % 2;
            }
    }
}
