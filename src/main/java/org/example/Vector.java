package org.example;

import java.util.Arrays;

public class Vector {
    static void main() {
        String[] vector = {"Hola","Jorge tonto"};


        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);
        vector[1] = "Jorge retrasado";
        System.out.println(Arrays.toString(vector));
        for (int i = vector.length -1 ; i >= 0; i--) {
            System.out.println(vector[i]);
        }

        String[] vector2 = new String[8];
        System.out.println(Arrays.toString(vector2));
    }
}
