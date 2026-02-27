package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		
		System.out.println("Digite 6 números inteiros: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		mostraPares(a);
		int soma = somaPares(a);
		System.out.println("A soma dos números pares é: " + soma);
		mostraImpares(a);
		int qtd = qtdImpares(a);
		System.out.println("A quantidade de números ímpares é: " + qtd);
		
	}
	
	public static void mostraPares(int[] a) {
		System.out.println("Números pares: ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.println("Número " + a[i] + " na posição " + i );
			}
		}
	}
	
	public static int somaPares(int[] a) {
		int soma = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				soma += a[i];
			}			
		}
		return soma;
	}
	
	public static void mostraImpares(int[] a) {
		System.out.println("Números ímpares: ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				System.out.println("Número " + a[i] + " na posição " + i );
			}
		}
	}
	
	public static int qtdImpares(int[] a) {
		int cont = 0 ;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				cont++;
			}
		}
		return cont;
		
	}
	
	
}
