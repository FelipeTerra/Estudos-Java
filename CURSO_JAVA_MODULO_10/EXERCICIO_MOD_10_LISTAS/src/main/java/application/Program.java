package application;

import entites.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Informe a quantidade de funcionários que serão cadastrados: ");
        int nFuncionarios = sc.nextInt();

        for (int i = 0; i < nFuncionarios; i++) {

            System.out.println("Funcionário #" + (i + 1) + ": ");

            int id;
            double salario;
            boolean idExiste;

            do{
                System.out.println("Informe o ID: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Entrada inválida!");
                    sc.next(); // limpa o que foi digitado
                } id = sc.nextInt();

                idExiste = false;

                for(Funcionario f : funcionarios){
                    if(f.getId() == id){
                        idExiste = true;
                        System.out.println("ID já cadastrado! Por favor informe um ID diferente!");
                        break;
                    }
                }
            }while(idExiste);

            sc.nextLine();

            System.out.println("Informe o nome: ");
            String nome = sc.nextLine();

            System.out.println("Informe o salario: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Entrada inválida!");
                sc.next(); // limpa o que foi digitado
            }salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id,nome,salario));
        }

        System.out.println("Lista de Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        sc.close();
    }
}