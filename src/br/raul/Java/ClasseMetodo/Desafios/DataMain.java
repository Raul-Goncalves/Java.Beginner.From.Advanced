package br.raul.Java.ClasseMetodo.Desafios;

public class DataMain {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.imprimirDataFormatada();
        d1.ano = 2022;

        var d2 = new Data(31,12,2022);

        System.out.println(d1.obterDataFormatada());
        System.out.printf("%s/%s/%s" , d2.dia , d2.mes , d2.ano);
    }
}
