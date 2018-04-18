package Lista1;

/* Lista de atividades 1
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */
 /*
5. Faça um algoritmo em fluxograma e pseudocódigo (VISUALG) que
efetue a leitura de um número inteiro e apresente o resultado do
quadrado deste número.
 */

import java.util.Scanner;

public class L1Atv5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Entrada de dados
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        //Dados de saída
        int quadrado = (numero * numero);
        System.out.println("O quadrado é: " + quadrado);
    }

}
