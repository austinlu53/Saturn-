import java.util.ArrayList;

public class Assignment {
    private static int assignmentIDCounter = 0;
    private int assignmentID;
    private int classID;
    private String name;
    private String type;
    private static ArrayList<Assignment> assignments;
    private static boolean generated = false;

    public static void main(String[] args) {
        generateAssignments();
        for (Assignment a : assignments) {
            System.out.println(a);
        }
    }
    public Assignment(int classID, String name, String type) {
        this.classID = classID;
        this.name = name;
        this.type = type;
        assignmentIDCounter++;
        assignmentID = assignmentIDCounter;
    }
    public static void generateAssignments() {
        if (!generated) {
            ClassA.generateClasses();
            ArrayList<ClassA> classList = ClassA.getClassesList();
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
}
