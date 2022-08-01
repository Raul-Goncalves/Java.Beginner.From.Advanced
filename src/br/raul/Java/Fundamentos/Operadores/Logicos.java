package br.raul.Java.Fundamentos.Operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean condicion1 = true;
        boolean condicion2 = 3 > 7;

        System.out.println(condicion1 && !condicion2);
        System.out.println(condicion1 || condicion2);
        System.out.println(condicion1 ^ condicion2);
        System.out.println(!!condicion1);
        System.out.println(!condicion2);

        System.out.println("\nTabela da Verdade E (AND)\n");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTabela da Verdade OU (OR)\n");
        //  System.out.println(true || true);
        //  System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela da Verdade OU EXCLUSIVO (XOR)\n");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela da Verdade NOT (XOR)\n");
        System.out.println(!true);
        System.out.println(!false);

    }
}
