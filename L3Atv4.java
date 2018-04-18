/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */


/*
4) Escreva um algoritmo que gera números entre 1000 e 1999 e mostra
aqueles que divididos por 11 dão resto 5.
*/


package Lista3;

public class L3Atv4 {

    public static void main(String[] args) {
        //valor de i iniciando em 1000 até 1999
        for (int i = 1000; i < 2000; i++) {
            //Casoo valor de i divido por 11 tenha resto igual a 5, então ele será impresso na tela
            if (i % 11 == 5) {
                //Impressão de valor
                System.out.println(i);
            }
        }
    }

}
