package Exercicios.ADO5;

import java.util.Scanner;

public class Ex1Matriz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.print("Digite valor da Linha " + (linha + 1)
                        + " Coluna " + (coluna + 1) + ": ");

                matriz[linha][coluna] = input.nextInt();

                soma += matriz[linha][coluna];
            }
        }

        System.out.println("\nMatriz:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSoma = " + soma);
    }

        }

