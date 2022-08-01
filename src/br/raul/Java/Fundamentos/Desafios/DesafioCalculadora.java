package br.raul.Java.Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double Num1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double Num2 = entrada.nextDouble();

        System.out.println("Digite o tipo de operação que deseja fazer (+, - , * , / , %): ");
        String operation = entrada.next();

        double resultado = "+".equals(operation) ? Num1 + Num2 : 0;
               resultado = "-".equals(operation) ? Num1 - Num2 : resultado;
               resultado = "*".equals(operation) ? Num1 * Num2 : resultado;
               resultado = "/".equals(operation) ? Num1 / Num2 : resultado;
               resultado = "/".equals(operation) ? Num1 % Num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", Num1, operation, Num2, resultado);

        entrada.close();
    }
}
