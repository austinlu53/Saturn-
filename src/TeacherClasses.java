public class TeacherClasses {
    private int teacherID;
    private int classID;

    public TeacherClasses(int teacherID, int classID) {
        this.teacherID = teacherID;
        this.classID = classID;
    }

    public int getClassID() {
        return classID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return "INSERT INTO TeacherClasses (TeacherID,ClassID) VALUES (" + teacherID + "," + classID
 + ");";
    }
}
