import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    private static int teacherIDCounter = 0;
    private String firstName;
    private String lastName;
    private int departmentID;
    public int teacherID;
    private static ArrayList<Teacher> teachers;

    public Teacher(String name, int departmentID) {
        String[] n = name.split(",");
        lastName = n[0];
        firstName = n[1];
        this.departmentID = departmentID;
        teacherIDCounter++;
        teacherID = teacherIDCounter;
    }

    public String toString() {
        return "(\"" + firstName + "\", \"" + lastName + "\", " + departmentID + ")";
    }

    public static void generateTeachers()  {
        teachers = new ArrayList<>();
        try {
        Scanner s = new Scanner(new File("src/teachers.csv"));
            int dept = 0;
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (Character.isDigit(line.charAt(0))) dept++;
                else teachers.add(new Teacher(line,dept));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file path!");
        }
    }

    public static void printTeachers() {
        System.out.println("INSERT INTO Teachers (TeacherFirstName, TeacherLastName, DepartmentID) VALUES ");
        for (int i = 0; i < teachers.size()-1; i++) System.out.println(teachers.get(i) + ", ");
        System.out.println(teachers.getLast() + ";");
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
