package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maiorIdade = -1;
		int menorIdade = Integer.MAX_VALUE;
		int contMulheresFiltro = 0;
		int totalHabitantes = 0;

		System.out.print("Digite a idade (ou -1 para sair): ");
		int idade = sc.nextInt();

		while (idade != -1) {
			System.out.print("Sexo (m/f): ");
			String sexo = sc.next();

			System.out.print("Cor dos olhos (azuis, verdes, castanhos): ");
			String olhos = sc.next();

			System.out.print("Cor dos cabelos (louros, castanhos, pretos): ");
			String cabelos = sc.next();

			if (idade > maiorIdade) {
				maiorIdade = idade;
			}
			if (idade < menorIdade) {
				menorIdade = idade;
			}

			if (sexo.equalsIgnoreCase("f") && (idade >= 18 && idade <= 35) && olhos.equalsIgnoreCase("verdes")
					&& cabelos.equalsIgnoreCase("louros")) {

				contMulheresFiltro++;
			}

			totalHabitantes++;
			System.out.println("Habitante registrado");

			System.out.print("Digite a idade do próximo habitante (ou -1 para sair): ");
			idade = sc.nextInt();
		}

		if (totalHabitantes > 0) {
			System.out.println("RESULTADOS DA PESQUISA");
			System.out.println("Maior idade encontrada: " + maiorIdade + " anos");
			System.out.println("Menor idade encontrada: " + menorIdade + " anos");
			System.out.println("Mulheres (18-35 anos, olhos verdes e cabelos louros): " + contMulheresFiltro);
		} else {
			System.out.println("Nenhum dado foi coletado.");
		}

		sc.close();
	}
}