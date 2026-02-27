package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de alunos matriculados em Pogramação: ");
		int nProg;
		nProg = sc.nextInt();
		int[] alunosProgramacao = new int[nProg];
		//System.out.println(nProg + " alunos matriculados");
		
		System.out.println("Digite o numero de alunos matriculados em Modelagem: ");
		int nMod;
		nMod = sc.nextInt();
		int[] alunosModelagem = new int[nMod];
		//System.out.println(nMod + " alunos matriculados");
		
		System.out.println("Alunos de Pogramação");
		for(int i = 0; i < alunosProgramacao.length; i++) {
			System.out.println("Digite o numero de matricula do aluno " + (i+1));
			alunosProgramacao[i] = sc.nextInt();
			//System.out.println(alunosProgramacao[i]);
		}
		
		System.out.println("Alunos de Modelagem");
		for(int i = 0; i < alunosModelagem.length; i++) {
			System.out.println("Digite o numero de matricula do aluno " + (i+1));
			alunosModelagem[i] = sc.nextInt();
			//System.out.println(alunosProgramacao[i]);
		}
		
		confereIntersecao(alunosModelagem, alunosProgramacao);
	}
	
	public static void confereIntersecao(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < b.length; j++) {
				if(a[i] == b[i]) {
					System.out.println("Matricula em Programação e Modelagem: " + a[i]);
				}
			}
		}
	}
	
}
