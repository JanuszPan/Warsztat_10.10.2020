package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//metoda wczytuje dane z pliku tasks.csv i wczytuje do do tablicy tasks
public class LoadDataToTable {
    public static String[][] loadDataToTable(String task) {
        //sprawdzenie czy istnieje plik
        Path dir = Paths.get(task);
        if (!Files.exists(dir)) System.out.println("File not exists.");
        String[][] tab = null;

        try {
            List<String> strings = Files.readAllLines(dir);//wczytywanie zawartość całego pliku dp listy typu String
            //strings.size() - to ilość wczytanych wierszy, strings.get(0).split(",").length - drugi wymiar: ilość elementów pojedynczego wiersza
            tab = new String[strings.size()][strings.get(0).split(",").length];
            for (int i = 0; i < strings.size(); i++) {
                String[] split = strings.get(i).split(",");
                for (int j = 0; j < split.length; j++) {
                    tab[i][j] = split[j];
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return tab;
    }
}
