package br.raul.Java.Fundamentos.ExerciciosConeitoBasicos;

import java.util.Scanner;

public class TemperaturaFahrenheint {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a Temperatura em Fahrenheit: ");
        double Temp = entrada.nextDouble();

        double tempFinal = ((Temp-32)*5)/9;

        System.out.println(tempFinal);

        entrada.close();

    }
}
