//Ler uma quantidade indeterminada de duplas de valores (2 valores de
//cada vez). Escrever para cada dupla lida uma mensagem que indique se ela foi informada em
//ordem crescente ou decrescente. A repetição será encerrada ao ser fornecido valores iguais
//para os elementos da dupla.
import java.util.Scanner;

public class lista03_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        while (true) {
            System.out.print("Informe o primeiro valor: ");
            num1 = scanner.nextInt();

            System.out.print("Informe o segundo valor: ");
            num2 = scanner.nextInt();

            if (num1 == num2) {
                System.out.println("Valores de num1 e num2 são iguais.O Programa encerrou.");
                break;
            }

            if (num1 < num2) {
                System.out.println("Ordem crescente.");
            } else {
                System.out.println("Ordem decrescente.");
            }
        }
    }
}

