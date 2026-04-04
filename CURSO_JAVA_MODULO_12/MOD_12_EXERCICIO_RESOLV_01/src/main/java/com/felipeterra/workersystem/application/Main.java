package com.felipeterra.workersystem.application;

import com.felipeterra.workersystem.domain.entities.Department;
import com.felipeterra.workersystem.domain.entities.HourContract;
import com.felipeterra.workersystem.domain.entities.Worker;
import com.felipeterra.workersystem.domain.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //cadastrando os dados do funcionário
        System.out.println("------ Cadastro de funcionários ------");
        System.out.println();
        System.out.print("Informe o departamento: ");
        String workerDepartment = sc.nextLine();
        System.out.println();
        System.out.println("------ Dados do funcionário ------");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Qual o nível de senioridade do funcionário? [JUNIOR] [MID_LEVEL] [SENIOR]: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salário base:");
        Double baseSalary = sc.nextDouble();

        //instanciando a classe worker/funcionário
        Worker worker = new Worker(
                workerName,
                WorkerLevel.valueOf(workerLevel.toUpperCase()),
                baseSalary,
                new Department(workerDepartment)
        );

        //cadastrando a quantidade de contratos
        System.out.println("------ Cadastro de Contratos ------");
        System.out.print("Informe a quantidade de contratos que serão cadastrados para este funcionário: ");
        sc.nextLine(); //limpando o buffer
        int numContratos = sc.nextInt();

        for (int i = 1; i <= numContratos; i++) {
            System.out.println("------ Dados do #" + i + "conntrato ------");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duração em horas: ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        //Pedindo au usuário para informar qual o mês ele quer calcular o salário total do funcionário
        System.out.println();
        System.out.print("Informe o mês e ano para calcular o salário (MM/yyyy): ");
        //aqui eu estou criando a variávem monthAndYear, onde vou receber o imput do usuário
        //e apartir desse imput vou tratar a variável recortando manualmente a string, separando o Mês e o Ano
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));//recortando mês do imput informado pelo usuário
        int year = Integer.parseInt(monthAndYear.substring(3));

        //imprimindo na tela a informação a partir do imput informado pelo usuário
        System.out.println("---------------------------------------");
        System.out.println("------ Relatório do salário total ------");
        System.out.println("Nome funcionário: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Nivel do funcionário: " + worker.getLevel());
        System.out.println("Renda total para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}