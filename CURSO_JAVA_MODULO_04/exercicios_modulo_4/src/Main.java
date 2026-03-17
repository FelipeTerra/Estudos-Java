//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Exercício 01 forma sem entrada de dados
//		int A, B, C;
//		
//		A = 10;
//		B = 30;
//		C = A + B;
//		System.out.println("Soma = " + C);
//		System.out.println();
//		
//		A = -30;
//		B = 10;
//		C = A + B;
//		System.out.println("Soma = " + C);
//		System.out.println();
//		
//		A = 0;
//		B = 0;
//		C = A + B;
//		System.out.println("Soma = " + C);
//		System.out.println();
		
		//Exercício 01 forma com entrada de dados
		
//		Scanner sc = new Scanner(System.in);
//		
//			int A, B, soma;
//			
//			A = sc.nextInt();
//			B = sc.nextInt();
//			
//			soma = A + B;
//			
//			System.out.println("Soma = " + soma);
//			System.out.println();
//		
//		sc.close();
		
	//	Exercicio 02
//		Scanner sc = new Scanner(System.in);
//		
//			double pi, raio, area, x;
//			
//			pi = 3.14159;			
//			x = sc.nextFloat();			
//			raio = Math.pow(x, 2.0);
//			area = pi*raio;
//			
//			System.out.printf("Area = %.4f", area);
//		
//		sc.close();
		
	//	Exercício 03
//		Scanner sc = new Scanner(System.in);
//		
//			int A, B, C, D, dife;
//			
//			A = sc.nextInt();
//			B = sc.nextInt();
//			C = sc.nextInt();
//			D = sc.nextInt();
//			
//			dife = (A*B-C*D);
//			
//			System.out.println("Diferença = " + dife);
//		
//		sc.close();
		
	//	Exercício 04
//		Scanner sc = new Scanner(System.in);
//			
//			int number, horas;
//			double valorHora, salario;
//			
//			System.out.println("Informe o número do funcionário");
//			number    = sc.nextInt();
//			
//			System.out.println("Informe a quantidade de horas trabalhadas");
//			horas     = sc.nextInt();
//			
//			System.out.println("Informe o valor por hora trabalhada");
//			valorHora = sc.nextDouble();
//			
//			salario   = horas*valorHora;
//			
//			System.out.println();
//			System.out.println("Número funcionário: " + number);
//			System.out.printf("Salário: R$ %.2f%n",salario);
//		
//		sc.close();
		
	//	Exercício 05
		
//		Scanner sc = new Scanner(System.in);
//		Locale.setDefault(Locale.US);
//		
//			int cod1, qtd1, cod2, qtd2;
//			double valor1, valor2, total;
//			
//			System.out.println("Informe os dados do primeiro produto");
//			System.out.println();
//			
//			cod1   = sc.nextInt();
//			qtd1   = sc.nextInt();
//			valor1 = sc.nextDouble();
//			
//			System.out.println();
//			System.out.println("Informe os dados do segundo produto");
//			System.out.println();
//			
//			cod2   = sc.nextInt();
//			qtd2   = sc.nextInt();
//			valor2 = sc.nextDouble();
//			
//			total = qtd1 * valor1 + qtd2 * valor2;
//			
//			System.out.println();
//			System.out.printf("Valor total a pagar R$  %.2f%n", total);
//		
//		sc.close();
		
	//	Exercicio 06
		
		Scanner sc = new Scanner(System.in);
		
			double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
			
			A = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
			
			triangulo = A*C/2.0;
			circulo   = 3.14159 * C *C;
			trapezio  = ((A+B)*C)/2.0;
			quadrado  = B * B;
			retangulo = A * B;
			
			System.out.println();
			System.out.printf("Triangulo: %.3f%n", triangulo);
			System.out.printf("Circulo: %.3f%n", circulo);
			System.out.printf("Trapezio: %.3f%n", trapezio);
			System.out.printf("Quadrado: %.3f%n", quadrado);
			System.out.printf("Retangulo: %.3f%n", retangulo);
		
		sc.close();

	}

}
