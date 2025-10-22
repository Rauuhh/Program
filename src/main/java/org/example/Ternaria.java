package org.example;


import java.util.Scanner;

public class Ternaria
{
    static void main() {
        int a = 4, b = 7, c = 5;
        int resultado = b++ == 8 && c > b++ ? a += b :
                a > 3 && a == c ? a += c :
                        a == b || c > b ? a++ :
                                a++ == 4 && a == c ? b += c : b;
        System.out.println(resultado);
    }
}