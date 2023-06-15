package br.raul.Java.Controle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota do seu aluno: ");
        double media = entrada.nextDouble();

        if(media>= 7.0){
            System.out.println("Aprovado");
        }else
            System.out.println("Reprovado");


        entrada.close();

    }
}
