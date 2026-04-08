import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		EXERCÍCIO O5
		
//		Scanner sc = new Scanner(System.in);
//		
//			int id, qtd;
//			double valor;
//			
//			id  = sc.nextInt();
//			qtd = sc.nextInt();
//			
//			if (id == 1) {
//				valor = 4.0*qtd;
//				System.out.printf("Valor total a pagar: %.2f%n", valor);
//			}
//			else if (id == 2) {
//				valor = 4.5*qtd;
//				System.out.printf("Valor total a pagar: %.2f%n", valor);
//			}
//			else if (id == 3) {
//				valor = 5.0*qtd;
//				System.out.printf("Valor total a pagar: %.2f%n", valor);
//			}
//			else if (id == 4) {
//				valor = 2.0*qtd;
//				System.out.printf("Valor total a pagar: %.2f%n", valor);
//			}
//			else if (id == 5) {
//				valor = 1.50*qtd;
//				System.out.printf("Valor total a pagar: %.2f%n", valor);
//			}
//		
//		sc.close();
		
		
//		Exercício 6
//		Scanner sc = new Scanner(System.in);
//		
//			double x;
//			
//			x = sc.nextDouble();
//			
//			if (x < 0.0 || x > 100.0 ) {
//				System.out.println("Fora do intervado");
//			}
//			else if (x <= 25.00) {
//				System.out.println("Intervalo [0,25]");
//			}
//			else if (x <= 50.00 ) {
//				System.out.println("Intervalo [25,50]");
//			}
//			else if (x <= 75.00) {
//				System.out.println("Intervalo [50,75]");
//			}
//			else {
//				System.out.println("Intervalo [75,100]");
//			}
//			
//		sc.close();
		
//		Exercicio 07
//		Scanner sc = new Scanner(System.in);
//		
//			double x = sc.nextDouble();
//			double y = sc.nextDouble();
//			
//			if (x == 0.0 && y == 0.0) {
//				System.out.println("Origem");
//			}
//			else if (x == 0.0) {
//				System.out.println("Eixo Y");
//			}
//			else if (y == 0.0) {
//				System.out.println("Eixo X");
//			}
//			else if (x > 0.0 && y > 0.0) {
//				System.out.println("Q1");
//			}
//			else if (x < 0.0 && y > 0.0) {
//				System.out.println("Q2");
//			}
//			else if (x < 0.0 && y < 0.0) {
//				System.out.println("Q3");
//			}
//			else {
//				System.out.println("Q4");
//			}			
//		
//		sc.close();
		
		
//		Exercicio 08
		Scanner sc = new Scanner(System.in);
		
			double salario = sc.nextDouble();
			double imposto;
			
			int teste = 0;
			if (salario <= 2000.0) {
				teste = 0;
				System.out.println("Isento");
			}
			else if (salario <= 3000.0){
				imposto = (salario-2000.0)*0.08;
				System.out.printf("Imposto de renda resultante R$: %.2f%n", imposto);				
			}
			else if (salario <= 4500.0) {
				imposto = (salario-3000.0)*0.18 + 1000.0 * 0.08;
				System.out.printf("Imposto de renda resultante R$: %.2f%n", imposto);
			}
			else {
				imposto = (salario-4500.0)*0.25 + 1500.0 * 0.18 +1000.0 * 0.08;
				System.out.printf("Imposto de renda resultante R$: %.2f%n", imposto);
			}
			
			if(teste == 0) {
				System.out.println("deu certo");
			}
		
		sc.close();		
		
	}

}
