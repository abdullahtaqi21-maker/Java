package Basics;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        Scanner at = new Scanner(System.in);

        char currency = '$';

        System.out.println("Enter the number of items: ");
        int items = at.nextInt();

        System.out.println("Enter the cost per item: ");
        float costperItem = at.nextFloat();
        float totalCost = items * costperItem;

        System.out.println("Number of Items: " + items);
        System.out.println("Cost per Item: " + costperItem + currency);
        System.out.println("Total cost: " + totalCost + currency);


    }
}
