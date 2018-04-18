package Lista2;


/* Lista de atividades 2
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */
 /*
2) Fazer um algoritmo para ler os três lados de um triângulo, dizer se ele é
isósceles, escaleno ou equilátero. OBS: Antes de verificar o tipo do triângulo
deve-se verificar se os lados fornecidos formam triângulo:
( L1+L2 > L3; L2+L3 >L1 e L3+L1 > L2)
 */
import java.util.Scanner;

public class L2Atv2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite primeiro lado do Triangulo:");
        float L1 = in.nextFloat();

        System.out.println("Digite segundo lado do Triangulo:");
        float L2 = in.nextFloat();

        System.out.println("Digite terceiro lado do Triangulo:");
        float L3 = in.nextFloat();

        //Verificação se trata-se de um triângulo
        if (L1 + L2 > L3 || L2 + L3 > L1 || L3 + L1 > L2) {
            //Verificação se é equilatero
            if (L1 == L2 && L2 == L3) {
                System.out.println("É um triangulo equilátero. Por possuir todos os lados iguais.");
            } else // Condicao para triangulo escaleno
            if (L1 != L2 && L2 != L3 && L3 != L1) {
                System.out.println("É um triangulo escaleno. Por possuir todos os lados diferentes.");
            } else //Condicao para triangulo isoceles
            if (L1 == L2 && L2 != L3 || L3 == L2 && L2 != L1 || L1 == L3 && L3 != L2) {
                System.out.println("É um trinagulo isóceles. Por possuir dois lados iguais.");
            }
        } else {
            //Se não for um triângulo
            System.out.println("Não é um triangulo.");
        }
    }

}
