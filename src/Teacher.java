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
    private static ArrayList<Teacher> teacherList;

    public Teacher(String name, int departmentID) {
        String[] n = name.split(",");
        lastName = n[0];
        firstName = n[1];
        this.departmentID = departmentID;
        teacherIDCounter++;
        teacherID = teacherIDCounter;
    }

    public String toString() {
        return "INSERT INTO Teachers (TeacherFirstName, TeacherLastName, DepartmentID) VALUES (\"" + firstName + "\", \"" + lastName + "\", " + departmentID + ");";
    }

    public static void generateTeachers()  {
        ArrayList<Teacher> teachers = new ArrayList<>();
        try {
        Scanner s = new Scanner(new File("src/faculty.csv"));
            int dept = 0;
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (Character.isDigit(line.charAt(0))) dept++;
                else teachers.add(new Teacher(line,dept));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file path!");
        }
        teacherList = teachers;
    }

    public static void main(String[] args) {
        generateTeachers();
    }
}
