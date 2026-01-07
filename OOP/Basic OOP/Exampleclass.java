
public class Exampleclass {
    String name;
    int age;

    public Exampleclass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Exampleclass person = new Exampleclass("Abdullah", 13);
        person.displayDetails();
    }
}