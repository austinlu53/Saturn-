import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String student_firstname;
    private String student_lastname;

    public Student(String student_firstname,String student_lastname){
        this.student_firstname = student_firstname;
        this.student_lastname = student_lastname;

        for (int i = 0; i < 10; i++) {
            new StudentGenerator();
        }
    }

    public String toString() {
        return ("INSERT INTO Students (StudentFirstName,StudentLastName) " +
                "VALUES ("+"'"+student_firstname+"'"+","+"'"+student_lastname+"'"+");");
    }
    public static ArrayList<Student> generateStudents() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            Scanner s = new Scanner(new File("src/students.txt"));
            while (s.hasNextLine()) {
                String[] line = s.nextLine().split(" ");
                students.add(new Student(line[0],line[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file path!");
        }
        for (Student student : students) System.out.println(student);
        return students;
    }
}
