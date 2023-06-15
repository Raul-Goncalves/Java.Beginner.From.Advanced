package br.raul.Java.ArraysInCollections;

public class Foreach {

    public static void main(String[] args) {

        double[] a = {3.2,4.4,5.6};

        for (int i = 0;  i < a.length; i++){
            System.out.println(a[i] + " ");
        }

        for (double as:a) {
            System.out.println(as + " ");

        }
    }
}
