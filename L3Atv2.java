/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */
/*
2) Faça um programa algoritmo para exibir a tabuada de 0 a 9.
*/

package Lista3;


public class L3Atv2 {

    public static void main(String[] args) {
        //i é a variável utilizada para a primeira coluna que aumenta conforme o loop
        for (double i = 0; i <= 9; i++) {
            //j é a variável utilizada para a segunda coluna que aumenta dentro do primeiro loop
            for (double j = 0; j <= 9; j++) {
                //Impressão de resultados
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }

    }

}
