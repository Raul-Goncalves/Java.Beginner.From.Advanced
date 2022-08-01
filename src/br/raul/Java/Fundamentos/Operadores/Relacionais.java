package br.raul.Java.Fundamentos.Operadores;

public class Relacionais {

    public static void main(String[] args) {

        int  a = 97;
        int b = a;

        System.out.println(a == b);

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        boolean goodComport = true;
        int nota = 7;
        if(nota >= 7){
            System.out.println("Conseguiu passar? \n" + nota);
        }else{
            System.out.println("Não conseguir atingir a nota");
        }
    }
}
