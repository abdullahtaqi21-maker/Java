package Arrays;


public class Array3 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Strawberry", "Mango", "Pineapple"};

        fruits[2] = "Blueberry";

        System.out.println("Fruits in the array(2):");
        for (String f : fruits) {
          System.out.println(f);
        }

        //for (int i = 0; i < fruits.length; i++) {
        //    System.out.println(fruits[i]);
        //}
    }
}
