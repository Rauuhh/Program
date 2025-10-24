package org.example;

public class Pueba {
    static void main() {
        int a = 24;
        int b = 6;
        int c = 0;
        int d = 0;
        if (a>= b){
            do {
                a = a - b;
                c++;
            }while (a >=b);
        }
        d = a;
        System.out.println(c + " " + d);
    }
}
