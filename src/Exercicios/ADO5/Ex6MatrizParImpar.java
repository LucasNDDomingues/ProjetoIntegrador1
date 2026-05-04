package Exercicios.ADO5;

import java.util.Scanner;

public class Ex6MatrizParImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int linhas, colunas;

        System.out.print("Digite quantidade de linhas: ");
        linhas = input.nextInt();

        System.out.print("Digite quantidade de colunas: ");
        colunas = input.nextInt();

        int[][] F = new int[linhas][colunas];

        int qtdPar = 0;
        int qtdImpar = 0;


        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                System.out.print("Digite F[" + linha + "][" + coluna + "]: ");
                F[linha][coluna] = input.nextInt();

                if (F[linha][coluna] % 2 == 0) {
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
            }
        }


        int[] PAR = new int[qtdPar];
        int[] IMPAR = new int[qtdImpar];

        int iPar = 0;
        int iImpar = 0;


        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {

                if (F[linha][coluna] % 2 == 0) {
                    PAR[iPar] = F[linha][coluna];
                    iPar++;
                } else {
                    IMPAR[iImpar] = F[linha][coluna];
                    iImpar++;
                }
            }
        }


        System.out.println("\nMATRIZ F:");

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.print(F[linha][coluna] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nVETOR PAR:");
        for (int i = 0; i < PAR.length; i++) {
            System.out.print(PAR[i] + " ");
        }


        System.out.println("\n\nVETOR IMPAR:");
        for (int i = 0; i < IMPAR.length; i++) {
            System.out.print(IMPAR[i] + " ");
        }
    }
}
