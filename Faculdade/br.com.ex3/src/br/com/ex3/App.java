//Elabore um programa que calcule a sequência de Fibonacci até o 30º termo. A sequência obedece ao seguinte padrão: 1, 1, 2, 3, 5, ... n.
package br.com.ex3;
public class App {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int i =0; i < 30; i ++) {
            a = a + b;
            int ab = a + b;
            b = ab;
            System.out.println(ab);
        }
    }
}
