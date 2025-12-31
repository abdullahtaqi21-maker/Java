package Basics;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner at = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n = at.nextInt();

        if (checkEven(n)== true){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }
    public static boolean checkEven(int n){

        if(n%2 == 0)
            return true;
        else
            return false;
    }
}
