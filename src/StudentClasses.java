public class StudentClasses {
    private int studentID;
    private int classID;

    public StudentClasses(int studentID, int classID) {
        this.studentID=studentID;
        this.classID=classID;
    }

    public String toString() {
        return "INSERT INTO StudentClasses (StudentID,ClassID) VALUES (" + studentID + "," + classID + ");";
    }
}
