import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    private int courseID;
    private int period;
    private int roomID;
    private int classID = 0;
    private static int classIDtrack = 0;
    private static ArrayList<Class> classesList;

    public Class(int courseID, int period, int roomID) {
        this.courseID = courseID;
        this.period = period;
        this.roomID = roomID;
        classIDtrack++;
        classID = classIDtrack;
    }

    @Override
    public String toString() {
        return "INSERT INTO Classes (CourseID,PeriodNumber,RoomID) VALUES (" + courseID + "," + period + "," + roomID + ");";
    }
    public static void generateClasses() {
        ArrayList<Class> classList = new ArrayList<>();
        boolean[][] classes = new boolean[720][10];
        int count = 0;
        try {
            File myFile = new File("src/CourseID");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                int data = reader.nextInt();
                for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
                    int ClassID = (int) (Math.random()*720) + 1;
                    int PeriodNum = (int) (Math.random()*10) + 1;
                    while (classes[ClassID - 1][PeriodNum - 1]) {
                        ClassID = (int) (Math.random()*720) + 1;
                        PeriodNum = (int) (Math.random()*10) + 1;
                    }
                    classList.add(new Class(data,PeriodNum,ClassID));
                    count++;
                    classes[ClassID - 1][PeriodNum - 1] = true;
                }

            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        classesList = classList;
    }

    public int getClassID() {
        return classID;
    }

    public static ArrayList<Class> getClassesList() {
        return classesList;
    }
}
