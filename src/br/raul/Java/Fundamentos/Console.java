package br.raul.Java.Fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome =  entrada.nextLine();

        System.out.println("Digite o seu sobrenome:");
        String sobrenome =  entrada.nextLine();

        System.out.println("Digite o sua idade:");
        int idade =  entrada.nextInt();

        System.out.printf("Nome: %s %s" + " \nIdade: %d", nome,sobrenome,idade);
        entrada.close();
    }
}
