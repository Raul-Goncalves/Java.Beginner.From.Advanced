package br.raul.Java.Controle.Desafios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantiaNotas = 0;
        double nota = 0;
        double total= 0;

        while(nota != -1) {
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0) {
                total += nota;
                quantiaNotas++;
            }else if(nota != -1){
                System.out.println("Nota Inválida!");
            }
        }

        double media = total/quantiaNotas;
        System.out.println("Media = "+ media);


        entrada.close();
    }

}
