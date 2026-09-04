package Questão2;

import java.util.Arrays;
import java.util.Scanner;

public class Megasena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int quantidadeInserida = 0;

        System.out.println("   Jogo da Mega-Sena   ");
        System.out.println("Digite 6 números entre 1 e 60 (sem repetição):");

        while (quantidadeInserida < 6) {
            System.out.println("Número " + (quantidadeInserida + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Erro: o número deve estar entre 1 e 60. Tente novamente.");
                continue;
            }

            if (numeroJaExiste(numeros, quantidadeInserida, numero)) {
                System.out.println("Erro: número já inserido. Digite um número diferente.");
                continue;
            }

            numeros[quantidadeInserida] = numero;
            quantidadeInserida++;
        }

        Arrays.sort(numeros);

        System.out.println("\nSeus números da Mega-Sena, em ordem crescente:");
        System.out.println(Arrays.toString(numeros));

        scanner.close();
    }

    private static boolean numeroJaExiste(int[] numeros, int tamanhoAtual, int numero) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (numeros[i] == numero) {
                return true;
            }
        }
        return false;
    }
}