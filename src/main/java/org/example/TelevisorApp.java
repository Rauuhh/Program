package org.example;

public class TelevisorApp {
    static void main() {

        Televisor lg = new Televisor(5,50);
        lg.subirCanal();
        lg.subirCanal();
        lg.subirCanal();
        lg.bajarVolumen();
        lg.bajarVolumen();
        lg.bajarCanal();
        lg.subirVolumen();
        System.out.println(lg.getCanal() + " " + lg.getVolumen());

    }
}
