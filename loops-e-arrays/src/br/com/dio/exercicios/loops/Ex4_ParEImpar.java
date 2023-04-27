package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        int numero;
        int quantNumeros;
        int quantPares = 0, quantImpares = 0; //variáveis para guardar a quantidade dos números pares e ímpares

        System.out.println("Quantidade de números: "); //Peça um número
        quantNumeros = scan.nextInt(); //Entrada de dados, neste caso de um int.

        int count = 0; //controla o loop
        //loop
        do { //primeiro, independente do que tem no while, faça:
            System.out.println("Número "); //Peça um número
            numero = scan.nextInt(); //Entrada de dados, neste caso de um int.
            
            //se o resto da divisão do número por 2 (numero/2) for 0,
            if (numero %  2 == 0 ) quantPares++; //acrescente o valor 1 a variável quantPar.
            //caso contrário, o número digitado é ímpar
            else quantImpares++; //adicione o valor 1 a variável quantImpar.

            count++; //some o valor 1 ao contador até que invalide a condição do loop. (count < quantidadeDeNumeros)
        } while(count < quantNumeros);
        // Faça o loop caso o valor do contador seja menor que a quantidade de números

        //imprimindo a quantidade de números pares digtados e números ímpares digitados
        System.out.println("Quantidade números pares: " + quantPares + "\nQuantidade números ímpares: " + quantImpares);

    }
    
}
