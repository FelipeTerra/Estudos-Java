package Application;

import Entities.Product;

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

//        for (Product products : list) {
//            System.out.println("Name: " + products.getName() + " | Price: " + products.getPrice() + " | Quantity: " + products.getQuantity());
//        }
        sc.close();
    }
}

// Trabalhando com bloco try-with-resources
// declarando uma variável do tipo string e passando para ela o camnho onde o arquivo está armazenado localmente

//        String path = "c:\\temp\\in.txt";
//        // aqui já estou declarando o BufferedReader e o FileReader dentro do próprio Try, de forma a não precisar abrir e fechar manualmente o arquivo.
//        try ( BufferedReader br = new BufferedReader( new FileReader(path))) {
//            String line = br.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        }
//        catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

// Trabalhando com BufferedWriter e FileWriter

//String[] lines = new String[] { "Good Morning" , "Good afternoon" , "Good Night"}; // Criando um vetor de strings
//String path = "c:\\temp\\out.txt"; // passando o local do arquivo

//Criando o arquivo com o BufferedWriter e FileWriter
//        try (
//BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//        for (String line : lines) {
//        bw.write(line);
//                bw.newLine();
//            }
//                    }
//                    catch (
//IOException e) {
//        e.printStackTrace();
//        }
//
//                //Imprimindo o arquivo criado
//                try ( BufferedReader br = new BufferedReader( new FileReader(path))) {
//String line = br.readLine();
//            while (line != null) {
//        System.out.println(line);
//line = br.readLine();
//            }
//                    }
//                    catch (IOException e) {
//        System.out.println("Error: " + e.getMessage());
//        }
