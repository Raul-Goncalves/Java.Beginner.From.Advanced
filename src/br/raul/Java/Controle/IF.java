package br.raul.Java.Controle;

import java.util.Scanner;

public class IF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a media do aluno: ");
        double media = entrada.nextDouble();

        if(media >= 7.0){
            System.out.println("Aprovado");
        }
        else
            System.out.println("Reprovado");

        entrada.close();
    }
}
