import java.util.ArrayList;

public class Grade {
    private static ArrayList<Grade> grades;
    private int studentID;
    private int assignmentID;
    private int grade;

    public Grade(int studentID, int assignmentID) {
        this.studentID = studentID;
        this.assignmentID = assignmentID;
        grade = (int) (Math.random() * 26) + 75;
    }

    public String toString() {
        return "(" + assignmentID + "," + studentID + "," + grade + ")";
    }
    public static void generateGrades() {
        Assignment.generateAssignments();
        grades = new ArrayList<>();
        for (StudentClasses period : StudentClasses.getStudentClasses()) {
            ArrayList<Integer> assignments = Assignment.getAssignmentsByClass(period.getClassID());
            for (int a : assignments) {
                grades.add(new Grade(period.getStudentID(), a));
            }
        }
    }
    public static void printGrades() {
        System.out.println("INSERT INTO Grades (AssignmentID,StudentID,Grade) VALUES ");
        for (int i = 0; i < grades.size()-1; i++) System.out.println(grades.get(i) + ", ");
        System.out.println(grades.getLast() + ";");
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public static ArrayList<Grade> getGrades() {
        return grades;
    }
}
