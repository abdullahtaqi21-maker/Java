
public class Studentclass {
    String name;
    int age;
    int roll;
    int grade;
    String school;

    public Studentclass(String name, int age, int roll, int grade, String school) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.grade = grade;
        this.school = school;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll.no: " + roll);
        System.out.println("Class: " + grade);
        System.out.println("School: " + school);
    }

    public static void main(String[] args) {
        Studentclass student = new Studentclass("Abdullah", 13, 2, 8, "New Shams school");
        student.displayDetails();
    }
}
