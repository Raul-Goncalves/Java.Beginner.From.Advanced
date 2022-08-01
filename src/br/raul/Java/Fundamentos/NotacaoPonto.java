package br.raul.Java.Fundamentos;

import java.util.Locale;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom Dia X";

        s = s.toUpperCase(Locale.ROOT);
        s = s.replace("X", "Raul Gonçalves");
        s = s.concat("!!!");

        System.out.println(s);

        /*
            O java ele funciona de forma com o quem vem primeiro então seria o mesmo metodo de se vestir
            primeiro você coloca a roupa interios antes de roupa exterior o java funciona como nos se vestimos
         */

        String z = "Bom Dia X";
        z = z.replace("X", "Raul Gonçalves");
        z = z.toUpperCase();
        z = z.concat("!!!");

        System.out.println(z);


        String x =  "Raul".toUpperCase();
        System.out.println(x);

        String y = "Bom Dia Mano".replace("Dia", "Noite").toUpperCase(Locale.ROOT).concat("!!!");
        System.out.println(y);

        String k = "Bom Noite Mano"
                .replace("Dia", "Dia")
                .toUpperCase(Locale.ROOT)
                .concat("!!!");
        System.out.println(k);


    }
}
