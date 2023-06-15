package br.raul.Java.ArraysInCollections;

import br.raul.Java.ClasseMetodo.Desafios.Data;

public class Equals {

    public static void main(String[] args) {

        Usuario  u1 = new Usuario();

        u1.nome="Raul Gonçalves";
        u1.email="raulog6@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome="Raul Gonçalves";
        u2.email="raulog6@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Data()));
    }
}
