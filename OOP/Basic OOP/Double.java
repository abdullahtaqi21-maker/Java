
public class Double {
    static int doubleNum(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Double of " + i + " is " + doubleNum(i));
        }
    }
}
