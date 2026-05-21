public class fullGen {
    public static void main(String[] args) {
        Student.generateStudents();
        Teacher.generateTeachers();
        Room.generateRooms();
        CourseOffering.generateClasses();
        StudentClasses.generateStudentClasses();
        TeacherClasses.generateTeacherClasses();
        Assignment.generateAssignments();
        Grade.generateGrades();
        for (Student student : Student.getStudents()) {
            System.out.println(student);
        }
        for (Teacher teacher : Teacher.getTeachers()) {
            System.out.println(teacher);
        }
        for (CourseOffering courseOffering : CourseOffering.getClasses()) {
            System.out.println(courseOffering);
        }
        for (Assignment assignment : Assignment.getAssignments()) {
            System.out.println(assignment);
        }
        for (Grade grade : Grade.getGrades()) {
            System.out.println(grade);
        }
    }
}
