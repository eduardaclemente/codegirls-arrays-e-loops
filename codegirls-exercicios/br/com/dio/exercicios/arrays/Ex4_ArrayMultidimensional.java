package br.com.dio.exercicios.arrays;

/*
gere e imprima uma matrix M 4x4 com valores aleatorios entre 0-9
 */

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++) {
            for( int j = 0; j < M[i].length; j++) {  // j representa a coluna. M = matriz. i = contador.
                M[i][j] = random.nextInt(9); // coloquei os elementos dentro da matriz
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}