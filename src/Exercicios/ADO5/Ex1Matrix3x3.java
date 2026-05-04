package Exercicios.ADO5;

import java.util.Scanner;

public class Ex1Matrix3x3 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int soma = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os valores linha por linha.");


        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.print("Digite valor da Linha " + (linha + 1) + " Coluna " + (coluna + 1) + ": ");

                matriz[linha][coluna] = input.nextInt();

                soma += matriz[linha][coluna];
            }
        }


        System.out.println("\nMATRIZ:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nA soma total da matriz é: " + soma);
    }
}