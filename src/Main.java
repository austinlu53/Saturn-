import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myFile = new File("src/classes");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] strs = data.split(",");
                System.out.println("INSERT INTO Courses (DepartmentID,CourseType,CourseName) VALUES (10,'" + strs[1] + "','" + strs[0] + "');");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}