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
                int data = reader.nextInt();
                for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
                    int ClassID = (int) (Math.random()*720) + 1;
                    int PeriodNum = (int) (Math.random()*10) + 1;
                    while (classes[ClassID - 1][PeriodNum - 1]) {
                        ClassID = (int) (Math.random()*720) + 1;
                        PeriodNum = (int) (Math.random()*10) + 1;
                    }
                    System.out.println(new ClassA(data,PeriodNum,ClassID));
                    count++;
                    classes[ClassID - 1][PeriodNum - 1] = true;
                }

            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
