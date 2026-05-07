import java.util.ArrayList;

public class fullGen {
    public static void main(String[] args) {
        ArrayList<TeacherClasses> teacherSchedule = TeacherScheduleGen.generateSchedules();
        System.out.println(" ");
        ArrayList<StudentClasses> studentSchedule = StudentClassesGenerator.generateSchedules();


    }
}
