package br.raul.Java.Coleções;

import java.util.ArrayList;

public class ConjuntoList {

    public static void main(String[] args) {


        ArrayList<Usuario> list = new ArrayList<>();

        Usuario u1 = new Usuario("AnA");
        list.add(u1);

        list.add(new Usuario("Raul"));
        list.add(new Usuario("Davi"));
        list.add(new Usuario("Rute"));
        list.add(new Usuario("Luis"));

        System.out.println(list.get(3));

        System.out.println(list.remove(1));
        System.out.println(list.remove(new Usuario("Davi")));

        System.out.println("TEM  ? " + list.contains(new Usuario("Rute")));
        System.out.println("TEM  ? " + list.contains(u1));

        for (Usuario u : list) {
            System.out.println(u.nome);
        }
    }
}
