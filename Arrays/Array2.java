package Arrays;

public class Array2 {
    public static void main(String[] args) {
        java.util.Scanner at = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = at.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            numbers[i] = at.nextInt();
        }
        //Largest
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > largest) {
            largest = numbers[i];
        }
    }
        //Smallest
        int smallest = numbers[0];
        for (int o = 1; o < numbers.length; o++) {
        if (numbers[o] < smallest) {
            smallest = numbers[o];
        }
      }
        System.out.println("The Largest number is: " + largest);
        System.out.println("The Smallest number is: " + smallest);
    
}
}