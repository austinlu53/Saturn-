public class TeacherScheduleGen {
    public static void main(String[] args) {
        Class.generateClasses();
        System.out.println(" line ");
        for (int i = 0; i < Class.getClassesList().size(); i++) {
            System.out.println(Class.getClassesList().get(i).getClassID());
        }
    }
}
