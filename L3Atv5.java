/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */

/*
5) Faça um programa que leia vários inteiros positivos e mostre, no
final, a soma dos números pares e a soma dos números ímpares. O
programa para quando entrar um número maior que 1000.
*/


package Lista3;

import java.util.Scanner;

public class L3Atv5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaracao das variaveis
        int par = 0;
        int impar = 0;
        int i = 0;

        //Entrada de dados
        while (i <= 1000) {
            i = input.nextInt();

            //Condição para par
            if (i % 2 == 0) {
                par = par + i;
            } else //Condição para ímpar 
            {
                impar = impar + i;
            }
        }
        //Impressão de resultados
        System.out.println("Soma dos Pares:" + par + "  Soma dos Impares: " + impar);

    }
}
