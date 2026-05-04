package Exercicios.ADO5;
import java.util.Scanner;

public class Ex7MatrizCrescente {




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int linhas, colunas;

        System.out.print("Digite quantidade de linhas: ");
        linhas = input.nextInt();

        System.out.print("Digite quantidade de colunas: ");
        colunas = input.nextInt();

        int[][] Y = new int[linhas][colunas];
        int[][] ordenada = new int[linhas][colunas];

        int total = linhas * colunas;
        int[] vetor = new int[total];


        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                System.out.print("Digite Y[" + linha + "][" + coluna + "]: ");
                Y[linha][coluna] = input.nextInt();
            }
        }


        int k = 0;

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                vetor[k] = Y[linha][coluna];
                k++;
            }
        }


        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1; j++) {

                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }


        k = 0;

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                ordenada[linha][coluna] = vetor[k];
                k++;
            }
        }


        System.out.println("\nMATRIZ ORIGINAL:");

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.print(Y[linha][coluna] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nMATRIZ ORDENADA:");

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.print(ordenada[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }


}
