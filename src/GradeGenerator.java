import java.sql.Array;
import java.util.ArrayList;

public class GradeGenerator {
    public static void main(String[] args) {
        for (StudentClasses period : StudentClassesGenerator.generateSchedules()) {
            ArrayList<Integer> assignments = Assignment.getAssignmentsByClass(period.getClassID());
            System.out.println(Assignment.getAssignments());
            for (int m : assignments) {
                System.out.println(new Grades(period.getStudentID(), m));
            }
        }
    }
}
