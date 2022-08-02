package br.raul.Java.Controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        /*

            if(...) sentença; ou {}
            while(...) sentença; ou {}
            for(...,...,...] sentença; ou {}

            do {} sentença; ou {}  while[...];

         */


        Scanner entrada = new Scanner(System.in);

        String text = "";

        do{
            System.out.println("Você precisa falar," + "as palavras mágicas");
            System.out.println("Quer sair?");
            text = entrada.nextLine();
            }while(!text.equalsIgnoreCase("Por favor"));

        entrada.close();

    }
}
