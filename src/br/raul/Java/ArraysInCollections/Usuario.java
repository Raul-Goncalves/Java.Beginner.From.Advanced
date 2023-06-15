package br.raul.Java.ArraysInCollections;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof  Usuario) {
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email == this.email;


            return nomeIgual && emailIgual;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
