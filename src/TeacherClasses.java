import java.util.ArrayList;

public class TeacherClasses {
    private static ArrayList<TeacherClasses> teacherClasses;
    private int teacherID;
    private int classID;

    public TeacherClasses(int teacherID, int classID) {
        this.teacherID = teacherID;
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "INSERT INTO TeacherClasses (TeacherID,ClassID) VALUES (" + teacherID + "," + classID + ");";
    }

    public static void generateTeacherClasses() {
        teacherClasses = new ArrayList<>();
        ArrayList<Integer> usedTeachers = new ArrayList<>();
        for (int j = 1; j <= 10; j++) {
            for (int i = 0; i < CourseOffering.getClasses().size(); i++) {
                if (CourseOffering.getClasses().get(i).getPeriod() == j) {
                    int randomTeacher = (int) (Math.random() * 322) + 1;
                    while (usedTeachers.contains(randomTeacher)) {
                        randomTeacher = (int) (Math.random() * 322) + 1;
                    }
                    usedTeachers.add(randomTeacher);
                    TeacherClasses add = new TeacherClasses(randomTeacher, i);
                    teacherClasses.add(add);
                }
            }
            usedTeachers.clear();
        }
    }

    public static ArrayList<TeacherClasses> getTeacherClasses() {
        return teacherClasses;
    }
}
