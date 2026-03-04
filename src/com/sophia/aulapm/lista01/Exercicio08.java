package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] valorObjetos = new double[2];
		int[] qtdObjetos = new int[2];

		for (int i = 0; i < valorObjetos.length; i++) {
			System.out.println("Digite o valor do objeto " + (i + 1) + " :");
			valorObjetos[i] = sc.nextDouble();
		}
		for (int j = 0; j < qtdObjetos.length; j++) {
			System.out.println("Digite a quantidade vendida do objeto " + (j+1));
			qtdObjetos[j] = sc.nextInt();
		}

		int indiceMaisVendido = retornaIndiceMaisVendido(qtdObjetos);
		mostraValorMaisVendido(indiceMaisVendido, valorObjetos);
		mostraIndiceMaisVendido(indiceMaisVendido);

		double totalVendas = calculaValorVendas(valorObjetos);
		mostraValorVendas(totalVendas);
		
		double comissao = calculaComissao(totalVendas);
		mostraComissao(comissao);
		
	}
	
	//TO-DO Um relatório na tela contendo: quantidade vendida, valor unit´ario e valor total de cada objeto
	
	public static void mostraValorUnitQtd(double[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println("Valor unitário do objeto " + (i+1) + ":R$" + a[i]);
				System.out.println();
			}
		}

		
	}

	public static int retornaIndiceMaisVendido(int[] b) {
		int maiorQtd = b[0];
		int cont = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] > maiorQtd) {
				 b[i]= maiorQtd;
				cont++;
			}
		}
		return cont;
	}

	public static void mostraIndiceMaisVendido(int indiceMaisVendido) {
		System.out.println("O índice do objeto mais vendido no vetor é: " + indiceMaisVendido);
	}

	public static void mostraValorMaisVendido(int indiceMaisVendido, double[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i == indiceMaisVendido) {
				System.out.println("O valor do item mais vendido é: R$" + a[i]);
			}
		}
	}

	public static double calculaValorVendas(double[] a) {
		int soma = 0;
		for (int i = 0; i < a.length; i++) {
			soma += a[i];
		}
		return soma;
	}

	public static void mostraValorVendas(double totalVendas) {
		System.out.println("O valor total das vendas é: R$" + totalVendas);
	}

	public static double calculaComissao(double totalVendas) {
		double comissao = 0;
		comissao = (totalVendas * 0.05);
		return comissao;
	}
	
	public static void mostraComissao(double comissao) {
		System.out.println("O valor da comissão a ser pago é de: R$" + comissao);
	}

}
