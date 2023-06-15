package br.raul.Java.ClasseMetodo;

import br.raul.Java.ClasseMetodo.Desafios.Data;

public class ValorNull {

    public static void main(String[] args) {

    /*/
       Não pode acessar nenhum Atributo de Classe caso o NULL estejá declarado, pois declara um valor errado
     */


    // Pode chamar a variavel apesar dela estar vazia!
        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null;

        if (d1 != null){
            d1.mes = 3;
            System.out.println(d1.obterDataFormatada());
        }

    //  Não pode fazer isso, pois viola uma regra de execução de NULL

        String d2 = Math.random() > 0.5 ? "Opa" : null;
        if(d2 != null ){
            System.out.println(d2.concat("????"));
        }
    }
}
