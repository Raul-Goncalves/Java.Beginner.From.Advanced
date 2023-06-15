package br.raul.Java.ClasseMetodo;

public class AreaCirc {


     double raio;

     static double PI = 3.1415;

     AreaCirc(double raioInicial){
         raio = raioInicial;
     }
     double area(){
         return PI * Math.pow(raio,2);
     }
}
