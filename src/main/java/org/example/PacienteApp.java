package org.example;

import java.net.ServerSocket;
import java.util.Scanner;

public class PacienteApp {
    static Scanner entrada = new Scanner(System.in);
    static void main() {
        System.out.println("Introduce nombre");
        String nombre = entrada.nextLine();
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt();
        System.out.println("Introdue tu genero");
        char genero = entrada.next().charAt(0);
        System.out.println("Introduce tu peso");
        float peso = entrada.nextFloat();
        System.out.println("Introduce tu altura:");
        int altura = entrada.nextInt();

        Paciente paciente = new Paciente(nombre,edad,genero,peso,altura);
        System.out.println(paciente.calcularIMC());
        System.out.println(paciente.esMayorDeEdad());
        System.out.println(paciente);
        Paciente paciente2 = new Paciente(nombre,edad,genero,0,0 );
        System.out.println(paciente2.calcularIMC());
        System.out.println(paciente2.esMayorDeEdad());
        System.out.println(paciente2);
        Paciente paciente3 = new Paciente();
        paciente3.setNombre("Juan");
        paciente3.setEdad(25);
        paciente3.setGenero('H');
        paciente3.setPeso(75.5);
        paciente3.setAltura(180);
        System.out.println(paciente3.calcularIMC());
        System.out.println(paciente3.esMayorDeEdad());
        System.out.println(paciente3);


    }
}
