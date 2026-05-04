package Exercicios.ADO5;

import java.util.Scanner;

public class Ex5MatrizNxM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int linhas, colunas;

        System.out.print("Digite quantidade de linhas: ");
        linhas = input.nextInt();

        System.out.print("Digite quantidade de colunas: ");
        colunas = input.nextInt();

        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        int[][] matrizC = new int[linhas][colunas];


        System.out.println("\nDigite valores da Matriz A:");

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                System.out.print("A[" + linha + "][" + coluna + "]: ");
                matrizA[linha][coluna] = input.nextInt();
            }
        }


        System.out.println("\nDigite valores da Matriz B:");

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                System.out.print("B[" + linha + "][" + coluna + "]: ");
                matrizB[linha][coluna] = input.nextInt();
            }
        }


        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                matrizC[linha][coluna] =
                        matrizA[linha][coluna] + matrizB[linha][coluna];
            }
        }


        System.out.println("\nMatriz Soma:");

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                System.out.print(matrizC[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
