package com.sophia.aulapm.lista01;

import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) {

		double[][] vendas = new double[12][4];
		Random rd = new Random();
		double min = 0;
		double max = 500;

		for (int i = 0; i < vendas.length; i++) {
			for (int j = 0; j < vendas[i].length; j++) {
				vendas[i][j] = min + (max - min) * rd.nextDouble();
			}
		}

		
		double totalAno = calculaTotalAno(vendas);
		mostrarTotalAno(totalAno);
		
		calculaTotalSemana(vendas);
		
		calculaMes(vendas);

	}
	
	public static void calculaMes(double[][] a) {
	    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
	                      "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

	    for (int i = 0; i < a.length; i++) { 
	        double somaMes = 0; 
	        for (int j = 0; j < a[i].length; j++) { 
	            somaMes += a[i][j];
	        }
	        System.out.printf("Total de %s: R$ %.2f\n", meses[i], somaMes);
	    }
	}

	public static void calculaTotalSemana(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int numeroSemana = (i * 4) + (j + 1);
				System.out.printf("Semana %d: R$ %.2f\n", numeroSemana, a[i][j]);
			}
		}
		
	}

	public static double calculaTotalAno(double[][] a) {
		double soma = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				soma += a[i][j];
			}
		}
		return soma;
	}

	public static void mostrarTotalAno(double x) {
		System.out.printf("O total de vendas no ano foi: R$ %.2f\n", x);
	}

}
