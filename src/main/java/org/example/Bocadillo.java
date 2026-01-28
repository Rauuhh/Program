package org.example;

public class Bocadillo {

    private String nombre;
    private String pan;
    private String ingreiente;
    private String salsa;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getIngreiente() {
        return ingreiente;
    }

    public void setIngreiente(String ingreiente) {
        this.ingreiente = ingreiente;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Bocadillo(String nombre, String pan, String ingreiente, String salsa, double precio) {
        this.nombre = nombre;
        this.pan = pan;
        this.ingreiente = ingreiente;
        this.salsa = salsa;
        this.precio = precio;
    }

    public Bocadillo(){

    }

    public void imprimirBocata(){
        System.out.println("Nombre " +  this.nombre + " Tipo pan: " + this.pan + " Ingrediente: " + this.ingreiente + " Salsa: " + this.salsa + " Precio: " + this.precio);
    }
}

