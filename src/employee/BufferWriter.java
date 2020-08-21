package employee;

import java.io.*;
import java.util.Scanner;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Employee[] worker = new Employee[2];

        // declare output file object
        String outputFile = "human.data";
        BufferedWriter writeData = new BufferedWriter(new FileWriter(outputFile));

        // input to employee.Employee array which is used as a writing buffer
        System.out.println("Continue and input Info of Employees? y/n");
        int arrayIndex = 0;
        String yesOrNo = input.nextLine();
        while(yesOrNo.equals("y") && arrayIndex < worker.length) {
            worker[arrayIndex] = new Employee();
            System.out.println("Enter name of this employee :");
            worker[arrayIndex].setName(input.nextLine());
            System.out.println("Enter the department of this employee :");
            worker[arrayIndex].setDepartment(input.nextLine());

            ++arrayIndex;
        }

        // write the content of employee.Employee array into data all at once
        System.out.println("*** Output those Info of employees to human.data ***");
        for(int i = 0; i < arrayIndex; ++i) {
            writeData.write(worker[i].getName() + "\t");
            writeData.write(worker[i].getDepartment() + "\n");
        }
        writeData.close();

        // read the content of employee.Employee array from data
        System.out.println("*** Read from human.data and output to the screen ***");
        String inData;
        File fileId = new File(outputFile);

        if(fileId.exists()) {
            BufferedReader readData = new BufferedReader(new FileReader(fileId));
            while((inData = readData.readLine()) != null) {
                System.out.printf("%s\n", inData);
            }
            readData.close();
        } else {
            System.out.printf("%s cannot be opened successfully\n", outputFile);
        }

        System.out.println("End");

    }
}
