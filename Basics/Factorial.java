package Basics;

import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            Scanner at = new Scanner(System.in);

            System.out.print("Enter a number to calculate its factorial: ");
            int number = at.nextInt();

            int fact = calcfactorial(number);

            System.out.println("The factorial of " + number + " is: " + fact);
        }   
        
        public static int calcfactorial(int number) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }

}