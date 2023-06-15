package br.raul.Java.ArraysInCollections.Desafios;

import java.util.Scanner;

public class DesafioNotaAluno {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas serão? ");
        int qNotas = entrada.nextInt();

        double notas[] = new double[qNotas];

        for (int i=0;i<notas.length;i++){
            System.out.println("Nota " + (i + 1) + " :");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota:notas){
            total += nota;
        }

        System.out.println("Á média do aluno será de exatamente " + total/notas.length);
        entrada.close();

    }
}
