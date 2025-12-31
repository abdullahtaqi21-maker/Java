package Calculators;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {

    Scanner at = new Scanner(System.in);

    System.out.println("Enter first number");
    int num1 = at.nextInt();

    System.out.println("Enter second number");
    int num2 = at.nextInt();

    System.out.println("Enter operator (+, -, *, /)");
    char operator = at.next().charAt(0);
    float result = 0;
    boolean valid = true;
    switch (operator) {
        case '+':
            result = addNumber(num1, num2);
            break;
        case '-':
            result = substractNumber(num1, num2);
            break;
        case '*':
            result = multiplynumber(num1, num2);
            break;
        case '/':
            if (num2 != 0) {
                result = dividenumber(num1, num2);
            }else {
                System.out.println("Cannot be divided by zero");
                valid = false;
            }
            break;
        default:
            System.out.println("Invalid operator");
            valid = false;
        }
        if (valid) {
            System.out.println("Result: " + result);
        }

    }

    public static float addNumber(int a, int b) {
        return a + b;
    }
     public static float substractNumber(int a, int b) {
        return a - b;
    }
     public static float multiplynumber(int a, int b) {
        return a * b;
    }
     public static float dividenumber(int a, int b) {
        return (float)a / b;
    }
}
