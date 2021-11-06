package com.company;

//Ejercicio Sesión 4
//
//Ejercicio 1
//
//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//Crear constructor vacío y con todos los parámetros para cada clase.
//
//Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

public class SmartDevice {

    public static class SmartPhone  {

        // atributos

        String marca;
        String color;
        String modelo;

        // Constructor

        public SmartPhone(String marca, String color, String modelo) {
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
        }

        @Override
        public String toString() {
            return "Marca='" + marca + '\'' +
                    ", Color='" + color + '\'' +
                    ", Modelo='" + modelo + '\'';
        }
    }


    public static class SmartWatch {

        // atributos

        String marca;
        String color;
        String modelo;

        // Constructor

        public SmartWatch(String marca, String color, String modelo) {
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
        }

        @Override
        public String toString() {
            return "Marca='" + marca + '\'' +
                    ", Color='" + color + '\'' +
                    ", Modelo='" + modelo + '\'';

        }
    }

}
