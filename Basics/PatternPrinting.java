package Basics;
import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner at = new Scanner(System.in);


        System.out.println("Enter the size of the pattern for Triangle");
        int n1 = at.nextInt();

        System.out.println("\nRigth-angled triangle: \n");
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
        System.out.println("Enter the size of the pattern for Square");
        int n2 = at.nextInt();

        System.out.println("\nSquare: \n");
        for (int o = 1; o <= n2; o++){
            for (int p = 1; p <= n2; p++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
