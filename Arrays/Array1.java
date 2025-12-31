package Arrays;


public class Array1 {
    public static void main(String[] args) {
        int[] numbers = {45, 2, 81, 99, 21, 11, 57};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Number of elements: " + numbers.length);

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
