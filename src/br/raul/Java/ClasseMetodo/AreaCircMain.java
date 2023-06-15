package br.raul.Java.ClasseMetodo;

public class AreaCircMain {

    public static void main(String[] args) {

        AreaCirc a1= new AreaCirc(10);

        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5);

        System.out.println(a2.area());
        System.out.println(a1.area());
        System.out.println(AreaCirc.PI);

    }
}
