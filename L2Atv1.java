package Lista2;

/* Lista de atividades 2
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */
 /*
1) Faça um algoritmo que leia um número e mostre uma mensagem indicando se
este número é par ou ímpar e se é positivo ou negativo.
 */
import java.util.Scanner;

public class L2Atv1 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 0;
        //Entrada de dados
        System.out.println("Entre com um número");
        numero = leitura.nextInt();
        //Condições para ser par
        if (numero % 2 == 0) {
            System.out.println("Par");
            //condições para ser positivo ou negativo
            if (numero > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");

            }
        } else {
            System.out.println("Impar");
            if (numero > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");

            }

        }

    }

}
