package Exercicios.ADO5;

import java.util.Scanner;

public class Ex3MatrizABCDE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        int somaLinha3 = 0;
        int somaColuna4 = 0;
        int somaPrincipal = 0;
        int somaSecundaria = 0;


        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                System.out.print("Digite valor Linha " + (linha + 1)
                        + " Coluna " + (coluna + 1) + ": ");

                matriz[linha][coluna] = input.nextInt();
            }
        }


        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {


                if (linha == 2) {
                    somaLinha3 += matriz[linha][coluna];
                }


                if (coluna == 3) {
                    somaColuna4 += matriz[linha][coluna];
                }


                if (linha == coluna) {
                    somaPrincipal += matriz[linha][coluna];
                }


                if (linha + coluna == 4) {
                    somaSecundaria += matriz[linha][coluna];
                }
            }
        }

        System.out.println("\nSoma linha 3 = " + somaLinha3);
        System.out.println("Soma coluna 4 = " + somaColuna4);
        System.out.println("Diagonal principal = " + somaPrincipal);
        System.out.println("Diagonal secundaria = " + somaSecundaria);
    }
}
