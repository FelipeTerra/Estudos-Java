package application;

import entites.Department;
import entites.Employee;
import enums.PerformanceLevel;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Department tech = new Department("Tecnologia", 01);
        Department hr = new Department("Recursos Humanos", 02);

        // 2. Criar funcionários (Usando uma data fixa para teste)
        Date hoje = new Date();

        Employee e1 = new Employee(101, "Amanda Terra", hoje, 3500.0, tech, PerformanceLevel.BEGINNER);
        Employee e2 = new Employee(102, "Felipe Terra", hoje, 9000.0, tech, PerformanceLevel.ADVANCED);
        Employee e3 = new Employee(201, "Sonia Oliveira", hoje, 5000.0, hr, PerformanceLevel.PROFICIENT);
        Employee e4 = new Employee(201, "Vinicius Oliveira", hoje, 5000.0, hr, PerformanceLevel.PROFICIENT);

        // 3. Composição em ação: Adicionando à lista interna do departamento
        tech.addEmployee(e1);
        tech.addEmployee(e2);
        hr.addEmployee(e3);
        hr.addEmployee(e4);

        // 4. Saída de dados
        System.out.println(tech);
        System.out.println(hr);

        sc.close();

    }
}