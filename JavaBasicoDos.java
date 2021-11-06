package com.company;
import java.util.Scanner;

public class JavaBasicoDos {
    public static void main(String[] args) {
        //Ejercicio Sesión 2
        //
        //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, introduzca la base imponible:");
        int precio = s.nextInt();

        double precioIva = precio + precio*0.21;

        System.out.println("Base Imponible: " + precio);
        System.out.println("IVA(21%):        " + precio*0.21);
        System.out.println("_______________________");
        System.out.println("TOTAL:          " + precioIva);
        }

}
