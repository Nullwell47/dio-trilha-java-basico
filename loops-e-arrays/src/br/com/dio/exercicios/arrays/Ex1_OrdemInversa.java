package br.com.dio.exercicios.arrays;
/*
 * Crie um vetor de 6 números inteiros 
 * e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, 6, 15, 50, 8, 4}; //inicializando um vetor com 5 elementos.
        //System.out.println(vetor.length);

        System.out.print("Vetor: "); //Frase ilustrativa
        int count =0; //o contador deverá ser um número menor que o tamanho do vetor.
        //loop
        while(count < (vetor.length)) {  //enquanto o contador tiver o valor menor que o tamanho do vetor.
            System.out.print(vetor[count] + " "); //imprima o valor do elemento do vetor na posição indicada pelo contador.
            count++; //aumente o valor 1 do contador a cada loop
        }

        System.out.print("\nVetor: "); //Frase ilustrativa
        //loop for-each
        for(int i = (vetor.length - 1); i >= 0; i --) {//o for fará a contagem inversa para cada elemento dentro do vetor
            System.out.print(vetor[i] + " "); //imprima o elemento
        }

    }
}
