import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private static int studentIDCounter = 0;
    private int studentID;
    public static ArrayList<Student> students = generateStudents();

    public Student(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        studentIDCounter++;
        studentID=studentIDCounter;
        for (int i = 0; i < 10; i++) {
            new StudentGenerator();
        }
    }

    public String toString() {
        return ("INSERT INTO Students (StudentFirstName,StudentLastName) " +
                "VALUES (\""+firstName+"\",\""+lastName+"\");");
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
        return students;
    }

    public int getStudentID() {
        return studentID;
    }
}
