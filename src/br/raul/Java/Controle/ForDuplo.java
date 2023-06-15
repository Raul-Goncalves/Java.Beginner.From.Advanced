package br.raul.Java.Controle;

public class ForDuplo {

    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            for(int j=0; j<20; j++){
                System.out.printf("[ i= %d | j= %d",i,j);
            }
            System.out.println("\n");
        }
    }
}
