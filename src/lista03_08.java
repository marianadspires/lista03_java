//Escreva um algoritmo para imprimir os 50 primeiros números primos
//maiores que 100.

public class lista03_08 {
    public static void main(String[] args) {
        int contadorPrimos, num;
        contadorPrimos = 0;
        num = 101;

        while (contadorPrimos < 50) {
            if (Primo(num)) {
                System.out.println(num);
                contadorPrimos++; // Incrementa o contador de primos encontrados
            }
            num++;
        }
    }

    public static boolean Primo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


