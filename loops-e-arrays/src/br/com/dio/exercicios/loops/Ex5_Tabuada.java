package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
* Desenvolva um gerador de tabuada,
* capaz de gerar a tabuada de qualuqer número inteiro entre 1 a 10.
* O usuário deve informar de qual número ele deseja ver a tabuada.
* A saída deve ser conforme o exemplo abaixo:
* 
* Tabuada de 5:
* 5 x 1 = 5
* 5 x 2 = 10
* ...
* 5 x 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Tabuada: "); //Informar o número que será exibido a tabuada
        int tabuada = scan.nextInt(); //Entrada de dados, neste caso de um int.

        //para: variável i = 0, até i menor ou igual a 10, adicionando 1 ao valor de i a cada loop.
        for(int i = 1; i <= 10; i++) {  //número escolhido pelo usuário "X" o valor de i "=" a multiplicação do número com o i.
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
