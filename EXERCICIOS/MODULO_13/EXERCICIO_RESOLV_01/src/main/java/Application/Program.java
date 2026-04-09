package Application;

import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("Informe a quantidade de funcionários a serem cadastrados: ");
        Integer n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Dados do #" + (i + 1) + " Funcionário");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if(ch == 'y' || ch == 'Y'){
                System.out.print("Addtional Charge:");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge));
            }
            else {
                employees.add(new Employee(name, hour, valuePerHour));
            }
            System.out.println("------------------------------");
        }

        System.out.println();
        System.out.println("------------------ Payments ------------------");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(" | Funcionário " + String.format("%02d", i + 1));
            System.out.println(" | Nome: " + employees.get(i).getName());
            // Aqui chamamos o método de cálculo de salário da sua classe
            System.out.printf(" | Salário: R$ %.2f%n", employees.get(i).payment());
            System.out.println("------------------------------");
        }


        sc.close();
    }


}
