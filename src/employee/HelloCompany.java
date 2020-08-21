package employee;

import java.util.Scanner;

public class HelloCompany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee emp1 = new Employee();

        System.out.println("----Enter Info of the employee----");
        System.out.println("Enter name of this employee :");
        emp1.setName(input.nextLine());
        System.out.println("Enter department of this employee");
        emp1.setDepartment(input.nextLine());

        System.out.println(emp1.getName() + " " + emp1.getDepartment());

    }
}
