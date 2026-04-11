package Application;

import Entities.Contribuintes;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuintes> contribuinte = new ArrayList<>();

        System.out.print("Informe a quantidade de contribuintes a serem cadastrados: ");
        int qtdContribuintes = sc.nextInt();

        System.out.println("--------------------------------");
        for (int i = 1; i <= qtdContribuintes ; i++) {
            System.out.println("Dados do #" + i + " contribuinte: ");
            System.out.print("Informe o tipo de contribuinte Pessoa Física [f], ou Pessoa jurídica [j] ");
            char tipoContribuinte = sc.next().charAt(0);
            sc.nextLine();
            switch (tipoContribuinte){
                case 'f': {
                    System.out.print(" | Nome: ");
                    String nome = sc.nextLine();
                    System.out.print(" | Renda anual: ");
                    Double rendaAnual = sc.nextDouble();
                    System.out.print(" | Gastos com saúde: ");
                    Double gastosComSaude = sc.nextDouble();
                    PessoaFisica pf = new PessoaFisica(nome, rendaAnual, gastosComSaude);
                    contribuinte.add(pf);
                    break;
                }
                case 'j': {
                    System.out.print(" | Nome: ");
                    String nome = sc.nextLine();
                    System.out.print(" | Renda anual: ");
                    Double rendaAnual = sc.nextDouble();
                    System.out.print(" | Quantidade Funcionários: ");
                    Integer qtdFuncionarios = sc.nextInt();
                    PessoaJuridica pj = new PessoaJuridica(nome, rendaAnual, qtdFuncionarios);
                    contribuinte.add(pj);
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("Total de imposto pago por: ");
        Double totalImposto = 0.0;
        for (Contribuintes ctb: contribuinte){
            totalImposto += ctb.calcularImposto();
            System.out.println(" | " + ctb.getNome() + " --- R$ " + String.format("%.2f", ctb.calcularImposto()));
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Total de imposto arrecadado: $ " + String.format("%.2f", totalImposto));

        sc.close();
    }
}
