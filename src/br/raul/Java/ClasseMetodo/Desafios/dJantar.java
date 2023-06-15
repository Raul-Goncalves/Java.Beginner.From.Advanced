package br.raul.Java.ClasseMetodo.Desafios;

public class dJantar {

    public static void main(String[] args) {

         dPessoa dp = new dPessoa("Raul", 98.8);

         dComida dc1 = new dComida("Macarão" , 1.5);
         dComida dc2 = new dComida("Linguiça" , 1.6);
         dComida dc3 = new dComida("Feijão" , 1.7);

         System.out.println(dp.apresentar());
         dp.comer(dc1);

         System.out.println(dp.apresentar());
         dp.comer(dc2);

         System.out.println(dp.apresentar());
         dp.comer(dc3);
    }
}
