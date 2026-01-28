package org.example;


import java.awt.*;
import java.util.Random;


public class Paciente {
    static Random aleatorio = new Random();
    private static final char DEF_GENERO = 'X';
    private static final int DEF_INFRAPESO= -1;
    private static final int DEF_PESO_IDEAL= 0;
    private static final int DEF_SOBREPESO= 1;
    private final static int DEF_EDAD = 18;

    private String nombre;
    private int edad;
    private String dni;

    @Override
    public String toString() {
        return  "PACIENTE[ Nombre: " + this.nombre + " Edad: " + this.edad + " Genero: " + this.genero + " DNI: " + this.dni + " Peso: " + this.peso + " Altura: " + this.altura + " ]";

    }

    private char genero;
    private double peso;
    private int altura;


    public Paciente(String nombre, int edad, char genero, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        dni = generarDNI();
        this.genero = validarGenero(genero);
        this.peso = peso;
        this.altura = altura;
    }


    public Paciente() {
        this(null, 0, DEF_GENERO, 0, 0);

    }

    private  String generarDNI() {
        final char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        String dni = "";
        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(9) +1;
            dni += Integer.toString(num) ;
        }

        int posi = Integer.parseInt(dni) % 23;
        String letra = String.valueOf(letras[posi]);
        dni += letra;
        return  dni  ;
    }

    public int calcularIMC(){
        double resultado;
        resultado = peso / Math.pow((double) altura /100,2);

        if (resultado< 20){
            return DEF_INFRAPESO;
        } else if (resultado > 25) {
            return DEF_SOBREPESO;
        }else {
            return DEF_PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad(){
        if (edad < DEF_EDAD){
            return false;
        }
        return true;
    }

    private char validarGenero(char genero){
        if (genero == 'H' || genero == 'M'){
            return genero;
        }
        return DEF_GENERO;
    }

    public void mostrarInfoPaciente(){
        System.out.println("Nombre: " + this.nombre + " Edad: " + this.edad + " Genero: " + this.genero + " DNI: " + this.dni + " Peso: " + this.peso + " Altura: " + this.altura);
    }

    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public int getAltura() {
        return altura;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public char getGenero() {
        return genero;
    }


    public void setGenero(char genero) {
        this.genero = genero;
    }








}
