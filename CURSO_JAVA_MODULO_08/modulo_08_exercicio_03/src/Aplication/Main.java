package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Classes.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		System.out.println("------------ Informe os dados do primeiro aluno ------------");
		System.out.printf("Nome: ");
		aluno1.nome = sc.nextLine();
		
		System.out.println();
		System.out.printf("Nota 1: ");
		aluno1.nota1 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota 2: ");
		aluno1.nota2 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota 3: ");
		aluno1.nota3 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println();
		System.out.println("------------ Informe os dados do segundo aluno ------------");
		System.out.printf("Nome: ");
		aluno2.nome = sc.nextLine();
		
		System.out.println();
		System.out.printf("Nota 1: ");
		aluno2.nota1 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota 2: ");
		aluno2.nota2 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota 3: ");
		aluno2.nota3 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println();
		System.out.println("------------------------------------------------:");
		System.out.println();
				
		
		System.out.println("Resultados aluno 1:");
		System.out.println(aluno1);
	
		
		System.out.println();
		System.out.println("Resultados aluno 2:");
		System.out.println(aluno2);
				
		
		sc.close();

	}

}
