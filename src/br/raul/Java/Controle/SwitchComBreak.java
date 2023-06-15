package br.raul.Java.Controle;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a nota do aluno: ");
        int nota = entrada.nextInt();
        String notafinal = " ";

        switch (nota){
            case 10:
                notafinal = "A";
                break;
            case 9:
                notafinal = "B";
                break;
            case 8:
                notafinal = "C";
                break;
            case 7:
                notafinal = "D";
                break;
            case 6:
                notafinal = "E";
                break;
            default:
                notafinal = ("A nota do aluno não foi intruzida! tente novamente");
        }

        System.out.println("NOTA: " + notafinal);
        entrada.close();

    }
}
