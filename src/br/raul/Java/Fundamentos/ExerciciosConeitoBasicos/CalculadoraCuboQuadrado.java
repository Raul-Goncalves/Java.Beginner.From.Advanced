package br.raul.Java.Fundamentos.ExerciciosConeitoBasicos;

import java.util.Scanner;

public class CalculadoraCuboQuadrado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor para colocar em Cubo/Quadrado");
        double Numero = entrada.nextDouble();

        double Cubo = Numero*Numero*Numero;
        double Quadrado = Numero * Numero;

        System.out.println("Resultado Elevado ao Cubo = " +  Cubo);
        System.out.println("Resultado Elevado ao Quadrado = " +  Quadrado);

        entrada.close();
    }
}
