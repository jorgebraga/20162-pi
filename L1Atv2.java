package Lista1;

/* Lista de atividades 1
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */

/*
2. Faça um algoritmo e implemente no (VISUALG) que leia uma
temperatura em graus Centígrados e apresente a temperatura
convertida em graus Fahrenheit. A equação de conversão é: F = (9 * C +
160) / 5. Em que F é a temperatura em Fahrenheit e C é a temperatura
em Centígrados. Faça também o algoritmo em fluxograma.
*/


import java.util.Scanner;


public class L1Atv2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Entrada de valor
        System.out.println("Entre com temperatura em ºC: ");
        double c = sc.nextDouble();
        //Calculo de saída
        double f = (9 * c + 160) / 5;
        System.out.println("O valor convertido em ºF é: " + f);

    }

}
