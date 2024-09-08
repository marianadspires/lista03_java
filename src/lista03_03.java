//Crie um programa em Java que receba do usuário um número inteiro
//positivo e determine se ele é um “número perfeito”. Um número perfeito é aquele que é igual
//à soma dos seus divisores, do 1 até o “número -1”
import java.util.Scanner;

public class lista03_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, somaDivisores;

        System.out.print("Digite um número inteiro: ");
        num = scanner.nextInt();
        somaDivisores = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == num) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num + " não é um número perfeito.");
        }
    }
}
