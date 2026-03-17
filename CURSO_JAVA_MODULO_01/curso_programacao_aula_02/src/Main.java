import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String x;
//		x = sc.next();
//		System.out.println("Você digitou: " + x);
		
//		int x;
//		x = sc.nextInt();
//		System.out.println("Você digitou: " + x);
		
//		double x;
//		x = sc.nextDouble();
//		System.out.printf("Você digitou: %.1f%n", x);
		
//		char x;
//		x = sc.next().charAt(0);
//		System.out.println("Você digitou: " + x);
		
		//Leitura de vários dados na mesma linha		
//		String x;
//		int y;
//		double z;
//		
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		System.out.println("Dados digitados:");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		//Leitura de vários dados com quebra de linha
//		String s1, s2, s3;
//				
//		s1 = sc.nextLine();
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println("Dados digitados:");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		//Quebra de linha pendente. Neste caso se faz necessário utilizar o comando sc.nextLine() isolado para evitar problemas ao passar valores para as variáveis
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // Aqui foi colocado este comando para evitar erros de buffer. Ao entrar com os valores para as variáveis, ao apertar enten, já seria imputado à variável S1 um valor "vazio" e depois seria inserido as demais variáveis os valores digitados pelos usuários.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		
		sc.close();

	}

}
