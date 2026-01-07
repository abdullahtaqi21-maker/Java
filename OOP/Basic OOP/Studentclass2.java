class Studentclass2 {
    String name;
    int rollNumber;
    int marks;

    public Studentclass2(String name, int roll, int marks) {
        this.name = name;
        this.rollNumber = roll;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        }else if (marks >= 35) {
            return 'D';
        }else {
            return 'F';
        }
    }

    public void displayDetails() {
        System.out.println("                                     ");
        System.out.println("Name: " + name);
        System.out.println("Roll.no: " + rollNumber);
        System.out.println("marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
       Studentclass2 student1 = new Studentclass2("Abdullah",3, 95);
       student1.displayDetails();

       Studentclass2 student2 = new Studentclass2("Ali",5, 65);
       student2.displayDetails();

       Studentclass2 student3 = new Studentclass2("Mustafa",19, 14);
       student3.displayDetails();
    }
}