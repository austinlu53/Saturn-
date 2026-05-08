public class Grades {
    private int studentID;
    private int assignmentID;
    private int grade;

    public Grades(int studentID, int assignmentID) {
        this.studentID = studentID;
        this.assignmentID = assignmentID;
        grade = (int) (Math.random() * 75) + 1;
    }

    public String toString() {
        return "INSERT INTO Grades (AssignmentID,StudentID,Grade) VALUES (" + assignmentID + "," + studentID + "," + grade + ");";
    }
}
