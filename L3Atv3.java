/* Lista de atividades 3
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */


/*
3) Faça um algoritmo que calcula e escreve a seguinte soma:
soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
*/


package Lista3;

public class L3Atv3 {

    public static void main(String[] args) {
        //declarando variaveis
        int i = 1;
        int j = 1;
        int soma = 0;
        do {
            //Impressão do valor de j e de i
            System.out.println(j + "/" + i);
            //Armazena o último valor da soma e calcula o próximo
            soma = soma + (j / i);
            //Acrescenta 1 no valor de i
            i++;
            //Acrescenta 2 ao valor de j
            j = j + 2;
            //Quando i chegar a 50, j chega a 99
        } while (i <= 50);
        System.out.println("SOMA: " + soma);
    }

}
