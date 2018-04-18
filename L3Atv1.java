/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */

/*
1) Escreva um algoritmo que lê 15 valores reais, encontra o maior e
o menor deles e mostra o resultado.
*/
package Lista3;


import java.util.Scanner;

public class L3Atv1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Declarando variáveis */
        float maior = 0;
        float menor = 999999999;

        /* Iniciando loop */
        for (int i = 0; i < 15; i++) {
            float num = in.nextFloat();
            /* se o numero digitado for menor que o da variavel menor ele guarda o numero */
            if (num < menor) {
                menor = num;
            }
            /* se o numero for maior que o da variavel maior ele guarda o numero */
            if (num > maior) {
                maior = num;
            }

        }
        /* Saida de dados */
        System.out.println("MAIOR: " + maior + " menor: " + menor);
    }

}
