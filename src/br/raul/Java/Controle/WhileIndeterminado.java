package br.raul.Java.Controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!valor.equalsIgnoreCase("Sair")){
            System.out.println("Você diz: ");
            valor= entrada.nextLine();
        }

        entrada.close();
    }
}
