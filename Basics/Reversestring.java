package Basics;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner at = new Scanner(System.in);

        System.out.println("Enter something");
        String str = at.next();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("The string is a Palindrome.");
        }else {
            System.out.println("The string is not a Palindrome.");
        }
        System.out.println("Reversed string: " + reverse);
    }
}
