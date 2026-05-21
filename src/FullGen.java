import java.util.Arrays;

public class FullGen {
    public static void main(String[] args) {
        Student.generateStudents();
        Teacher.generateTeachers();
        Room.generateRooms();
        CourseOffering.generateClasses();
        StudentClasses.generateStudentClasses();
        TeacherClasses.generateTeacherClasses();
        Assignment.generateAssignments();
        Grade.generateGrades();
        //Print
        Student.printStudents();
        Teacher.printTeachers();
        Room.printRooms();
        CourseOffering.printClasses();
        StudentClasses.printStudentClasses();
        TeacherClasses.printTeacherClasses();
        Assignment.printAssignments();
        Grade.printGrades();
    }
}
