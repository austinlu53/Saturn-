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

    public static ArrayList<Integer> getAssignmentsByClass(int classID) {
        if (assignments == null) {
            generateAssignments();
        }
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i < assignments.size(); i++) {
           if (assignments.get(i).getClassID() == classID) {
               out.add(assignments.get(i).getAssignmentID());
           }
        }
        return out;
    }
    public Assignment(int classID, String name, String type) {
        this.classID = classID;
        this.name = name;
        this.type = type;
        assignmentIDCounter++;
        assignmentID = assignmentIDCounter;
    }

    public static ArrayList<Assignment> getAssignmentsByClass(int id) {
        ArrayList<Assignment> out = new ArrayList<>();
        for (Assignment assignment : assignments) {
            if (assignment.getClassID() == id) {
                out.add(assignment);
            }
        }
        return out;
    }

    public static void generateAssignments() {
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

    public static ArrayList<Assignment> getAssignments() {
        if (assignments == null) {
            generateAssignments();
        }
        return assignments;
    }
}
