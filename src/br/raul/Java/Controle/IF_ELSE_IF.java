package br.raul.Java.Controle;

import java.util.Scanner;

public class IF_ELSE_IF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0){
            System.out.println("Nota Invalida");
        }else if(nota >=8.5 ) {
            System.out.println("Conceito A");
        }else if(nota >=7.5 ) {
            System.out.println("Conceito B");
        }else if(nota >=6.5 ) {
            System.out.println("Conceito C");
        }else if(nota >=5.5 ) {
            System.out.println("Conceito D");
        }else {
            System.out.println("Conceito E");
        }
        System.out.println("Fim!");
        entrada.close();
    }
}
