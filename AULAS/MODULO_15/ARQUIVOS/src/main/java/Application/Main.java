package Application;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

//        // Trabalhando de forma mais simples com arquivos.

//        Scanner sc = null;
//        File file = new File("c:\\temp\\in.txt"); //instanciando o arquivo e passando o caminho da pasta onde ele está
//        try {
//            sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        }
//        catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        finally {
//            if (sc != null) {
//                sc.close();
//            }
//        }

        // Aqui vamos trabalhar com arquivos usando Streams
//        String path = "c:\\temp\\in.txt"; // declarando uma variável do tipo string e passando para ela o camnho onde o arquivo está armazenado localmente
//        FileReader fr = null; //Declarando uma variável do tipo FileReader
//        BufferedReader br = null; //Declarando uma variável do tipo BufferedReader
//
//        try {
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//
//            String line = br.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        }
//        catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        finally {
//            try {
//                if (br != null) {
//                    br.close();
//                }
//                if (fr != null) {
//                    fr.close();
//                }
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

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

        String[] lines = new String[] { "Good Morning" , "Good afternoon" , "Good Night"}; // Criando um vetor de strings
        String path = "c:\\temp\\out.txt"; // passando o local do arquivo

        //Criando o arquivo com o BufferedWriter e FileWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //Imprimindo o arquivo criado
        try ( BufferedReader br = new BufferedReader( new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }

}
