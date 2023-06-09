package br.com.dio.exercicios.loops;
/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex: 5!= 120 (5 x 4 x 3 x 2 x 1)
 */
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Fatorial: "); //Peça um número
        int fatorial = scan.nextInt(); //Entrada de dados, neste caso de um int.

        int multiplicacao = 1; //variável para guardar o valor da multiplicação dos valores.

        System.out.println(fatorial + "!= "); //frase ilustrativo para indicar o fatorial
        
         //para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a cada loop.
        for(int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i; //multiplicamos os valores de i e armazenamos na variável multiplicação

            //criamos esta estrutura condicional para imprimir o resultado conforme foi solicitado no exercício.
            if (i != 1) { //se o i tiver o valor diferente de 1
                System.out.print(i + "."); //imprima o valor do i seguido de "."
            } else { //se não (se o i tiver o valor igual a 1)
                //imprima o valor do i seguido do sinal "=" e o resultado da multiplicação
                System.out.print(i + "=" + (multiplicacao));
            }
        }
    }
}