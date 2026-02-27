package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número para ter o seu fatorial calculado: ");
		num = sc.nextInt();
		int fatorial = 	calculaFatorial(num);
		System.out.println("Fatorial calculado: " + fatorial );
		
		
	}

	public static int calculaFatorial(int n) {
		if(n == 0) { //Condição de parada: fatorial de 0 é 1
			return 1;
		}
		return n * calculaFatorial(n -1);

		}
}
