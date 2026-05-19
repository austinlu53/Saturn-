import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassGenerator {
    public static void main(String[] args) {
        ClassA.generateClasses();
        System.out.println(ClassA.getClassesList());
    }
}
