package Questão3;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quantos termos da série de Fibonacci deseja exibir: ");
        int n = scanner.nextInt();

        System.out.println("\nOs " + n + " primeiros números da série de Fibonacci são:");
        exibirFibonacci(n);

        scanner.close();
    }

    public static void exibirFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Número invalido, Informe um valor maior que zero.");
            return;
        }

        long anterior = 0;
        long atual = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(anterior + " ");

            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println();
    }
}
