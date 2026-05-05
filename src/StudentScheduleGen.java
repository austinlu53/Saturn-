import java.util.ArrayList;
import java.util.Arrays;

public class StudentScheduleGen {
    public static void main(String[] args) {
        ArrayList<ClassA> classes = ClassA.getClassesList();
        for (ClassA c : classes) System.out.println(c);
        ArrayList<Student> students = Student.generateStudents();
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
        int[] j = new int[students.size()];
        for (StudentClasses s : studentClasses) {
            //System.out.println(s);
            i[s.getClassID()-1]++;
            j[s.getStudentID()-1]++;
        }
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));
    }
}
