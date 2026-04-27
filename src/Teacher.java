import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    private static int teacherIDCounter;
    private String firstName;
    private String lastName;
    private int departmentID;
    public int teacherID;
    public Teacher(String name, int departmentID) {
        String[] n = name.split(",");
        lastName = n[0];
        firstName = n[1];
        this.departmentID = departmentID;
        teacherIDCounter++;
        teacherID = teacherIDCounter;
    }
    public String toString() {
        return "INSERT INTO Teachers (FirstName, LastName, DepartmentID) VALUES (\"" + firstName + "\", \"" + lastName + "\", " + departmentID + ");";
    }
    public static ArrayList<Teacher> generateTeachers() throws FileNotFoundException {
        ArrayList<Teacher> teachers = new ArrayList<>();
        Scanner s = new Scanner(new File("src/faculty.csv"));
        int dept = 0;
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (Character.isDigit(line.charAt(0))) dept++;
            else teachers.add(new Teacher(line,dept));
        }
        return teachers;
    }
}
