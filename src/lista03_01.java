//Crie um programa em Java que receba do usuário um número inteiro
//positivo e informe os totais de números pares e ímpares encontrados entre 1 e o número
//digitado + o somatório dos pares e ímpares separadamente.
import java.util.Scanner;

public class lista03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, totalPares, totalImpares, somaPares, somaImpares;

        System.out.print("Informe um número inteiro: ");
        num = scanner.nextInt();
        totalPares = 0;
        totalImpares = 0;
        somaPares = 0;
        somaImpares = 0;

        // int = inicialização
        // num >= condição
        // i++ = é o contador
        for (int i = 1; num >= i; i++) {
            if (i % 2 == 0) {
                totalPares++;
                somaPares += i;
            } else {
                totalImpares++;
                somaImpares += i;
            }
        }

        System.out.println("Total de números pares: " + totalPares);
        System.out.println("Total de números ímpares: " + totalImpares);
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }


}



