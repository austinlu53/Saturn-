import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseOffering {
    private static int classIDCounter = 0;
    private static boolean generated = false;
    private static ArrayList<CourseOffering> classes;
    private int courseID;
    private int period;
    private int roomID;
    private int classID;

    public CourseOffering(int courseID, int period, int roomID) {
        this.courseID = courseID;
        this.period = period;
        this.roomID = roomID;
        classIDCounter++;
        classID = classIDCounter;
    }

    @Override
    public String toString() {
        return "(" + courseID + "," + period + "," + roomID + ")";
    }
    public static void generateClasses() {
        if (!generated) {
            ArrayList<CourseOffering> classList = new ArrayList<>();
            boolean[][] classes = new boolean[720][10];
            try {
                File myFile = new File("src/CourseList.csv");
                Scanner reader = new Scanner(myFile);
                int data = 0;
                while (reader.hasNextLine()) {
                    data++;
                    for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
                        int ClassID = (int) (Math.random()*720) + 1;
                        int PeriodNum = (int) (Math.random()*10) + 1;
                        while (classes[ClassID - 1][PeriodNum - 1]) {
                            ClassID = (int) (Math.random()*720) + 1;
                            PeriodNum = (int) (Math.random()*10) + 1;
                        }
                        classList.add(new CourseOffering(data,PeriodNum,ClassID));
                        classes[ClassID - 1][PeriodNum - 1] = true;
                    }
                    reader.nextLine();
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
            CourseOffering.classes = classList;
            generated = true;
        }
    }
    public static void printClasses() {
        System.out.println("INSERT INTO Classes (CourseID,PeriodNumber,RoomID) VALUES ");
        for (int i = 0; i < classes.size()-1; i++) System.out.println(classes.get(i) + ", ");
        System.out.println(classes.getLast() + ";");
    }

    public static ArrayList<CourseOffering> getClasses() {
        return classes;
    }

    public int getClassID() {
        return classID;
    }

    public int getPeriod() {
        return period;
    }
}
