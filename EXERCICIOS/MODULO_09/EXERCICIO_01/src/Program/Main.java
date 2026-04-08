package Program;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Conta;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta; // aqui eu apenas declaro a variavel sem stanciar a classe
				
		System.out.printf("Informe o número da conta:");
		int numero = sc.nextInt();
		System.out.println();

		System.out.printf("Nome:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println();		

		System.out.printf("Deseja fazer um depósito inicial para criar a conta? s/n ");
		System.out.println();
		char verificaDeposito = sc.next().charAt(0);
		
		if (verificaDeposito == 's') {
			System.out.printf("Informe o valor que deseja depositar: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial); // aqui eu estou devidamente stanciando a minha classe
			System.out.println();
			System.out.println("Conta criada com sucesso.");
			sc.nextLine();
		}
		else {
			conta = new Conta(numero, nome);
			System.out.println();
			System.out.println("Conta criada com sucesso. Sem saldo inicial.");
		}
		
		System.out.println();
		System.out.println(conta);
		
		System.out.println();
		System.out.printf("Informe um valor para depósito:");
		conta.deposito(sc.nextDouble());
		sc.nextLine();
		
		System.out.println();
		System.out.println(conta);
		
		System.out.println();
		System.out.printf("Informe um valor para saque: ");
		conta.saque(sc.nextDouble());
		sc.nextLine();
		
		System.out.println();
		System.out.println(conta);
		
		sc.close();

	}

}
