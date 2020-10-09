package pl.coderslab;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class LoadDataToTable {
    public static String [][] loadDataToTable (String task){
        String [][] file1 = new String[0][];
        File file = new File("tasks.csv");
        try {
            Scanner scan = new Scanner(file);
            while ((scan.hasNextLine())){
                scan.hasNextLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }
        return file1;
//        System.out.println();
    }

}
