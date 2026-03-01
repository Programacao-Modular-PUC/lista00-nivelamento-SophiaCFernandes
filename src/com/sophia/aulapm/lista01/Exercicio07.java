package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] mesTemp = new double[12];

		for (int i = 0; i < mesTemp.length; i++) {
			System.out.println("Digite a temperatura do mês " + (i + 1) + ": ");
			mesTemp[i] = sc.nextDouble();
		}
		
		double maiorTemp = encontraMaiorTemp(mesTemp);
		mostraMaior(maiorTemp); 
		
		double menorTemp = encontraMenorTemp(mesTemp);
		mostraMenor(menorTemp);
	}

	public static double encontraMaiorTemp(double[] a) {
		double maiorTemp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maiorTemp) {
				maiorTemp = a[i];
				return i;
			}
		}
		return maiorTemp;
	}

	public static double encontraMenorTemp(double[] a) {
		double menorTemp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < menorTemp) {
				menorTemp = a[i];
				return i;
			}
		}
		return menorTemp;
	}
	
	public static void mostraMaior(double maior) {
		if(maior == 0) {
			System.out.println("O mês com a maior temperatura é janeiro ");
		} 
		if(maior ==1) {
			System.out.println("O mês com a maior temperatura é Fevereiro ");
		}
		if(maior ==2) {
			System.out.println("O mês com a maior temperatura é Março ");
		}
		if(maior ==3) {
			System.out.println("O mês com a maior temperatura é Abril ");
		}
		if(maior ==4) {
			System.out.println("O mês com a maior temperatura é Maio ");
		}
		if(maior ==5) {
			System.out.println("O mês com a maior temperatura é Junho ");
		}
		if(maior ==6) {
			System.out.println("O mês com a maior temperatura é Julho ");
		}
		if(maior ==7) {
			System.out.println("O mês com a maior temperatura é Agosto ");
		}
		if(maior ==8) {
			System.out.println("O mês com a maior temperatura é Setembro ");
		}
		if(maior ==9) {
			System.out.println("O mês com a maior temperatura é Outubro ");
		}
		if(maior ==10) {
			System.out.println("O mês com a maior temperatura é Novembro ");
		}
		if(maior ==11) {
			System.out.println("O mês com a maior temperatura é Dezembro ");
		}
		
	}
	
	public static void mostraMenor(double menor) {
		
		if(menor == 0) {
			System.out.println("O mês com a menor temperatura é janeiro ");
		} 
		if(menor ==1) {
			System.out.println("O mês com a menor temperatura é Fevereiro ");
		}
		if(menor ==2) {
			System.out.println("O mês com a menor temperatura é Março ");
		}
		if(menor ==3) {
			System.out.println("O mês com a menor temperatura é Abril ");
		}
		if(menor ==4) {
			System.out.println("O mês com a menor temperatura é Maio ");
		}
		if(menor ==5) {
			System.out.println("O mês com a menor temperatura é Junho ");
		}
		if(menor ==6) {
			System.out.println("O mês com a menor temperatura é Julho ");
		}
		if(menor ==7) {
			System.out.println("O mês com a menor temperatura é Agosto ");
		}
		if(menor ==8) {
			System.out.println("O mês com a menor temperatura é Setembro ");
		}
		if(menor ==9) {
			System.out.println("O mês com a menor temperatura é Outubro ");
		}
		if(menor ==10) {
			System.out.println("O mês com a menor temperatura é Novembro ");
		}
		if(menor ==11) {
			System.out.println("O mês com a menor temperatura é Dezembro ");
		}
		
		
	}

}
