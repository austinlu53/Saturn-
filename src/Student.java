import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private static int studentIDCounter = 0;
    private static ArrayList<Student> students;
    private String firstName;
    private String lastName;
    private int studentID;


    public Student(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        studentIDCounter++;
        studentID= studentIDCounter;
    }

    public String toString() {
        return ("INSERT INTO Students (StudentFirstName,StudentLastName) " +
                "VALUES (\""+firstName+"\",\""+lastName+"\");");
    }
    public static ArrayList<Student> generateStudents() {
        students = new ArrayList<>();
        try {
            Scanner s = new Scanner(new File("src/students.csv"));
            while (s.hasNextLine()) {
                String[] line = s.nextLine().split(",");
                students.add(new Student(line[1],line[0]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file path!");
        }
        return students;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public int getStudentID() {
        return studentID;
    }
}
