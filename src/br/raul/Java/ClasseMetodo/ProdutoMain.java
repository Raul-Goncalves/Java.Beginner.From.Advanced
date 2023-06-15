package br.raul.Java.ClasseMetodo;

public class ProdutoMain {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 2456.89);


        var p2 = new Produto("");
        p2.nome="Caneta";
        p2.preco= 26.00;

        Produto.desconto = 0.29;

        System.out.println(p2.nome);
        System.out.println(p1.nome);
        System.out.println(p1.PDesconto());

         double PFinal1 = p1.PComDesconto(0);
         double PFinal2 = p2.PComDesconto(0.1);
         double MediaCar = (PFinal1 + PFinal2)/2;

        System.out.printf("Media do carrinho = %.2f€", MediaCar);
    }
}
