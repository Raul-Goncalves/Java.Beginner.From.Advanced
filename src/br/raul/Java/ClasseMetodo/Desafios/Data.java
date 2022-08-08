package br.raul.Java.ClasseMetodo.Desafios;

public class Data {

        int dia;
        int mes;
        int ano;

        String ObterDataFormatada (){
                return  String.format("%d/%d/%d", dia, mes, ano);

        }

        Data(){
                dia = 1;
                mes = 1;
                ano = 1920;

        }
        Data(int DiaIncial, int MesIncial, int AnoInicial){
                dia = DiaIncial;
                mes = MesIncial;
                ano = AnoInicial;

        }
}
