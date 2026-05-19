import java.util.ArrayList;

public class Assignment {
    private static ArrayList<Assignment> assignments;
    private static boolean generated = false;
    private static int assignmentIDCounter = 0;
    private int assignmentID;
    private int classID;
    private String name;
    private String type;

    public Assignment(int classID, String name, String type) {
        this.classID = classID;
        this.name = name;
        this.type = type;
        assignmentIDCounter++;
        assignmentID = assignmentIDCounter;
    }

    public static ArrayList<Integer> getAssignmentsByClass(int id) {
        ArrayList<Integer> out = new ArrayList<>();
    for (Assignment assignment : assignments) {
            if (assignment.getClassID() == id) {
                out.add(assignment.getAssignmentID());
            }
        }
        return out;
    }

    public static void generateAssignments() {
        if (!generated) {
            ClassA.generateClasses();
            ArrayList<ClassA> classList = ClassA.getClasses();
            assignments = new ArrayList<>();
            for (ClassA c : classList) {
                int cid = c.getClassID();
                for (int i = 1; i <= 12; i++) {
                    assignments.add(new Assignment(cid,"Minor Assessment " + i, "Minor Assessment"));
                }
                for (int i = 1; i <= 3; i++) {
                    assignments.add(new Assignment(cid,"Major Assessment " + i, "Major Assessment"));
                }
            }
            generated = true;
        }
    }
    @Override
    public String toString() {
        return "INSERT INTO Assignments (ClassID, AssignmentName, AssignmentType) VALUES (" + classID + ", \"" + name + "\", \"" + type + "\");";
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public int getClassID() {
        return classID;
    }
}
