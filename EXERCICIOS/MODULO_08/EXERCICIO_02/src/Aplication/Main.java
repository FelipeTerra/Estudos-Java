package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Classes.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		double porcentagemAumento;
		
		System.out.println("Informe os dados do funcionário: ");
		
		System.out.printf("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.printf("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.printf("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();	
		System.out.println(funcionario);

		
		System.out.println();
		System.out.println("Informe em quantos % deseja aumentar o salário do funcionário: ");
		porcentagemAumento = sc.nextDouble();
		
		funcionario.aumentoSalario(porcentagemAumento);
		
		System.out.println();	
		System.out.println(funcionario);
		
		sc.close();

	}

}
