package br.raul.Java.Fundamentos.ExerciciosConeitoBasicos;

import java.util.Scanner;

public class TemperaturaCelsius  {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a Temperatura em Celsius: ");
        double Temp = entrada.nextDouble();

        double tempFinal = ((Temp*9)/5)+32;

        System.out.println(tempFinal);

        entrada.close();

    }
}
