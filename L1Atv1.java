package Lista1;

/* Lista de atividades 1
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */

 /*
1. Faça um algoritmo do tipo fluxograma que tendo dois números de
entrada mostre a soma, a diferença, o produto e a média aritmética
desses valores. Após, faça o algoritmo em Pseudocódigo e implemente
no (VISUALG). A tela de diálogo deve aparecer como se segue:
Entre com o primeiro número:
Entre com o segundo número:
Soma: valor
Diferença: valor
Produto: valor
Media: valor
 */
import java.util.Scanner;


public class L1Atv1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Insersão de valores
        System.out.println("Entre com o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = input.nextInt();

        //Saída de dados
        System.out.println("Resultados");
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Diferença: " + (num1 - num2));
        System.out.println("Produto: " + num1 * num2);
        System.out.println("Média: " + (num1 + num2 / 2));
    }

}
