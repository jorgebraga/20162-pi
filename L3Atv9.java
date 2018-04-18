/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */

/*
9) Faça um programa que leia um número n e imprima se ele é primo ou
não. (um número primo tem apenas 2 divisores: 1 e ele mesmo! O
número 1 não é primo!!!)
*/


package Lista3;

import java.util.Scanner;

public class L3Atv9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // declaração de variáveis
        int primo;
        int contador = 0;

        //Entrada de dados
        System.out.println("Digite um número: ");
        primo = input.nextInt();

        //Verificação se o numéro digitado é primo
        for (int i = 1; i <= primo; i++) {

            if (primo % i == 0) {
                //Caso haja divisão com resto zero, adiciona 1 ao contador
                contador++;
            }

        }
        //Imoprime true caso o numero seja primo
        if (contador == 2) {
            System.out.println("O número " + primo + " é primo!");
        } //Caso não seja, imprime false
        else {
            System.out.println("O número " + primo + " não é primo.");
        }

    }

}
