package br.com.dio.exercicios.arrays;
/*
 * Faça um Programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado
        String[] consoantes = new String[6]; //iniciando um arrays vazio com 6 posições
        
        int quantidadeConsoantes = 0; //Declarando variável quantidade de consoantes
        int count = 0; //controla o loop

        //loop
        do {
            System.out.println("Letra: ");//Peça uma letra
            String letra = scan.nextLine();//capture essa letra e atrubua a variável letra.

            //se a letra informada não seja igual a a, e, i, o ou u
            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

                count++;//acrescente o valor 1 ao contador a cada loop

        } while(count < consoantes.length); //enquanto o contador tiver o valor menor que o tamanho do array

        System.out.println("Consoante: "); //frase ilustrativa
        for (String consoante : consoantes) { //para cada consoante dentro do array consoantes
            if (consoante != null) //se o valor da consoante for diferente de null
                System.out.println(consoante + " "); //imprima a consoante
        }
        System.out.println("Quantidade de Consoantes: " + quantidadeConsoantes); //imprime a quantidade de consoantes digitada pelo usuário
        System.out.println(consoantes.length); // imprime o valor do arrary
    }
}
