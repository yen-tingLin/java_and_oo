package shopping;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) throws IOException {
        ArrayList<Goods> itemsOfferedList = new ArrayList<>();

        itemsOfferedList.add(new Goods("cookies", 20));
        itemsOfferedList.add(new Goods("milk", 30));
        itemsOfferedList.add(new Goods("rice ball", 50));
        itemsOfferedList.add(new Goods("coke", 20));
        itemsOfferedList.add(new Goods("juice", 30));

        System.out.println("Welcome to Momo's shop, here is the menu : ");
        for(int i = 0; i < itemsOfferedList.size(); ++i) {
            Goods item = itemsOfferedList.get(i);
            System.out.println( i+1 + ") " + item.name + " NT$ " + item.price);
        }
        System.out.println(itemsOfferedList.size()+1 + ") Check");

        Scanner input = new Scanner(System.in);
        System.out.println("*** Please enter the number of item ***");

        int itemNumber;
        while((itemNumber = input.nextInt())!= itemsOfferedList.size()+1) {

            if(itemNumber > itemsOfferedList.size()+1) {
                System.out.println("*** Please enter valid item number***");
                continue;
            }

            System.out.println("Please enter the amounts :");
            itemsOfferedList.get(itemNumber-1).amount = input.nextInt();

            System.out.println("*** Please enter the number of item ***");
        }

        // declare output file object
        String file = "bill.data";
        BufferedWriter data = new BufferedWriter(new FileWriter(file));
        data.write("Here is your bill :\n");

        int totalSum = 0;
        for(Goods item : itemsOfferedList) {
            if(item.amount != 0) {
                item.sum = item.amount * item.price;
                //System.out.println(item.name + " " + item.amount + " NT$ " + item.sum);
                data.write(item.name + " " + item.amount + "  NT$ " + item.sum + "\n");
                totalSum += item.sum;
            }
        }
        //System.out.println("--- The sum is " + totalSum + " ---");
        data.write("--- The total sum is " + totalSum + " ---");
        data.close();
        System.out.println("End");
    }
}
