package br.raul.Java.ClasseMetodo.Desafios;

public class dPessoa  {

    String nome;
    double peso;

   dPessoa (String nomePessoa, double pesoPessoa){
       this.nome=nomePessoa;
       this.peso=pesoPessoa;
    }

    void  comer (dComida dcomida){

       if(dcomida != null){
           this.peso += dcomida.peso;
       }
    }

    String apresentar(){
       return "Olá sou o " + nome + " e tenho " + peso + "KGS";
    }
}
