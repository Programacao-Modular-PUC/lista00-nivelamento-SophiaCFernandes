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

		double totalVendas = calculaValorVendas(valorObjetos, qtdObjetos);
		mostraValorVendas(totalVendas);
		
		double comissao = calculaComissao(totalVendas);
		mostraComissao(comissao);
		
		mostraValorUnitQtd(valorObjetos, qtdObjetos);
		
		mostraPagamentoFinal(comissao);
		
	}
	
	public static void mostraValorUnitQtd(double[] precos, int[] quantidades) {
	    for (int i = 0; i < precos.length; i++) {
	        double totalObjeto = precos[i] * quantidades[i];
	        System.out.printf("Objeto %d : Preço: R$%.2f | Qtd: %d | Total: R$%.2f%n", 
	                          (i + 1), precos[i], quantidades[i], totalObjeto);
	    }
	}

	public static int retornaIndiceMaisVendido(int[] quantidades) {
	    int maiorQtd = quantidades[0];
	    int indice = 0;
	    for (int i = 1; i < quantidades.length; i++) {
	        if (quantidades[i] > maiorQtd) {
	            maiorQtd = quantidades[i]; 
	            indice = i;            
	        }
	    }
	    return indice;
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

	public static double calculaValorVendas(double[] precos, int[] quantidades) {
	    double somaTotal = 0;
	    for (int i = 0; i < precos.length; i++) {
	        somaTotal += (precos[i] * quantidades[i]);
	    }
	    return somaTotal;
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
	
	public static void mostraPagamentoFinal(double comissao) {
	    double salarioFixo = 545.00;
	    System.out.printf("Salário Total: R$ %.2f%n", (salarioFixo + comissao));
	}

}
