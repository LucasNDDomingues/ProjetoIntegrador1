package Exercicios.ADO5;

import java.util.Scanner;

public class Ex2MatrizColuna2Soma {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int somaColuna2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os valores da matriz:");


        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.print("Digite valor Linha " + (linha + 1) + " Coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = input.nextInt();
            }
        }


        for (int linha = 0; linha < 3; linha++) {
            somaColuna2 += matriz[linha][1];
        }


        System.out.println("\nMATRIZ:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nColuna 2:");

        for (int linha = 0; linha < 3; linha++) {
            System.out.println(matriz[linha][1]);
        }

        System.out.println("\nSoma total da coluna 2 = " + somaColuna2);
    }
}