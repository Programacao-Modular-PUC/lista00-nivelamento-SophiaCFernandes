package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de elementos do vetor x: ");
		int n;
		n = sc.nextInt();
		int[] x = new int[n];
	
		System.out.println("Digite o numero de elementos do vetor y: ");
		int m;
		m = sc.nextInt();
		int[] y = new int[m];
		
		System.out.println("Vetor x");
		for(int i = 0; i < x.length; i++) {
			System.out.println("Digite o valor do elemento " + (i+1));
			x[i] = sc.nextInt();
		}
		
		System.out.println("Vetor y");
		for(int i = 0; i < y.length; i++) {
			System.out.println("Digite o valor do elemento " + (i+1));
			y[i] = sc.nextInt();
		}
		
		int[]z = calculaUniao(x, y);
		for(int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
		
	}
	
	public static boolean existeNoVetor(int[]a, int valor, int qtd) {
		for(int i = 0; i < qtd; i++) {
			if(a[i] == valor) {
				return true;
			}	
		}
		return false;
	}
	
	
	public static int[] calculaUniao(int[] x, int[] y) {
		int z[] = new int[x.length + y.length];
		int pos = 0;
		
		for(int i = 0; i < x.length; i++) {
			z[pos] = x[i];
			pos++;
		}
		
		for(int i = 0; i <y.length; i++) {
			if(!existeNoVetor(z, y[i], pos)) {
				z[pos] = y[i];
				pos++;
			}
		}
		return z;	
	}

}
