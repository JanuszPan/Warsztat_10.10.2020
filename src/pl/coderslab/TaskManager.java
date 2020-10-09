package pl.coderslab;

import static pl.coderslab.GetOption.getOption;
import static pl.coderslab.PleaseSelectAnOption.pleaseSelectAnOption;
import static pl.coderslab.LoadDataToTable.loadDataToTable;

public class TaskManager {
    public static final String fileCsv = "tasks.csv";
    public static final String[] options = {"add", "remove", "list", "exit"};
    public static String[][] tasks;

    public static void main(String[] args) {
        pleaseSelectAnOption(options);//metoda wyświetlająca dostępne w programie opcje
        getOption();// wpisanie zadania przez użytkownika add, remove, list albo exit
        loadDataToTable(fileCsv);
    }

}
