package entites;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private String departmentID;
    private List<Employee> employees = new ArrayList<>();

    public Department(){}

    public Department(String departmentName, String departmentID){
        this.departmentName = departmentName;
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentID() { return departmentID; }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public Double getTotalPayroll(){
        Double totalPayroll = 0.0;
        for(Employee employee: employees){
            totalPayroll += employee.getNetSalary();
        }
        return totalPayroll;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------------------\n");
        sb.append(" | Department ID: ").append(departmentID);
        sb.append(" | Department Name: ").append(departmentName);
        sb.append(" | Total Payroll: $ ").append(String.format("%.2f", getTotalPayroll()));
        sb.append("-----------------------------------------\n");
        sb.append("--------------- Employees ---------------\n");
        for(Employee employee: employees){
            sb.append(employee.toString()).append("\n");
        }
        sb.append("--------------------------------------------------");
        return sb.toString();
    }
}
