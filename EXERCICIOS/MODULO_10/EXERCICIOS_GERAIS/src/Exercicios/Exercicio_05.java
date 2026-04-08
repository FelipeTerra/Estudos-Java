package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posicaoVetor;
		
		System.out.printf("Quantos números você vai digitar?\n");
		n = sc.nextInt();
		Double[] vetor = new Double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um núm: ");
			vetor[i] = sc.nextDouble();
		}
		posicaoVetor = 0;
		double maior = vetor[0];		
		for (int i=0; i<n; i++) {
			if (maior < vetor[i]) {
				maior = vetor[i];
				posicaoVetor = i;
			}
		}
		
		System.out.printf("Maior valor %.1f\n", maior);
		System.out.printf("Posição do maior valor: %d", posicaoVetor);
		
		sc.close();

	}

}
