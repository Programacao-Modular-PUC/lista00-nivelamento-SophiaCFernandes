package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] gabarito = new String[8];
		System.out.println("Digite o gabarito da prova");
		for (int i = 0; i < 8; i++) {
			System.out.println("Gabarito da questão " + (i + 1));
			gabarito[i] = sc.nextLine().toUpperCase(); // Para garantir que não haja diferença
		}

		System.out.println("Gabarito: ");
		mostrarGabarito(gabarito);
		int aprovados = 0;

		String[][] numeroAlunoRespostas = new String[10][9];
		for (int i = 0; i < numeroAlunoRespostas.length; i++) {
			System.out.println("Digite o código do aluno " + (i + 1));
			numeroAlunoRespostas[i][0] = sc.nextLine();
			for (int j = 1; j < numeroAlunoRespostas[i].length; j++) {
				System.out.println("Digite a resposta da questao" + j + " do aluno " + (i + 1));
				numeroAlunoRespostas[i][j] = sc.nextLine().toUpperCase();
			}

			int nota = confereGabarito(gabarito, numeroAlunoRespostas[i]);
			System.out.println("Aluno " + numeroAlunoRespostas[i][0] + " - Nota: " + nota);
			if (nota >= 6) {
				aprovados++;
			}
		}

		double taxaAprovacao = calculaAprovacao(aprovados);
		System.out.println("A taxa de aprovação é: " + taxaAprovacao + " %");

	}

	public static int confereGabarito(String[] g, String[] a) { // por aluno
		int nota = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i].equals(g[i - 1])) {
				nota++;

			}
		}
		return nota;
	}

	public static void mostrarGabarito(String gabarito[]) {
		for (int i = 0; i < 8; i++) {
			System.out.println(gabarito[i]);
		}
	}

	public static double calculaAprovacao(int aprovados) {
		return (aprovados / 10.0) * 100;
	}
}
