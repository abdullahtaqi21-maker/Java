
public class MethodParam {

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Acess Denied - You're not old enough!");
        }else {
            System.out.println("Acess Granted - You're old enough..");
        }
    }
    public static void main(String[] args) {
        checkAge(18);
        checkAge(16);
        checkAge(37);
        checkAge(53);
    }
}
