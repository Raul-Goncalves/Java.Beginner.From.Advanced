package br.raul.Java.ArraysInCollections;

import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {


        double[] NotaAlunoA = new double[3];

        NotaAlunoA[0] = 1;
        NotaAlunoA[1] = 2;
        NotaAlunoA[2] = 3;

        System.out.println(Arrays.toString(NotaAlunoA));

        double totalA = 0;
        for (int i = 0; i < NotaAlunoA.length; i++) {
            totalA += NotaAlunoA[i];
        }
        System.out.println(totalA / NotaAlunoA.length);

        double[] NotasAlunoB = {3, 4, 5};

        double totalB = 0;
        for (int i = 0; i < NotasAlunoB.length; i++) {
            totalB += NotasAlunoB[i];
        }
        System.out.println(totalB / NotasAlunoB.length);
    }

    public static class Matriz {
    }
}
