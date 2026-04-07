package entites;

import enums.PerformanceLevel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private Integer employeeID;
    private String name;
    private Date admissionDate;
    private Double baseSalary;
    private Department department;
    private PerformanceLevel performanceLevel;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Employee(){}

    public Employee(Integer employeeID, String name, Date admissionDate, Double baseSalary, Department department, PerformanceLevel performanceLevel){
        this.employeeID = employeeID;
        this.name = name;
        this.admissionDate = admissionDate;
        this.baseSalary = baseSalary;
        this.department = department;
        this.performanceLevel = performanceLevel;
    }

    public Integer getEmployeeID() { return employeeID; }

    public void setEmployeeID(Integer employeeID) { this.employeeID = employeeID;  }

    public String getName() {  return name; }

    public void setName(String name) { this.name = name; }

    public Date getAdmisssionDate() { return admissionDate; }

    public void setAdmisssionDate(Date admisssionDate) { this.admissionDate = admisssionDate; }

    public Double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(Double baseSalary) { this.baseSalary = baseSalary; }

    public Department getDepartment() {  return department; }

    public void setDepartment(Department department) { this.department = department; }

    public PerformanceLevel getPerformanceLevel() { return performanceLevel; }

    public void setPerformanceLevel(PerformanceLevel performanceLevel) { this.performanceLevel = performanceLevel; }

    public Double getBonus(){
        return switch (performanceLevel) {
            case BEGINNER -> baseSalary * 0.05;
            case PROFICIENT -> baseSalary * 0.15;
            case ADVANCED -> baseSalary * 0.30;
        };
    }

    public Double getNetSalary(){
        return baseSalary + getBonus();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(employeeID);
        sb.append(" | Nome: ").append(name);
        sb.append(" | Admissão: ").append(sdf.format(admissionDate));
        sb.append(" | Salário Base: R$ ").append(String.format("%.2f", baseSalary));
        sb.append(" | Bônus: R$ ").append(String.format("%.2f", getBonus()));
        sb.append(" | Líquido: R$ ").append(String.format("%.2f", getNetSalary()));
        return sb.toString();
    }
}
