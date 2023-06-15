package br.raul.Java.Controle;

import java.util.Locale;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "cinza";

        switch (faixa.toLowerCase(Locale.ROOT)){
            case "preta":
                System.out.println("PRETA");
            case "vermelho":
                System.out.println("VERMLHO");
            case "marom":
                System.out.println("MAROM");
            case "branco":
                System.out.println("BRANCO");
            case "cinza":
                System.out.println("CINZA");
            case "roxo":
                System.out.println("ROXO");
            default:
                System.out.println("Qual é a cor escolhida?");

        }

    }
}
