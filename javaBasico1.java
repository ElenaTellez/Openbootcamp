package com.company;

public class JavaBasico1 {

    public static void main(String[] args) {
        //Ejercicio Sesión 1 --> Para este primer ejercicio tendréis que realizar lo siguiente:
        //
        // - Crea un proyecto de Java desde 0
        // - Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
        // - Dentro de la clase tenéis que crear el método main e imprimir todos los datos
        //   que se han visto en las sesiones.
        //
        //Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.

        //numericos
        //enteros


        byte variable1 = 1;
        short variable2 = 11;
        int variable3 = 567;
        long variable4 = 891011;

        //decimales
        float variable5 = 3.8f;
        double variable6 = 4.9;

        //texto
        char variable7 = 'j';
        String variable8 = "gato";

        //booleanos
        boolean variable9 = true;
        boolean variable10 = false;

        System.out.println("Las variables de datos numéricos según el tamaño que ocupan son: byte (" + variable1 + "), " +
                "short(" + variable2 + "), int(" + variable3 + ") y long(" + variable4 + ").");
        System.out.println("\nSi esta variables numéricas tienen decimales son: float(" + variable5 + "f) y " +
                "double(" + variable6 + ").");
        System.out.println("\nLas variables de texto según el tamaño que ocupan son: char (" + variable7 + "), " +
                "y String(" + variable8 + ").");
        System.out.println("\nAdemás tenemos las variables booleanas que devuelven: Verdadero(" + variable9 + ") o " +
                "Falso(" + variable10 + ").");

    }
}
