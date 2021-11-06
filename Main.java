package com.company;

public class Main {
    public static void main(String[] args) {

        SmartDevice.SmartPhone movil = new SmartDevice.SmartPhone("Samsung", "rojo", "k55");
        SmartDevice.SmartWatch reloj = new SmartDevice.SmartWatch("Samsung", "verde", "k56");

        System.out.println("Mi móvil es:\n" + movil.toString());
        System.out.println("\nY mi reloj es:\n" + reloj.toString());

        System.out.println("\nAmbos son totalmente compatibles y no me dan ningún fallo.");

    }
}
