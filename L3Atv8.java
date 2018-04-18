/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */


/*
8) Faça um programa que leia um número n e mostre na tela os n
primeiros números pares e depois os n primeiros números ímpares.
*/

package Lista3;

import java.util.Scanner;

public class L3Atv8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declarando variáveis
        int numero;
        int i = 0;
        int j = 0;

        //Entrada de dados
        System.out.println("Digite um numero: ");
        numero = input.nextInt();
        //Contadores
        i = i - numero;
        j = j - numero;

        System.out.println("Os " + numero + " primeiros pares:");
        while (i < numero) {
            i++;
            //Números pares divididos por 2 com resto 0
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        //Impressão de resultados
        System.out.println("Os " + numero + " primeiros impares:");
        while (j < numero) {
            j++;
            //Números impares divididos por 2 com resto diferente de 0
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }
}
