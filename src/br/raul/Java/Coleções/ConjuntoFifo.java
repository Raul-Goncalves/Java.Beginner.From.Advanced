package br.raul.Java.Coleções;

import java.util.LinkedList;
import java.util.Queue;

public class ConjuntoFifo {

    public static void main(String[] args) {

        Queue<String> fifo = new LinkedList<>();

        fifo.add("AnA");
        fifo.offer("Bia");
        fifo.add("Rafael");
        fifo.offer("KiKO");
        fifo.add("Luisa");

        System.out.println(fifo.peek());
        System.out.println(fifo.element());

        //fifo.clear();
        //fifo.size();
        //fifo.isEmpety();

        System.out.println(fifo.poll());
        System.out.println(fifo.remove());
        System.out.println(fifo.poll());
        System.out.println(fifo.poll());
        System.out.println(fifo.poll());
    }
}
