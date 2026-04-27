import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassGenerator {
    public static void main(String[] args) {
        boolean[][] classes = new boolean[720][10];
        int count = 0;
        try {
            File myFile = new File("src/CourseID");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
                    int ClassID = (int) (Math.random()*720) + 1;
                    int PeriodNum = (int) (Math.random()*10) + 1;
                    while (classes[ClassID - 1][PeriodNum - 1]) {
                        ClassID = (int) (Math.random()*720) + 1;
                        PeriodNum = (int) (Math.random()*10) + 1;
                    }
                    System.out.println("INSERT INTO Classes (CourseID,PeriodNumber,RoomID) VALUES (" + data + "," + PeriodNum + "," + ClassID + ");");
                    count++;
                    classes[ClassID - 1][PeriodNum - 1] = true;
                }

            }
            reader.close();
            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
