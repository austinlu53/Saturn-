import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Class;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;

public class StudentClassesGenerator {
    public static void main(String[] args) {
        ArrayList<String> Period1 = new ArrayList<>();
        ArrayList<String> Period2 = new ArrayList<>();
        ArrayList<String> Period3 = new ArrayList<>();
        ArrayList<String> Period4 = new ArrayList<>();
        ArrayList<String> Period5 = new ArrayList<>();
        ArrayList<String> Period6 = new ArrayList<>();
        ArrayList<String> Period7 = new ArrayList<>();
        ArrayList<String> Period8 = new ArrayList<>();
        ArrayList<String> Period9 = new ArrayList<>();
        ArrayList<String> Period10 = new ArrayList<>();
        ArrayList<ArrayList> Periods = new ArrayList<>();
        Periods.add(Period1);
        Periods.add(Period2);
        Periods.add(Period3);
        Periods.add(Period4);
        Periods.add(Period5);
        Periods.add(Period6);
        Periods.add(Period7);
        Periods.add(Period8);
        Periods.add(Period9);
        Periods.add(Period10);

        String classID = "";
        String period = "";

        try {
            File myFile = new File("src/class.txt");
            Scanner scan = new Scanner(myFile);
            ArrayList<String> classes = new ArrayList<>();

            while (scan.hasNextLine()){
                String nextLine = scan.nextLine();
                String[] split = nextLine.split(",");
                classID = split[0];
                period = split[2];
                if(period.equals("1")){
                    Period1.add(split[0]);
                }
                else if(period.equals("2")){
                    Period2.add(split[0]);
                }
                else if(period.equals("3")){
                    Period3.add(split[0]);
                }
                else if(period.equals("4")){
                    Period4.add(split[0]);
                }
                else if(period.equals("5")){
                    Period5.add(split[0]);
                }
                else if(period.equals("6")){
                    Period6.add(split[0]);
                }
                else if(period.equals("7")){
                    Period7.add(split[0]);
                }
                else if(period.equals("8")){
                    Period8.add(split[0]);
                }
                else if(period.equals("9")){
                    Period9.add(split[0]);
                }
                else{
                    Period10.add(split[0]);
                }

            }



        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }

        for(int i =1;i<=5000;i++){
          for(int k = 0;k<10;k++){
              int randomNum = (int) (Math.random()*(Periods.get(k).size()));
               int randomClassID = Integer.parseInt(Periods.get(k).get(randomNum).toString());
               StudentClasses schedule = new StudentClasses(i,randomClassID);
              System.out.println(schedule);
            }
        }

    }
}
