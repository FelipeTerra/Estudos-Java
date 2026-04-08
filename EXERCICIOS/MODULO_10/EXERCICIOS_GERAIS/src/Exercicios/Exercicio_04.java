package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int qtdPares = 0;
		
		System.out.printf("Quantos números você vai digitar?\n");
		n = sc.nextInt();
		int[] numeros = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Informe um número:");
			numeros[i] = sc.nextInt();
		}
		
		System.out.printf("Números pares: \n");		
		for (int i=0; i<n; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf(numeros[i] + " ");
				qtdPares++;
			}
		}
		System.out.printf("\nQuantidade de números pares: %d\n", qtdPares);
		
		
		sc.close();

	}

}
