//Escreva um algoritmo que receba um número inteiro positivo. Fazer a
//multiplicação + a impressão do número recebido iniciando em 1 até chegar ao número
//recebido (incluindo o número recebido). Parar o algoritmo quando o usuário digitar 0.
import java.util.Scanner;

public class lista03_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        // Repetição de process até a pessoa digitar 0
        while (true) {
            System.out.print("Insira um número inteiro ou insira 0 para sair: ");
            num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Digitou 0, encerrando o programa.");
                break;
            }
            int resultado = 1;

            for (int i = 1; i <= num; i++) {
                resultado *= i;
                System.out.println(i + " -> Multiplicação parcial: " + resultado);
            }
            System.out.println("Resultado final: " + resultado);
        }
    }
}

