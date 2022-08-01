package br.raul.Java.Fundamentos.Operadores;

public class Ternario {

    public static void main(String[] args) {

        double media = 6.5;
        String reprovado = media >= 5.0 ? "RECUPERAÇÃO" : "REPROVADO";
        String resultado = media >=7.0 ? "APROVADO" : reprovado;


        System.out.println("O aluno está: " + resultado);
    }
}
