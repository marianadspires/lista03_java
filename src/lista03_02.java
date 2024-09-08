//Crie um programa em Java que receba do usuário dois números inteiros
//positivos A e B (e garantindo que A < B), encontre e imprima os números divisíveis por 5 no
//intervalo de números entre A e B (incluindo A e B) e a soma dos números encontrados.
import java.util.Scanner;

public class lista03_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        while (true) {
            System.out.print("Insira o valor de A: ");
            A = scanner.nextInt();

            System.out.print("Insira o valor de B o número deve ser um número inteiro positivo e maior que A: ");
            B = scanner.nextInt();

            if (A < B) {
                break;
            } else {
                System.out.println("Erro: O valor de A deve ser menor que B. Tente novamente.");
            }
        }

        int soma = 0; //

        System.out.println("Números divisíveis por 5 no intervalo entre " + A + " e " + B + ":");

        for (int i = A; i <= B; i++) {
            if (i % 5 == 0) { //
                System.out.println(i); //
                soma += i; //
            }
        }
        System.out.println("Soma dos números divisíveis por 5: " + soma);
    }
}
