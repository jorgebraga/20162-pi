package Lista1;

/* Lista de atividades 1
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */
 /*
4. Faça um algoritmo em fluxograma e pseudocódigo (VISUALG) que leia
dois valores para as variáveis A e B, efetue a troca dos valores de forma
que a variável A passe a possuir o valor da variável B e que a variável B
passe a possuir o valor da variável A. Apresentar os valores trocados.
 */
import java.util.Scanner;

public class L1Atv4 {

    public static void main(String[] args) {
        //Declaração de variáveis
        int A;
        int B;
        int C;
        //Entrada de valotres
        Scanner troca = new Scanner(System.in);
        System.out.println("Digite a variável A");
        A = troca.nextInt();
        System.out.println("Digite a variável B");
        B = troca.nextInt();
        //Variáveis de armazenamento
        C = A;
        A = B;
        B = C;
        //Saída de dados
        System.out.println("Valor de A = " + A);
        System.out.println("Valor de B = " + B);
    }

}
