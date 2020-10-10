package pl.coderslab;

import static pl.coderslab.AddTask.addTask;
import static pl.coderslab.GetOption.getOption;
import static pl.coderslab.PleaseSelectAnOption.pleaseSelectAnOption;
import static pl.coderslab.LoadDataToTable.loadDataToTable;
import static pl.coderslab.PrintTab.printTab;
import static pl.coderslab.RemoveTask.removeTask;

public class TaskManager {
    public static final String fileCsv = "tasks.csv";
    public static final String[] options = {"add", "remove", "list", "exit"};
    public static String[][] tasks;
    public static int index;

    public static void main(String[] args) {
        loadDataToTable("/home/janusz/Pulpit/Warsztat_10.10.2020");//metoda wczytuje dane z pliku tasks.csv i wczytuje go do tablicy tasks
        pleaseSelectAnOption(options);//metoda wyświetlająca dostępne w programie opcje
        getOption();// wpisanie zadania przez użytkownika add, remove, list albo exit
        addTask();//dodanie przez użytkownika zadanie i dopisanie do tabeli tasks
        printTab(tasks);//wyświetla zadania znajdujące się w tablicy tasks
        removeTask(tasks, 2);//usuwa wybrane zadanie

    }


}
