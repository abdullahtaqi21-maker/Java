package Calculators;
import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");

        double n1 = getNumber (scanner, "Enter first number");
        char op = getOperator (scanner);
        double n2 = getNumber (scanner, "Enter second number");

        calculateAndprint(n1, n2, op);
        scanner.close();
    }

    public static double getNumber (Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public static char getOperator(Scanner scanner) {
        System.out.println("Enter a Operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static void calculateAndprint(double n1, double n2, char op) {
        double result;
        switch (op) {
            case '+':
                result = n1 + n2;
                System.out.println("Result: " + result);
                break;
            
            case '-':
                result = n1 - n2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = n1 * n2;
                System.out.println("Result: " + result);
                break;
            
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by Zero..");
                }
                break;
            
            default:
                System.out.println("Invalid Operator");
        }
    }
}
