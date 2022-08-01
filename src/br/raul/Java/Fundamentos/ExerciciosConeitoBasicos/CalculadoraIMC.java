package br.raul.Java.Fundamentos.ExerciciosConeitoBasicos;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu Peso em Kilos: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite á sua Altura (Colocar Virgula!): ");
        double altura = entrada.nextDouble();

        double IMC= peso/(altura*altura);

        System.out.println(IMC);

        entrada.close();
    }
}
