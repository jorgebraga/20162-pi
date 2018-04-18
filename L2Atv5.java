package Lista2;

/* Lista de atividades 2
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */
 /*
5) Faça um algoritmo que permita ao usuário fornecer três números e escolher
entre as opções: calcular a média, calcular a soma ou calcular a multiplicação
dos números.
 */

import java.util.Scanner;

public class L2Atv5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Insersão de dados
        System.out.println("Entre com o primeiro numero: ");
        float num1 = in.nextFloat();
        System.out.println("Entre com o segundo numero: ");
        float num2 = in.nextFloat();
        System.out.println("Entre o terceiro numero: )");
        float num3 = in.nextFloat();

        System.out.println("O que quer fazer?");
        System.out.println("Entre com o número da opcao desejada.");
        System.out.println("[1]Calcular media - [2]Calcular soma - [3]Calcular multiplicação");
        int opc = in.nextInt();

        //Média
        switch (opc) {
            case 1:
                float result1 = (num1 + num2 + num3) / 3;
                System.out.println("Opção " + opc + " Resultado da Media: " + result1);
                break;
            //Soma
            case 2:
                float result2 = (num1 + num2 + num3);
                System.out.println("Opção " + opc + " Resultado da Soma: " + result2);
                break;
            //Multiplica
            case 3:
                float result3 = (num1 * num2 * num3);
                System.out.println("Opção " + opc + " Resultado da Multiplicação " + result3);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }

}
