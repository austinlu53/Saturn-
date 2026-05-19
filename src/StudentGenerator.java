import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentGenerator {
    public static void main(String[] args) {
        try {
            File StudentFile = new File("src/students.txt");
            Scanner scan = new Scanner(StudentFile);
            while(scan.hasNextLine()){
                String studentFirstName = scan.next();
                String studentLastName = scan.next();
                Student student = new Student(studentFirstName,studentLastName);
                System.out.println(student);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
