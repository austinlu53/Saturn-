import java.util.ArrayList;

public class fullGen {
    public static void main(String[] args) {
        ArrayList<TeacherClasses> teacherSchedule = TeacherScheduleGen.generateSchedules();
        for (int i = 0; i < teacherSchedule.size(); i++) {
            System.out.println(teacherSchedule.get(i).getClassID());
        }
    }
}
