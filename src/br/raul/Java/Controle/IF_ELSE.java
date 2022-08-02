package br.raul.Java.Controle;

import javax.swing.*;

public class IF_ELSE {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número");
        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0) {
            System.out.println("Número par!");
        }else {
            System.out.println("Numero é impar!");
        }
    }
}
