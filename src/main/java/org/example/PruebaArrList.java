package org.example;

import java.util.ArrayList;

public class PruebaArrList {
    static void main() {
        ArrayList<Integer> Lista = new ArrayList<>();

        Lista.add(5);
        Lista.add(10);
        Lista.add(6);

        System.out.println(Lista.size());

        Lista.add(1,4);

        System.out.println("Nota en la pos 2 "+ Lista.get(2));

        System.out.println(Lista.indexOf(10));

        for (Integer nota: Lista){
            System.out.println(" Nota de la asignatura " + nota);
        }

        for (int i = 0; i < Lista.size(); i++) {
            System.out.println("Nota de la asignatuta " + (i+1) + ": " + Lista.get(i));
        }

        Lista.set(0,10);

        Object copia_mala = Lista.clone();
        ArrayList<Integer> copia = new ArrayList<>(Lista);

        System.out.println(Lista.contains(5));

        System.out.println("Lista vacia?:" + Lista.isEmpty());
        Lista.clear();
        System.out.println("Lista vacia?:" + Lista.isEmpty());

    }
}

