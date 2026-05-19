import java.util.ArrayList;

public class Grade {
    private int studentID;
    private int assignmentID;
    private int grade;
    private static ArrayList<Grade> GRADES;

    public Grade(int studentID, int assignmentID) {
        this.studentID = studentID;
        this.assignmentID = assignmentID;
        grade = (int) (Math.random() * 75) + 1;
    }

    public String toString() {
        return "INSERT INTO Grades (AssignmentID,StudentID,Grade) VALUES (" + assignmentID + "," + studentID + "," + grade + ");";
    }

    public static void generateGrades() {
        Assignment.generateAssignments();
        GRADES = new ArrayList<>();
        for (StudentClasses period : StudentScheduleGen.returnSchedules()) {
            ArrayList<Integer> assignments = Assignment.getAssignmentsByClass(period.getClassID());
            for (int m : assignments) {
                GRADES.add(new Grade(period.getStudentID(), m));
            }
        }
    }

    public static ArrayList<Grade> getGradesList() {
        return GRADES;
    }
}
