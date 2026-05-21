import java.util.ArrayList;

public class fullGen {
    public static void main(String[] args) {
        Student.generateStudents();
        Teacher.generateTeachers();
        Room.generateRooms();
        ClassA.generateClasses();
        StudentClasses.generateStudentClasses();
        TeacherClasses.generateTeacherClasses();
        Assignment.generateAssignments();
        Grade.generateGrades();
        System.out.println(Student.getStudents());
        System.out.println(Teacher.getTeachers());
        System.out.println(Room.getRooms());
        System.out.println(ClassA.getClasses());
        System.out.println();
    }
}
