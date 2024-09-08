//Escreva um programa em Java que receba um número e faça a tabuada
//desse número de 1 a 10. Parar o algoritmo quando o usuário digitar um número negativo.
import java.util.Scanner;

public class lista03_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Informe um número para saber a tabuada ou informe um número negativo para sair: ");
            num = scanner.nextInt();

            if (num < 0) {
                System.out.println("O número informado foi negativo. O programa foi encerrado.");
                break;
            }
            // Onde informa a tabuada
            System.out.println("Tabuada do " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}

