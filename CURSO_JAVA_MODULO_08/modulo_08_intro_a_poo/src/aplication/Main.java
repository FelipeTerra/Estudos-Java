package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		int add, del;
		
		System.out.println("Entre com os dados do Produto");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println("-------------------------------------------------");		
		System.out.println("Informações do produto: " + product);
		System.out.println("-------------------------------------------------");
		
		System.out.print("Informe a quantidade de itens que deseja adicionar ao estoque: ");
		add = sc.nextInt();
		product.addProducts(add); 
		
		System.out.println("-------------------------------------------------");		
		System.out.println("Informações do produto: " + product);
		System.out.println("-------------------------------------------------");
		
		System.out.print("Informe a quantidade de itens que deseja remover do estoque: ");
		del = sc.nextInt();
		product.removeProducts(del); 
		
		System.out.println("-------------------------------------------------");
		System.out.println("Informações do produto: " + product);
		System.out.println("-------------------------------------------------");
		
		
		sc.close();

	}

}
