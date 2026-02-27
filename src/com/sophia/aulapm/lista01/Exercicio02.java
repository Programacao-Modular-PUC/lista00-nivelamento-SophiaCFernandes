package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int x, y, z;
		int[] array = new int[3];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o valor da posicao " + (i + 1));
			array[i] = sc.nextInt();
		}
		
		int maiorValor = calculaMaior(array);
		System.out.println("O maior valor do array é: " + maiorValor);
		
		int menorValor = calculaMenor(array);
		System.out.println("O menor valor do array é: " + menorValor);
		
		boolean estaNoIntervalo = confereIntervalo(array);
		System.out.println(estaNoIntervalo ? "O numero " + array[0] + " está no intervalo entre " + array[1] + " e " + array[2] : "O numero " + 																		array[0] + " não está no intervalo entre " + array[1] + " e "+ array[2]);
		
		boolean ehDivisivel = confereDivisivel(array);
		System.out.println(ehDivisivel ? "O numero " + array[0] + " é divisível por " + array[1] + " e " + array[2] : "O numero " + array[0] + 																		" não é divisível por "+ array[1] + " e " + array[2]);
		
	}

	public static int calculaMaior(int[] v) {
		int maior = v[0]; //inicializando o conteúdo da primeira posicao como o maior
		for (int i = 0; i < v.length; i++) {
			if(v[i] > maior) {
				maior = v[i];
			}
		}
		return maior;
	}
	
	public static int calculaMenor(int[] v) {
		int menor = v[0]; //inicializando o conteúdo da primeira posicao como o maior
		for (int i = 0; i < v.length; i++) {
			if(v[i] < menor) {
				menor = v[i];
			}
		}
		return menor;
		
	}
	
	public static boolean confereIntervalo(int[] v) {
		return v[0] >= v[1] && v[0] <= v[2]; //retornando diretamente, pois um if seria redundante já que retorna true ou false
	}
	
	public static boolean confereDivisivel(int[] v) {
		return (v[0] % v[1] == 0 && v[0] % v[2] == 0);
	}
}
