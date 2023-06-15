package br.raul.Java.Controle;

import java.util.Scanner;

public class If_Else_If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota do aluno");
        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0){
            System.out.println("Nota Inválida");
        } else if (nota >= 8.5) {
            System.out.println("Nota: A");
        } else if (nota >= 7.5) {
            System.out.println("Nota: B");
        } else if (nota >= 6.5) {
            System.out.println("Nota: C");
        } else if (nota >= 5.5) {
            System.out.println("Nota: D");
        }else
            System.out.println("Nota: F");

        entrada.close();
    }
}
