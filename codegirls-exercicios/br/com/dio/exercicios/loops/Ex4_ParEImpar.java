package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N numeros inteiros,
calcule e mostre a quantidade de numeros pares
e a quantidade de numeros impares.
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int impar = 0, par = 0;


        System.out.println("Quantidade de  números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) par++;
            else impar++;

            count++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade PAR: " +par) ;
        System.out.println("Quantidade IMPAR: " +impar);

    }
}
