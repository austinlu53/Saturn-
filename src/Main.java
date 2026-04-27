import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        try {
            File StudentFile = new File("src/students.txt");
            Scanner scan = new Scanner(StudentFile);
            while(scan.hasNextLine()){
                String student_firstname = scan.next();
                String student_lastname = scan.next();
                System.out.println("INSERT INTO Students (StudentFirstName,StudentLastName) " +
                        "VALUES ("+"'"+student_firstname+"'"+","+"'"+student_lastname+"'"+");");
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}