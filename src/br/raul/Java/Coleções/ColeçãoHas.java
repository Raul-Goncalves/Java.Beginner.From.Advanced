package br.raul.Java.Coleções;

import java.util.HashSet;

public class ColeçãoHas {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("Raul"));
        usuarios.add(new Usuario("Luis"));
        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Carol"));

        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado);
    }
}
