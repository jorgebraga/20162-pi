/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */


/*
7) Faça um programa que leia as médias finais de vários alunos de
uma turma e mostre a maior média, a menor média e a média
aritmética da turma. O programa para quando encontrar uma média
negativa.
*/


package Lista3;

import java.util.Scanner;

public class L3Atv7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarando variáveis
        int alunos = 0;
        double mediaFinal = 0;
        double maior = 0;
        double menor = 9999;

        for (int i = 1; i > 0; i++) {
            //Entrada de dados
            System.out.println("Digite a media do aluno:");
            double media = input.nextDouble();
            alunos = alunos + 1;
            mediaFinal = mediaFinal + media;
            //Maior nota
            if (media > maior) {
                maior = media;
            }
            //Menor nota
            if (media < menor) {
                menor = media;
            }//Condiçao para sair do programa
            if (media < 0) {
                i = -1;
            }
        }
        //Calculo da média
        mediaFinal = mediaFinal / alunos;
        //Dados de saída
        System.out.println("Media final dos alunos: " + mediaFinal);
        System.out.println("Maior media: " + maior);
        System.out.println("Menor media: " + menor);
    }
}
