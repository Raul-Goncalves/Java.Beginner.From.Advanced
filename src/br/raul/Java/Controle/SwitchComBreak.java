package br.raul.Java.Controle;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a sua nota: ");
        int nota = entrada.nextInt();
        String conceito = "";

        switch (nota) {
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "A";
                break;
            case 8:
                conceito = "A";
                break;
            case 7:
                conceito = "B";
                break;
            case 6:
                conceito = "B";
                break;
            default:
                conceito = "Não foi informado sua nota";
        }

        System.out.println("Conceito é " + conceito);
        entrada.close();


    }
}
