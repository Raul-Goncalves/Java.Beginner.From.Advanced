package br.raul.Java.Coleções;

import java.util.*;

public class ConjuntoSetComportado {

    public static void main(String[] args) {

        // Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>();

        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Raul");
        lista.add("Almeida");


        for(String LNomes: lista){
            System.out.println(LNomes);
        }



        Set<Integer> nums = new HashSet<>();

        nums.add(10);
        nums.add(52);
        nums.add(33);
        nums.add(56);

        for (int Lnums : nums){
            System.out.println(Lnums);
        }
    }
}
