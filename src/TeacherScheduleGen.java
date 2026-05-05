import java.util.ArrayList;

public class TeacherScheduleGen {
    public static void main(String[] args) {
        Class.generateClasses();
        ArrayList<Integer> usedTeachers = new ArrayList<>();
        for (int j = 1; j <= 10; j++) {
            for (int i = 0; i < Class.getClassesList().size(); i++) {
                if (Class.getClassesList().get(i).getPeriod() == j) {
                    int randomTeacher = (int) (Math.random() * 322) + 1;
                    while (usedTeachers.contains(randomTeacher)) {
                        randomTeacher = (int) (Math.random() * 322) + 1;
                    }
                    usedTeachers.add(randomTeacher);
                    System.out.print(new TeacherClasses(randomTeacher, i));
                    System.out.println("Period: " + j);
                }
            }
            usedTeachers.clear();
        }
    }
}
