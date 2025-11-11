package org.example;

import java.util.Scanner;

public class Streamer {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** ESTADISTICAS PREMIOS ESLAND ***");
        System.out.println("------------------------------------");
        System.out.println("Inserta streamer a analizar: ");
        String streamer = entrada.next();
        System.out.println("Inserta los espectadores medidos");
        String espectadores = entrada.next();
        String[] medidos = espectadores.split(" ");
        System.out.println("Inserta el numero de comentarios");
        String comentarios = entrada.next();
        String[] comments = comentarios.split(" ");

    }
}
