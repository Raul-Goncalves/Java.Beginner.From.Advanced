package br.raul.Java.Controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = " ";

        do{
            System.out.println("Você precisa falar," + "as palavras mágicas");
            System.out.println("Quer sair?");
            texto = entrada.nextLine();
        }while(!texto.equalsIgnoreCase("Sim por favor"));
        entrada.close();
    }
}
