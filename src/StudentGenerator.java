import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentGenerator {
    public static void main(String[] args) {
        try {
            File StudentFile = new File("src/students.txt");
            Scanner scan = new Scanner(StudentFile);
            while(scan.hasNextLine()){
                String student_firstname = scan.next();
                String student_lastname = scan.next();
                Student student = new Student(student_firstname,student_lastname);
                System.out.println(student);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
