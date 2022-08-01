package br.raul.Java.Fundamentos;


import javax.swing.JOptionPane;

public class ConversaoStringNumero {

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite um numero para guardamos");
        String num2 = JOptionPane.showInputDialog("Digite um segundo para guardamos");

        System.out.println("Numero Inserido: " + num1);
        System.out.println("Numero Inserido: " + num2);


        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);

        double soma =  numero1 + numero2;
        System.out.println("Soma dos numeros:" + soma);
    }

}
