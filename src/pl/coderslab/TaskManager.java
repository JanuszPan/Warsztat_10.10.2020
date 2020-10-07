package pl.coderslab;

import java.util.Arrays;

import static pl.coderslab.PleaseSelectAnOption.pleaseSelectAnOption;

public class TaskManager {
    public static final String fileSCV = "tasks.csv";
    public static final String[] options = {"add", "remove", "list", "exit"};
    public static String[][] tasks;

    public static void main(String[] args) {
        pleaseSelectAnOption(options);//metoda wyświetlająca dostępne w programie opcje

    }


}
