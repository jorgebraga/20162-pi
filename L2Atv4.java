package Lista2;

/* Lista de atividades 2
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */

 /*
4) Ler três valores e um código de condição. Se o código for “c” os valores devem
ser escritos em ordem crescente. Se o código for “d”, deve-se escrevê-los em
ordem decrescente.
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class L2Atv4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Criaçao de um Array de 3 posições
        Integer[] valor = new Integer[3];

        //Entrada de dados
        System.out.println("Digite 3 valores: ");
        for (int i = 0; i < 3; i++) {
            valor[i] = input.nextInt();
        }

        //Escolha da opção para Crescente e Decrescente
        System.out.println("Entre com C  para ordem crescente e D para ordem decrescente: ");
        String opc = input.next();

        switch (opc) {
            case "c":
                System.out.println("Ordem crescentes: ");
                //Funcão para colocar os valores em ordem Crescente
                Arrays.sort(valor);
                for (int i : valor) {
                    System.out.println(i);
                }
                break;
            case "d":
                System.out.println("Ordem decrescentes: ");
                //Funcão para colocar os valores em ordem Decrescente

                Arrays.sort(valor, Collections.reverseOrder());
                for (int i : valor) {
                    System.out.println(i);
                }
                break;

            default:
                //Caso o usuário entre com opção diferente
                System.out.println("Entre com C para crescente ou D para decrescente.");
                break;
        }

    }

}
