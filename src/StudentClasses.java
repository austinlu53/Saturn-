import java.util.ArrayList;

public class StudentClasses {
    private int studentID;
    private int classID;
    private static ArrayList<StudentClasses> studentClasses;

    public StudentClasses(int studentID, int classID) {
        this.studentID = studentID;
        this.classID = classID;
    }

    public String toString() {
        return "INSERT INTO StudentClasses (StudentID,ClassID) VALUES (" + studentID + "," + classID + ");";
    }

    public static void generateStudentClasses() {
        studentClasses = new ArrayList<>();
        ArrayList<ArrayList> periods = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            periods.add(new ArrayList<Integer>());
        }
        ClassA.generateClasses();
        ArrayList<ClassA> classes = ClassA.getClasses();
        for(int i =0; i<classes.toArray().length-1;i++) {
            int classPeriod = classes.get(i).getPeriod();
            if(classPeriod == 1) {
                periods.get(0).add(classes.get(i).getClassID());
            }
            if(classPeriod == 2) {
                periods.get(1).add(classes.get(i).getClassID());
            }
            if(classPeriod == 3) {
                periods.get(2).add(classes.get(i).getClassID());
            }
            if(classPeriod == 4) {
                periods.get(3).add(classes.get(i).getClassID());
            }
            if(classPeriod == 5) {
                periods.get(4).add(classes.get(i).getClassID());
            }
            if(classPeriod == 6) {
                periods.get(5).add(classes.get(i).getClassID());
            }
            if(classPeriod == 7) {
                periods.get(6).add(classes.get(i).getClassID());
            }
            if(classPeriod == 8) {
                periods.get(7).add(classes.get(i).getClassID());
            }
            if(classPeriod == 9) {
                periods.get(8).add(classes.get(i).getClassID());
            }
            if(classPeriod == 10) {
                periods.get(9).add(classes.get(i).getClassID());
            }
        }
        for (int j = 1; j <= 5000; j++) {
            for (int k = 0; k <= 9; k++) {
                int randomIndex = (int) (Math.random() * periods.get(k).size());
                int randomClassID = (int) periods.get(k).get(randomIndex);
                StudentClasses Student = new StudentClasses(j,randomClassID);
                studentClasses.add(Student);
            }
        }
    }

    public static ArrayList<StudentClasses> getStudentClasses() {
        return studentClasses;
    }

    public int getClassID() {
        return classID;
    }

    public int getStudentID() {
        return studentID;
    }
}
