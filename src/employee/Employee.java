package employee;

import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private String department;
    private int baseSalary;
    private int salaryRaise;
    private double salary;
    private ArrayList<Employee> list;

    public Employee() {}

    public Employee(String workerName, int workerBaseSalary,
                    int workerSalaryRaise, double workerSalary) {
        this.name = workerName;
        this.baseSalary = workerBaseSalary;
        this.salaryRaise = workerSalaryRaise;
        this.salary = workerSalary;
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalaryRaise() {
        return salaryRaise;
    }

    public void setSalaryRaise(int salaryRaise) {
        this.salaryRaise = salaryRaise;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
