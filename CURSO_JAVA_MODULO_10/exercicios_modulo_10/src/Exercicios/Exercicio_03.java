package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import Entites.Pessoa;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Informe a quantidade de pessoas que serão cadastradas: ");
		n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i=0; i<pessoa.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: \n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.println("---------------------------------");
			pessoa[i] = new Pessoa(nome, idade, altura);
			
		}
		
		System.out.println();
		System.out.println("Pessoas cadrastadas");
		System.out.println();
		
		for (int i=0; i<pessoa.length; i++) {
			System.out.printf("Pessoa %d: \n", i+1);
			System.out.printf("Nome: %s\n", pessoa[i].getNome());
			System.out.printf("Idade: %d\n", pessoa[i].getIdade());
			System.out.printf("Nome: %.2f\n", pessoa[i].getAltura());
			System.out.println("---------------------------------");
		}
		
		int nmenores = 0;
		double totalAltura = 0;
		
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				nmenores++;
			}
			totalAltura += pessoa[i].getAltura();
		}
		
		double mediaAltura = totalAltura / n;
		double percentualMenores = ((double)nmenores / n) * 100.0;
		
		System.out.println("---------------------------------");
		System.out.printf("Média das alturas: %.2f\n", mediaAltura);
		System.out.println("---------------------------------");
		System.out.printf("Pessoas com menos de 16 anos\n");
		
		System.out.printf("Porcentagem: %.1f%%\n", percentualMenores);
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.printf("Nome: %s\n", pessoa[i].getNome());
			}
		}		
		
		sc.close();

	}

}
