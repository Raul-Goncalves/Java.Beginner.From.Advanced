package br.raul.Java.Fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {

        double raio = 3.4; //VARIAVEL
        final double  pi = 3.14159; //CONSTANTE

        //final é uma opção que nunca sera mudando o numero de pi caso coloque outro numero em pi

        double area = pi * raio * raio ;
//
//		System.out.println(pi * raio * raio);
//
        System.out.println(area);

        raio = 10;

        area = pi * raio * raio;

        System.out.println("Área do Circulo: " + area);
    }
}
