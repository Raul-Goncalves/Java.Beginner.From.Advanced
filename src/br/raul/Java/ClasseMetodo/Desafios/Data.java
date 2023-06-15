package br.raul.Java.ClasseMetodo.Desafios;

public class Data {


    public int dia;
    public int mes;
    public int ano;

    public Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public String obterDataFormatada() {
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }

}