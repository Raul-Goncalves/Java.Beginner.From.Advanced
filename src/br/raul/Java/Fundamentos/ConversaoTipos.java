package br.raul.Java.Fundamentos;

public class ConversaoTipos {

    public static void main(String[] args) {

        double a = 1; // Conversão implicita
        System.out.println(a);

        float b = (float) 1.23456742344; // Conversão explicita (CAST)
        System.out.println(b);

        int c = 340; // Conversão explicita (CAST)
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999; // Conversão explicita (CAST)
        int f = (int) e;
        System.out.println(f);
    }
}
