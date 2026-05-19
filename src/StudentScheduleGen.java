import java.util.ArrayList;

public class StudentScheduleGen {
    public static ArrayList<StudentClasses> returnSchedules() {
        // ClassA.generateClasses();
        ArrayList<ClassA> classes = ClassA.getClassesList();
        // for (ClassA c : classes) { System.out.println(c);};
        ArrayList<Student> students = Student.getStudents();
        ArrayList<StudentClasses> studentClasses = new ArrayList<>();
        for (Student student : students) {
            for (int j = 1; j <= 10; j++) {
                ClassA c = classes.get((int) (Math.random()*classes.size()));
                while (c.getPeriod() != j) {
                    c = classes.get((int) (Math.random()*classes.size()));
                }
                studentClasses.add(new StudentClasses(student.getStudentID(),c.getClassID()));

            }
        }
        int[] i = new int[classes.size()];
        int[] j = new int[studentClasses.size()];
        for (StudentClasses s : studentClasses) {
            //System.out.println(s);
            i[s.getClassID()-1]++;
            j[s.getStudentID()-1]++;
        }

        return studentClasses;
        // System.out.println(Arrays.toString(i));
        // System.out.println(Arrays.toString(j));

        /*
        System.out.print("INSERT INTO StudentClasses (StudentID,ClassID) VALUES ");
        for (int n = 0; n < studentClasses.size(); n++) {
            StudentClasses s = studentClasses.get(n);
            System.out.print("(" + s.getStudentID() + "," + s.getClassID() + ")");
            if (n < studentClasses.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(";");
         */
    }
}
