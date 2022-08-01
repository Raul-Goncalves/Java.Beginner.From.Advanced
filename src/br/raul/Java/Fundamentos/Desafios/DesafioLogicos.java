package br.raul.Java.Fundamentos.Desafios;

public class DesafioLogicos {

    public static void main(String[] args) {


        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean ComprouATv50 = trabalho1 && trabalho2;
        boolean ComprouATv32 = trabalho1 ^ trabalho2;
        boolean ComprouSorvete= trabalho1 || trabalho2;

        boolean maisSaudavel = !ComprouSorvete;

        System.out.println("Comprou a Tv 50 ?: " + ComprouATv50);
        System.out.println("Comprou a Tv 32 ?: " + ComprouATv32);
        System.out.println("Comprou Tv 32 e o Sorvete ?: " + ComprouSorvete);


        System.out.println("Mais Saudavel? " + maisSaudavel);



    }
}
