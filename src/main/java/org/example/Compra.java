package org.example;
import java.util.*;
import java.util.ArrayList;

public class Compra {

    static void main() {
        ArrayList<String> compra = new ArrayList<>();
        System.out.println(compra.isEmpty());
        compra.add("Pan");
        System.out.println(compra.isEmpty());
        compra.addAll(Arrays.asList("tomate","jamon","tocino","jacobo"));
        compra.add(1,"Queso");
        System.out.println(compra.contains("Leche"));
        boolean repe = false;
        compra.add("Queso");
        System.out.println(compra.contains("jamon"));
        for (int i = 0; i < compra.size(); i++) {
            if (compra.get(i).equals(compra.get(compra.size()-1))){
                repe = true;
                break;
            }
        }
        if (repe){
            compra.removeLast();
        }
        System.out.println(compra.size()-1);
        ArrayList<String> copia = new ArrayList<>(compra);
        copia.clear();
        System.out.println(copia.isEmpty());
        boolean sonIguales = compra.equals(copia);
        copia.add("Manteca");
        copia.add("Polvoron");
        ArrayList<String> faltantes = new ArrayList<>(compra);
        faltantes.removeAll(copia);
        System.out.println(faltantes);

        ArrayList<Integer> precio = new ArrayList<>(compra.size());
        precio.addAll(Arrays.asList(10,6,8,6,4,6));

    }
}
