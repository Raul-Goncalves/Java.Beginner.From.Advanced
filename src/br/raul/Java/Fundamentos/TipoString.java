package br.raul.Java.Fundamentos;

import java.util.Locale;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa Tarde Familia";

        System.out.println(s.concat("!!"));
        System.out.println(s + "!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase(Locale.ROOT).startsWith("boa"));
        System.out.println(s.toUpperCase(Locale.ROOT).endsWith("FAMILIA"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase(Locale.ROOT).equals("boa tarde familia"));
        System.out.println(s.equalsIgnoreCase("boa tarde familia"));

        String Nome = "Raul";
        String sobrenome = "Gonçalves";
        int idade = 20;
        double salario = 2300;

        System.out.println("Nome: "+ Nome + " " + sobrenome +
                         "\nIdade: " + idade +
                         "\nSalario: " + salario);


    }
}
