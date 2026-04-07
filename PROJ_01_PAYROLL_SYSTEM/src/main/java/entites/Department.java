package entites;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private String departmentID;

    List<Employee> employees = new ArrayList<Employee>();

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

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }
}
