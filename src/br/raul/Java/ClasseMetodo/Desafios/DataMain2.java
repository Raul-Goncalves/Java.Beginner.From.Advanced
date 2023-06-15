package br.raul.Java.ClasseMetodo.Desafios;

import java.util.Scanner;

public class DataMain2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia: ");
        double d1 = entrada.nextDouble();
        System.out.println("Digite um mês: ");
        double m1 = entrada.nextDouble();
        System.out.println("Digite um ano: ");
        double a1 = entrada.nextDouble();

        System.out.printf("Data: %f/%f/%f" + d1,m1,a1);

        entrada.close();


    }
}
