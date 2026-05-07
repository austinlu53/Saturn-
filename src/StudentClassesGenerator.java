import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Class;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;

public class StudentClassesGenerator {
    public static ArrayList<StudentClasses> generateSchedules() {
        ArrayList<StudentClasses> output = new ArrayList<>();

        ArrayList<ArrayList> Periods = new ArrayList<>();
        ArrayList<Integer> Period1 = new ArrayList<>();
        ArrayList<Integer> Period2 = new ArrayList<>();
        ArrayList<Integer> Period3 = new ArrayList<>();
        ArrayList<Integer> Period4 = new ArrayList<>();
        ArrayList<Integer> Period5 = new ArrayList<>();
        ArrayList<Integer> Period6 = new ArrayList<>();
        ArrayList<Integer> Period7 = new ArrayList<>();
        ArrayList<Integer> Period8 = new ArrayList<>();
        ArrayList<Integer> Period9 = new ArrayList<>();
        ArrayList<Integer> Period10 = new ArrayList<>();
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
        ClassA.generateClasses();
        ArrayList<ClassA> classes = ClassA.getClassesList();
        for(int i =0; i<classes.toArray().length-1;i++){
            int classPeriod = classes.get(i).getPeriod();
            if(classPeriod==1){
                Periods.get(0).add(classes.get(i).getClassID());
            }
            if(classPeriod==2){
                Periods.get(1).add(classes.get(i).getClassID());
            }
            if(classPeriod==3){
                Periods.get(2).add(classes.get(i).getClassID());
            }
            if(classPeriod==4){
                Periods.get(3).add(classes.get(i).getClassID());
            }
            if(classPeriod==5){
                Periods.get(4).add(classes.get(i).getClassID());
            }
            if(classPeriod==6){
                Periods.get(5).add(classes.get(i).getClassID());
            }
            if(classPeriod==7){
                Periods.get(6).add(classes.get(i).getClassID());
            }
            if(classPeriod==8){
                Periods.get(7).add(classes.get(i).getClassID());
            }
            if(classPeriod==9){
                Periods.get(8).add(classes.get(i).getClassID());
            }
            if(classPeriod==10){
                Periods.get(9).add(classes.get(i).getClassID());
            }
        }
        System.out.println("Period1: " + Period1);
        System.out.println("Period2: " + Period2);
        System.out.println("Period3: " + Period3);
        System.out.println("Period4: " + Period4);
        System.out.println("Period5: " + Period5);
        System.out.println("Period6: " + Period6);
        System.out.println("Period7: " + Period7);
        System.out.println("Period8: " + Period8);
        System.out.println("Period9: " + Period9);
        System.out.println("Period10: " + Period10);
        for(int j = 1;j<=5000;j++){
            for(int k = 0;k<=9;k++){
                int randomIdx = (int) (Math.random()*(Periods.get(k).size()));
                int randomClassID = (int) Periods.get(k).get(randomIdx);
                StudentClasses Student = new StudentClasses(j,randomClassID);
                output.add(Student);
                System.out.println(Student);
            }
        }
        return output;
    }
}
