package Lista2;

/* Lista de atividades 2
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */
 /*
3) Fazer um algoritmo para ler três notas, imprimir a maior delas e a média destas
notas .
 */

import java.util.Scanner;

public class L2Atv3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;
        //Leitura de dados
        System.out.println("Digite a primeira nota");
        nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota");
        nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota");
        nota3 = input.nextDouble();
        //Calculo média
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média" + media);
        //Condições para nota maior
        if (nota1 > nota2 && nota1 > nota3) {
            System.out.println("Maior nota é:" + nota1);
        } else if (nota2 > nota1 && nota2 > nota3) {
            System.out.println("Maior nota é:" + nota2);
        } else if (nota3 > nota1 && nota3 > nota2) {
            System.out.println("Maior nota é:" + nota3);

        }
    }

}
