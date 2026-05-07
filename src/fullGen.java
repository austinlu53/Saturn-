import java.util.ArrayList;

public class fullGen {
    public static void main(String[] args) {
        ArrayList<TeacherClasses> teacherSchedule = TeacherScheduleGen.generateSchedules();
        ArrayList<StudentClasses> studentSchedule = StudentClassesGenerator.generateSchedules();
    }
}
