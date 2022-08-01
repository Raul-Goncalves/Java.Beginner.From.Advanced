package br.raul.Java.Fundamentos.ExerciciosConeitoBasicos;

import java.util.Scanner;

public class CalculadoraDaAreaTringulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura do Tringulo");
        double altura = entrada.nextDouble();

        System.out.println("Digite a base do Triangulo");
        double base = entrada.nextDouble();

        double area = (base*altura)/2;

        System.out.println("Area do Triangulo sera de: " + area);

        entrada.close();
    }
}
