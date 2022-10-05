//Escreva um programa para preencher uma matriz unidimensional (vetor) com 15 posições de números inteiros e, em seguida, apresente os elementos.
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner xx = new Scanner(System.in);
        ArrayList numeros = new ArrayList();
            for (int i = 1; i <= 15; i++) {
                System.out.println("Digite o "+i+"º Elemento: ");
                numeros.add(xx.nextInt());
            }
            System.out.println("Elementos digitados: "+numeros);
        xx.close();
    }
}
