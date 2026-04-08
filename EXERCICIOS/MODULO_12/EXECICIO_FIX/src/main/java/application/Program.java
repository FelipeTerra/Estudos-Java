package application;

import Enums.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Coletando os dados do cliente e instanciando a classe Client
        System.out.println("Enter Client Data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (dd/MM/yyyy): ");
        String birthDate = sc.next();
        Client client = new Client(name, email, sdf.parse(birthDate.trim()));

        //Coletando os dados do pedido
        System.out.println("------------------------------");
        System.out.println("------ Enter Order data ------");
        System.out.print("Status --> [PENDING_PAYMENT] [PROCESSING] [SHIPPED] [DELIVERED]: ");
        String status = sc.next();
        System.out.print("How many itens to the order?");
        int n = sc.nextInt();
        sc.nextLine(); //limpando o buffer

        //instanciando o order aqui para poder adicionar os produtros na lista
        Order order = new Order(new Date(), OrderStatus.valueOf(status.toUpperCase()), client);

        for (int i = 1; i <= n; i++) {
            System.out.println("------------ Enter #" + i + " item data ------------");
            System.out.print(" Product Name: ");
            String itemName = sc.nextLine();
            System.out.print(" Price: ");
            Double itemPrice = sc.nextDouble();
            System.out.print(" Quantity: ");
            int itemQuantity = sc.nextInt();
            sc.nextLine(); //limpando o buffer novamente

            Product product = new Product(itemName, itemPrice); //instanciando a classe Product

            OrderItem item = new OrderItem(itemQuantity, product.getPrice(), product); //instanciando o OrderItem

            order.addItem(item); //adicionando um item ao pedido
        }

        System.out.println(order);

        sc.close();

    }
}