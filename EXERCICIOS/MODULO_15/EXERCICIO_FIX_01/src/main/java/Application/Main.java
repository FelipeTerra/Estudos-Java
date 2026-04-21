package Application;

import Entities.Product;

import javax.lang.model.util.ElementScanner6;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file path: ");
        String filePath = sc.nextLine();

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while (line != null) {
                if (!line.isBlank()) {
                    String[] fields = line.split(",");
                    String name = fields[0];
                    Double price = Double.parseDouble(fields[1]);
                    Integer quantity = Integer.parseInt(fields[2]);
                    list.add(new Product(name, price, quantity));
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("======================================================");
        System.out.println("================ Produtos Originais ================");

        for (Product products : list) {
            System.out.println("Name: " + products.getName() + " | Price: " + products.getPrice() + " | Quantity: " + products.getQuantity());
        }
        System.out.println();

        File sourceFile = new File(filePath); // cria um arquivo que serrá usado posteriormente para passar o caminho da pasta raiz para uma variável do tipo string
        String sourceParent = sourceFile.getParent(); //passando o caminho da pasta raiz para a string

        String targetFolder = sourceParent + "/out"; //criando o nome da pasta
        String targetFile = targetFolder + "/summary.csv"; //criando o nome do novo arquivo

        boolean success = new File(targetFolder).mkdir();

        if (!success){
            try (BufferedWriter bw = new BufferedWriter( new FileWriter(targetFile))) {
                for (Product products : list){
                    bw.write(products.getName() + "," + products.total());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
            }

        }

        System.out.println();
        System.out.println("======================================================");
        System.out.println("================ Produtos atualizados ================");


        try (BufferedReader br = new BufferedReader(new FileReader(targetFile))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                System.out.println(" | Name: " + fields[0] + " | Total price: $" + fields[1]);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        sc.close();
    }
}