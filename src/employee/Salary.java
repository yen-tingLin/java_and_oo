package employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) throws IOException {
        ArrayList<Employee> workerList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("*** Enter name of a employee : (enter q to quit) ***");
        String inputName;
        int inputSalary;
        int inputSalaryRaise;
        while(!(inputName = input.next()).equals("q")) {
            System.out.println("*** Enter base salary of this employee : (enter q to quit) ***");
            inputSalary = input.nextInt();
            System.out.println("*** Enter salary raise of this employee : (enter q to quit) ***");
            inputSalaryRaise = input.nextInt();
            workerList.add(new Employee(inputName, inputSalary, inputSalaryRaise, 0));

            System.out.println("*** Enter name of a employee : (enter q to quit) ***");
        }

        // output to human.data
        String outputFile = "human.data";
        BufferedWriter writeData = new BufferedWriter(new FileWriter(outputFile));
        // calculate salary and output it to human.data
        for(Employee worker : workerList) {
            double salary = (worker.getBaseSalary() + worker.getSalaryRaise()) * 0.9;

            writeData.write(worker.getName() + " " + worker.getBaseSalary() + " "
                    + worker.getSalaryRaise() + " " + salary + "\n");
        }
        writeData.close();

        // for input from human.data
        workerList.clear();
        // read data from human.data line by line and add to workerList(just cleared)
        File fileId = new File(outputFile);

        String inData;
        if(fileId.exists()) {
            BufferedReader readData = new BufferedReader(new FileReader(fileId));
            while((inData = readData.readLine()) != null) {
                Scanner lineScanner = new Scanner(inData).useDelimiter(" ");
                String name = lineScanner.next();
                int baseSalary = lineScanner.nextInt();
                int salaryRaise = lineScanner.nextInt();
                double salary = lineScanner.nextDouble();
                workerList.add(new Employee(name, baseSalary, salaryRaise, salary));
            }
            readData.close();

        } else {
            System.out.printf("cannot open %s properly\n", fileId);
            return;
        }

        for(Employee worker : workerList) {
            System.out.println(worker.getName() + " " + worker.getBaseSalary() + " "
                    + worker.getSalaryRaise() + " " + worker.getSalary());
        }

    }
}
