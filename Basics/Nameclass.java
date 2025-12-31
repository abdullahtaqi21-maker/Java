package Basics;
public class Nameclass {
    String name;
    int age;

    public Nameclass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Nameclass person = new Nameclass("Abdullah", 13);
        person.displayDetails();
        person.setName("Taqi");
        person.setage(14);
        person.displayDetails();
    }
}
