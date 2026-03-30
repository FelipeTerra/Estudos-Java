package com.felipeterra.workersystem.domain.entities;

import com.felipeterra.workersystem.domain.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract>  contracts = new ArrayList<>();

    public Worker(){
    }

    public Worker(Department department, Double baseSalary, WorkerLevel level, String name) {
        this.department = department;
        this.baseSalary = baseSalary;
        this.level = level;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public double income(int year, int month){

        double som = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for (HourContract contract: contracts){

            calendar.setTime(contract.getDate());
            int calendarYear = calendar.get(Calendar.YEAR);
            int calendarMonth = 1 + calendar.get(Calendar.MONTH);

            if (calendarYear == year && calendarMonth == month){
                sum += contract.totalValue();
            }
        }
    }
}
