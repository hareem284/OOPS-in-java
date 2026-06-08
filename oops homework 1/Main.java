class Student {
    String name;
    int rollNo;
    double percentage;

    // Constructor
    Student(String name, int rollNo, double percentage) {
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    // Method to display details
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Percentage: " + percentage);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ali", 1, 95.5);
        Student student2 = new Student("Sara", 2, 94.8);
        Student student3 = new Student("Ahmed", 3, 94.2);
        Student student4 = new Student("Ayesha", 4, 93.9);
        Student student5 = new Student("Hamza", 5, 93.5);
        Student student6 = new Student("Fatima", 6, 93.0);
        Student student7 = new Student("Zain", 7, 92.7);
        Student student8 = new Student("Mariam", 8, 92.4);
        Student student9 = new Student("Usman", 9, 92.0);
        Student student10 = new Student("Hina", 10, 91.8);

        student1.showDetails();
        student2.showDetails();
        student3.showDetails();
        student4.showDetails();
        student5.showDetails();
        student6.showDetails();
        student7.showDetails();
        student8.showDetails();
        student9.showDetails();
        student10.showDetails();
    }
}