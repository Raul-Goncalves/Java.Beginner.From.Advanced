package br.raul.Java.Controle;

import javax.swing.*;

public class If_Else {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("Número é par");
        }else
            System.out.println("Número é impar");
    }
}
