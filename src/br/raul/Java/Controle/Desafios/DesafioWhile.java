package br.raul.Java.Controle.Desafios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Qnota = 0;
        double nota = 0,total = 0;

        while (nota != -1){
            System.out.println("Informe um nota:");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                total += nota;
                Qnota++;
            } else if (nota != -1) {
                System.out.println("Nota Inválida tente novamente");
            }
        }
        double media = total/Qnota;
        System.out.println("Média: "+ media);
        entrada.close();
    }
}
