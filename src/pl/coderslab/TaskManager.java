package pl.coderslab;

import java.util.Scanner;

import static pl.coderslab.AddTask.addTask;
import static pl.coderslab.GetOption.getOption;
import static pl.coderslab.LoadDataToTable.loadDataToTable;
import static pl.coderslab.PleaseSelectAnOption.pleaseSelectAnOption;
import static pl.coderslab.PrintTab.printTab;
import static pl.coderslab.RemoveTask.removeTask;

public class TaskManager {
    public static final String fileCsv = "tasks.csv";
    public static final String[] options = {"add", "remove", "list", "exit"};
    public static String[][] tasks;
    public static int index;

    public static void main(String[] args) {
        tasks = loadDataToTable("/home/janusz/Pulpit/Warsztat_10.10.2020/tasks.csv");//metoda wczytuje dane z pliku tasks.csv i wczytuje go do tablicy tasks
        pleaseSelectAnOption(options);//metoda wyświetlająca dostępne w programie opcje
//        getOption();// wpisanie zadania przez użytkownika add, remove, list albo exit
//        addTask();//dodanie przez użytkownika zadanie i dopisanie do tabeli tasks
//        printTab(tasks);//wyświetla zadania znajdujące się w tablicy tasks
//        removeTask(tasks, 2);//usuwa wybrane zadanie
        Scanner scan = new Scanner(System.in);
        String function = scan.nextLine();
        while (true){
            getOption(function);
            pleaseSelectAnOption(options);
            function= scan.nextLine();
        }
    }
}
