package br.raul.Java.ClasseMetodo;


public class ProdutoMain {


    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 2546.89, 0.25);

        var p2 = new Produto("");
        p2.nome= "Caneta";
        p2.preco= 26.00;
        p2.desconto= 0.30;


        System.out.println(p2.nome);
        System.out.println(p1.nome);
        System.out.println(p1.PDesconto());

    }
}
