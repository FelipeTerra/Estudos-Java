package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos a serem cadastrados: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Informe os dados do #" + (i + 1) + " produto:");
            System.out.print("O produto é novo, usado ou importado (n,u,i)? ");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();
            switch (typeProduct) {
                case 'n': {
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    products.add(new Product(name, preco));
                    break;
                }
                case 'u': {
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Data de fabricação (DD/MM/YYYY): ");
                    Date data = sdf.parse(sc.nextLine());
                    UsedProduct usedProduct = new UsedProduct(name, preco, data);
                    products.add(usedProduct);
                    break;
                }
                case 'i': {
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Imposto: ");
                    Double imposto = sc.nextDouble();
                    ImportedProduct importedProduct = new ImportedProduct(name, preco, imposto);
                    products.add(importedProduct);
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("------------ Etiquedas Produtos ------------");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }


        sc.close();
    }
}
