package Application;

import Entities.Account;
import Exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            //coletando os dados
            System.out.println("Enter accont data");
            System.out.print(" | Number: ");
            Integer accNumber = sc.nextInt();
            sc.nextLine();
            System.out.print(" | Holder: ");
            String accHolder = sc.nextLine();
            System.out.print(" | Inicital Balance: ");
            Double accBalance = sc.nextDouble();
            System.out.print(" | Withdraw Limit: ");
            Double withdrawLimit = sc.nextDouble();
            System.out.println("-----------------------------");

            //instanciando a classe account
            Account account = new Account(accNumber, accHolder, accBalance, withdrawLimit);
            System.out.println(account.getHolder());
            System.out.println(account); //imprimindo na tela para verificar tudo
            System.out.println("-----------------------------");

            System.out.print("Enter amount for withdraw: ");//coletando a quantia a ser sacada
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);//passando a quantia para o método de saque
            System.out.println("--------------------------");
            System.out.print("New balance: " + account.getBalance());//imprimindo em tela o novo saldo
        } catch (DomainException e) {
            System.out.println("Withdraw Error: " + e.getMessage());;
        }
        catch (RuntimeException rt){
            System.out.println("Unexpected error!");
        }

        sc.close();
    }
}
