package Application;

import java.util.Locale;
import java.util.Scanner;

import entites.rectangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle rectangle = new rectangle();
		
		System.out.println("Por favor informe os dados do retangulo");
		System.out.printf("Altura: ");
		rectangle.altura = sc.nextDouble();
		
		System.out.printf("Largura: ");
		rectangle.largura = sc.nextDouble();
		
		System.out.println();	
		System.out.println(rectangle);
		
		sc.close();

	}

}
