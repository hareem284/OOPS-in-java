
//  b. Write code to create a `Student` 
// object named `alice` 
// who is taking a course called "Computer Science" worth 4 credits.
//  Alice's ID number is 1234. Alice receives a grade of 3.7 in the course. 
// Print Alice's GPA. c. Write code to create a `Course` object named `math` worth 3 credits.
//  Add `math` to Alice's list of courses. Alice receives a grade of 4.0 in the course.
//  Print Alice's updated GPA. d. Assume that the `Course` class now includes a `getLetterGrade()
// ` method that returns a letter grade (A, B, C, etc.) based on the numerical grade. Modify the 
// `Student` class to include a `getTranscript()` method that returns a string representation of 
// the student's transcript in the following format: Name: Alice ID: 1234 Course: Computer Science
//  (4 credits) Grade: 3.7 (B+) Course: Math (3 credits) Grade: 4.0 (A) e. Write code to create a 
// `Student` object named `bob` who is taking the same courses as Alice. Bob receives a grade of 
// 3.0 in Computer Science and a grade of 3.5 in Math. Print Bob's GPA and transcript.
import java.util.ArrayList;

public class Course {
    private String name;
    private int credits;
    private double grade;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public int getCredits() {
        return credits;
    }

    public String getName() {
        return name;
    }

    // For part (d): Convert numerical grade to letter grade
    public String getLetterGrade() {
        if (grade >= 4.0)
            return "A";
        else if (grade >= 3.7)
            return "A-";
        else if (grade >= 3.3)
            return "B+";
        else if (grade >= 3.0)
            return "B";
        else if (grade >= 2.7)
            return "B-";
        else
            return "C";
    }
}

public class student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public double getGPA() {
        if (courses.isEmpty())
            return 0.0;

        double total = 0;
        for (Course course : courses) {
            total += course.getGrade();
        }
        return total / courses.size();
    }

    // For part (d): Generate transcript
    public String getTranscript() {
        StringBuilder transcript = new StringBuilder();
        transcript.append("Name: ").append(name).append("\n");
        transcript.append("ID: ").append(id).append("\n");

        for (Course course : courses) {
            transcript.append("Course: ")
                    .append(course.getName())
                    .append(" (").append(course.getCredits()).append(" credits)\n")
                    .append("Grade: ")
                    .append(course.getGrade())
                    .append(" (").append(course.getLetterGrade()).append(")\n\n");
        }
        return transcript.toString();
    }
}

class Main {
    public static void main(String[] args) {
        student s1 = new student("alice", 345);
        Course c1 = new Course("Science", 67);
        c1.setGrade(3.7);
        s1.addCourse(c1);
        System.out.println("alice's gpa is " + s1.getGPA());

    }
}