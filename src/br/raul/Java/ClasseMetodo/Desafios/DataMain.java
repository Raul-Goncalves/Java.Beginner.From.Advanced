package br.raul.Java.ClasseMetodo.Desafios;

public class DataMain {

    public static void main(String[] args) {


        Data d1 = new Data();

        var d2 = new Data( 31, 12,2020);


        System.out.println(d1.ObterDataFormatada());
        System.out.printf("%d/%d/%d", d2.dia,d2.mes,d2.ano);

    }
}
