public class Variables {
    public static void main(String[] args) {
        int items = 50;
        float costperItem = 9.99f;
        float totalCost = items * costperItem;
        char currency = '$';


        System.out.println("Number of Items: " + items);

        System.out.println("Cost per Item: " + costperItem + currency);
        
        System.out.println("Total cost: " + totalCost + currency);


    }
}
