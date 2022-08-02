package br.raul.Java.Controle;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "cinza";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei 1");
            case "vermlha":
                System.out.println("Sei 2");
            case "marom":
                System.out.println("Sei 3");
            case "branca":
                System.out.println("Sei 4");
            case "cinza":
                System.out.println("Sei 5");
            case "roxa":
                System.out.println("Sei 6");
            default:
                System.out.println("Sei nada");
        }
    }
}
