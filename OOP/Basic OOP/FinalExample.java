final class Calculator {
    final int Base = 100;

    final void showBase() {
        System.out.println("Base value is: " + Base);
    }
}

public class FinalExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.showBase();

        //c.Base = 20; //It will show error
    }
}