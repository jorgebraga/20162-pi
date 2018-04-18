/* Projeto Parte 1
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */


/*
10) Faça um programa que leia um número n e mostre na tela os n
primeiros números primos.
*/

package Lista3;

import java.util.Scanner;


public class L3Atv10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Entrada de dados
        System.out.println("Digite um número: ");
        int num = in.nextInt();

        //Estrutura de repetição que vai contar até o número digitado
        for (int j = 1; j <= num; j++) {
            int contador = 0;
            //Estrutura de repetição que vai testar o "i" do primeiro for
            for (int i = 1; i <= num; i++) {
                if (j % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(j);
            }
        }

    }
}
