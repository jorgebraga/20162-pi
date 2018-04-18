package Lista1;

/* Lista de atividades 1
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */

 /*
3. Faça um algoritmo com descrição narrativa e em pseudocódigo para
calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
equação: Volume = PI * raio2 * altura. Implemente no software
(VISUALG).
 */
import java.util.Scanner;

public class L1Atv3 {

    public static void main(String[] args) {
        double volume;
        double pi = 3.14;
        double r;
        double altura;

        Scanner entrada = new Scanner(System.in);
        //Dados de entrada
        System.out.println("Informe o raio da circunferência");
        System.out.println("Digite o valor do raio: ");
        r = entrada.nextInt();
        System.out.println("Informe a altura");
        altura = entrada.nextInt();
        //Calculo de sída
        volume = pi * (r * r) * altura;
        System.out.println("O volume da uma lata de óleo é: " + volume);
    }
}
