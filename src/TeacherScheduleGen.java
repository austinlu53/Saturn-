import java.util.ArrayList;

public class TeacherScheduleGen {
    public static ArrayList<TeacherClasses> generateSchedules() {
        ArrayList<TeacherClasses> output = new ArrayList<>();
        ClassA.generateClasses();
        ArrayList<Integer> usedTeachers = new ArrayList<>();
        for (int j = 1; j <= 10; j++) {
            for (int i = 0; i < ClassA.getClassesList().size(); i++) {
                if (ClassA.getClassesList().get(i).getPeriod() == j) {
                    int randomTeacher = (int) (Math.random() * 322) + 1;
                    while (usedTeachers.contains(randomTeacher)) {
                        randomTeacher = (int) (Math.random() * 322) + 1;
                    }
                    usedTeachers.add(randomTeacher);
                    TeacherClasses add = new TeacherClasses(randomTeacher, i);
                    System.out.println(add);
                    output.add(add);
                }
            }
            usedTeachers.clear();
        }
        return output;
    }
}
