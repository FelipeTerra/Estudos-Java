package Programa;

import java.util.Locale;
import java.util.Scanner;

import Util.Conversor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o valor do Dollar:");
		double valorDollar = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Quantos dolares deseja comprar?");
		double qtdDollar = sc.nextDouble();
		
		System.out.println("----------------------------------------");
		System.out.printf("Você irá pagar R$ %.2f para comprar a quantidade de dollares que deseja", Conversor.converterDollar(qtdDollar, valorDollar));
		
		sc.close();
		

	}

}
