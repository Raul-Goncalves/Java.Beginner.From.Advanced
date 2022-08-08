package br.raul.Java.ClasseMetodo;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String NomeIncial){
        nome = NomeIncial;
    }

    Produto(String NomeIncial, double PrecoInicial, double DescontoIncial){
        nome = NomeIncial;
        preco = PrecoInicial;
        desconto = DescontoIncial;
    }

    Produto(){

    }


    double PDesconto(){
        return preco * (1-desconto);
    }




}
