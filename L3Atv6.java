/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */



/*
6) Faça um programa que leia vários conjuntos de três valores reais
e mostre para cada conjunto: sua soma, seu produto e sua média. O
programa para quando um conjunto não entrar com seus valores em
ordem crescente.
*/

package Lista3;

import java.util.Scanner;


public class L3Atv6 {

    public static void main(String[] args) {
        // Declarando variáveis
        int opc = 0;

        // Estrutura de repetição
        while (opc == 0) {
            Scanner input = new Scanner(System.in);

            //Entrada de dados
            System.out.println("Digite o primeiro número: ");
            float num1 = input.nextFloat();
            System.out.println("Digite o segundo número: ");
            float num2 = input.nextFloat();
            System.out.println("Digite o terceiro número: ");
            float num3 = input.nextFloat();

            //Condição para ver quais números são maiores
            if ((num3 > num2) && (num3 > num1) && (num2 > num1)) {
                // calculos
                float soma = num1 + num2 + num3;
                float produto = num1 * num2 * num3;
                float media = soma / 3;
                //Saida de dados
                System.out.println("SOMA: " + soma);
                System.out.println("PRODUTO: " + produto);
                System.out.println("MEDIA: " + media);

            } else {
                System.out.println("ADEUS!");
                // Condição para a saída do programa
                opc = 1;
            }
        }
    }

}
