package Aula4;
import java.util.Random;
import java.util.Scanner;


    public class jogoAcerteONumero {

        public static void main(String[] args){
            Scanner entradaDados = new Scanner(System.in);
            Random gerador = new Random();

            int numeroSecreto = gerador.nextInt(101);
            int numeroUsuario = 0;


            /*Equanto(while) a variavel numeroUsuario(valor digitado pelo usuario)
             for diferente de numeroSecreto execute
            o que está dentro do bloco de codigo*/
            while(numeroUsuario != numeroSecreto){

                System.out.print("Digite o numero de Palpite: ");
                numeroUsuario = entradaDados.nextInt();

                if(numeroUsuario > numeroSecreto){
                    System.out.println("O numero é menor que: "+numeroUsuario);
                }else if(numeroUsuario < numeroSecreto) {
                    System.out.println("O numero é maior que: "+numeroUsuario);
                } else {
                    System.out.println("Voce Acertou");
                }

            }



        }

    }
