package br.raul.Java.ClasseMetodo;

public class Produto {

    String nome;

    double preco;

     static double desconto = 0.25;

    Produto(String NomeInicial){ nome = NomeInicial; }

    Produto(String NomeInicial, double PrecoIncial){
        nome = NomeInicial;
        preco = PrecoIncial;
    }

    double PDesconto(){
        return preco*(1-desconto);
    }
    double PComDesconto(double DDoGerente){
        return preco * (1 - desconto + DDoGerente);
    }
}


