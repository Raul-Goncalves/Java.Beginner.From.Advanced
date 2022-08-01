package br.raul.Java.Fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5; //declaração da variavel
        System.out.println("a");

        /*

            Você não pode declarar uma variavel como double depois passar ela para char isso é impossivel

            a="Texto";
            system.out.println("a");

         */

        double b = 4.5;
        System.out.println(b);

        String c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

    }

}
