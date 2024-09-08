//Escrever um algoritmo que recebe repetidamente o sexo (M - Masculino
//e F - Feminino) e a idade. Apresentar no final do algoritmo a média da idade dos homens e a
//média da idade das mulheres. Parar o algoritmo quando for digitado um sexo diferente de M
//ou F.

import java.util.Scanner;

public class lista03_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdadesHomens = 0, totalHomens = 0;
        int somaIdadesMulheres = 0, totalMulheres = 0;

        while (true) {

            System.out.print("Digite o sexo (M - Masculino, F - Feminino, ou outro para sair): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo inválido! Encerrando o programa.");
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            if (sexo == 'M') {
                somaIdadesHomens += idade;
                totalHomens++;
            } else if (sexo == 'F') {
                somaIdadesMulheres += idade;
                totalMulheres++;
            }
        }

        if (totalHomens > 0) {
            System.out.println("Média de idade dos homens: " + (somaIdadesHomens / (double) totalHomens));
        } else {
            System.out.println("Nenhum homem foi registrado.");
        }

        if (totalMulheres > 0) {
            System.out.println("Média de idade das mulheres: " + (somaIdadesMulheres / (double) totalMulheres));
        } else {
            System.out.println("Nenhuma mulher foi registrada.");
        }
    }
}