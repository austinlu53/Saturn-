import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Class;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;

public class StudentClassesGenerator {
    public static void main(String[] args) {
        ArrayList<ArrayList> periods = new ArrayList<>();
        for (int i = 0; i < 10; i++) periods.add(new ArrayList<String>());

        String classID = "";
        int period;

        try {
            File myFile = new File("src/class.txt");
            Scanner scan = new Scanner(myFile);
            ArrayList<String> classes = new ArrayList<>();

            while (scan.hasNextLine()){
                String nextLine = scan.nextLine();
                String[] split = nextLine.split(",");
                classID = split[0];
                period = Integer.parseInt(split[2]);
                ArrayList<String> a = periods.get(period-1);
                a.add(split[0]);
                System.out.println(a);
            }



        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }

        for(int i = 1;i <= 5000; i++){
            for(int k = 0;k<10;k++){
                int randomNum = (int) (Math.random()*(periods.get(k).size()));
                int randomClassID = Integer.parseInt(periods.get(k).get(randomNum).toString());
                StudentClasses schedule = new StudentClasses(i,randomClassID);
                System.out.println(schedule);
            }
        }

    }
}