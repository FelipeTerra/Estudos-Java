package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Informe a quantidade de números que vai digitar");
		int n = sc.nextInt();
	
		int[] vetor = new int[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Digite um número");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos:");
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		
		sc.close();

	}

}
