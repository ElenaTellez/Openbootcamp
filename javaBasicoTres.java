package com.company;

public class javaBasicoTres {
    public static void main(String[] args) {
        //Ejercicio Sesión 3
        //
        //En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
        //
        //Tened en cuenta que los textos pueden venir de un array de tipo String.
        //
        //Por ejemplo: String[] nombres = {"", "", "", ""}

        String[] nombres = {"caracoles, ", "hormigas, ", "abejas, ", "escarabajos... "};
        String insectos = "";


        for (int i=0; i < nombres.length; i++) {

          insectos +=nombres[i];

        }

        System.out.println("En mi jardín tenemos una gran diversidad de insectos como " + insectos);

    }

}
