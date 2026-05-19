import java.sql.Array;
import java.util.ArrayList;

public class GradeGenerator {
    public static void main(String[] args) {
        Assignment.generateAssignments();
        for (StudentClasses period : StudentScheduleGen.returnSchedules()) {
            // System.out.println(period.getClassID());
            ArrayList<Integer> assignments = Assignment.getAssignmentsByClass(period.getClassID());
            // System.out.println(Assignment.getAssignmentsByClass(3));
            // System.out.println(assignments);
            for (int m : assignments) {
                System.out.println(new Grades(period.getStudentID(), m));
            }
        }
    }
}
