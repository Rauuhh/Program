package org.example;

public class Televisor {

    private static final int DEF_CANAL = 1;
    private static final int DEL_VOLUMEN = 5;

    private int canal;
    private int volumen;


    public  Televisor(){
        this.canal = DEF_CANAL;
        this.volumen = DEL_VOLUMEN;
    }

    public Televisor(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }

    public void subirCanal(){
        if (canal > 0 && canal < 99) {
            canal++;
            System.out.println("Nuevo volumen " +  canal);
        }else{
            canal = 1;
        }
    }

    public void bajarCanal(){
        if (canal > 0 && canal < 99) {
            canal--;
            System.out.println("Nuevo canal " +  canal);

        }else{
            canal = 99;
        }
    }

    public void subirVolumen(){
        if (volumen >= 0 && volumen < 100){
            volumen++;
            System.out.println("Nuevo volumen " +  volumen);

        }
    }

    public void bajarVolumen(){
        if (volumen > 0 && volumen <= 100){
            volumen--;
            System.out.println("Nuevo volumen " +  volumen);
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
