package org.example;

import org.example.Libro.Estudiante;

public class EstudianteApp {
    static void main() {
        Estudiante jorge = new Estudiante("Jorge","1DAM","jorge@iesmutxamel.com");
        System.out.println(jorge.getNia());
        System.out.println(jorge);
        Estudiante raul = new Estudiante("Raul");
        System.out.println(raul.getNia());
        System.out.println(raul);

        Estudiante adrian = new Estudiante("Adrian");

        System.out.println(Estudiante.validarCorreo(jorge.getEmail()));
    }
}
