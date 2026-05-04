package Exercicios.ADO5;

import java.util.Scanner;

public class Ex4MatrizVetor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int[] vetor = new int[5];


        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                System.out.print("Digite valor Linha " + (linha + 1)
                        + " Coluna " + (coluna + 1) + ": ");

                matriz[linha][coluna] = input.nextInt();
            }
        }


        for (int coluna = 0; coluna < 5; coluna++) {

            for (int linha = 0; linha < 5; linha++) {
                vetor[coluna] += matriz[linha][coluna];
            }
        }


        System.out.println("\nVetor final:");

        for (int i = 0; i < 5; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
    }
}
