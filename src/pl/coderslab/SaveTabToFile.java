package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static pl.coderslab.TaskManager.tasks;


public class SaveTabToFile {
    public static void saveTabtoFiles(String fileCsv, String[][] tab){
        Path dir = Paths.get(fileCsv);
        String[] lines = new String[tasks.length];
        for (int i = 0; i < tab.length; i++){
        lines[i] = String.join(",", tab[i]);
    }
        try {
            Files.write(dir, Arrays.asList(lines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

