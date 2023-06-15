package br.raul.Java.ArraysInCollections;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos tem na sua turma: ");
        int qTurma = entrada.nextInt();


        System.out.println("Quantos teste foram feitos: ");
        int qNotas = entrada.nextInt();


        double[][] notasTurma = new double[qTurma][qNotas];
        double total = 0;
        for(int i = 0; i<notasTurma.length; i++){
             for(int j=0 ;j<notasTurma[i].length;j++){


                 System.out.printf("Aluno %d nota aplicada é de %d: " , i + 1, j + 1 );

                 notasTurma[i][j] = entrada.nextDouble();
                 total += notasTurma[i][j];
             }
         }


         double media = total/(qTurma*qNotas);
         System.out.println("Media da turma será: " + media);

        entrada.close();

    }
}
