package br.raul.Java.Controle.Exercicios;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

//       int bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

        int bissexto = 0; // esse não faz nada somente o de cima que faz!!


        if (bissexto == 0) {
            System.out.println(ano + " é um ano bissexto");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }
        scanner.close();
    }

}

