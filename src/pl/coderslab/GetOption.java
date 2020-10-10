package pl.coderslab;

import java.util.Scanner;

import static pl.coderslab.PrintTab.printTab;
import static pl.coderslab.AddTask.addTask;
import static pl.coderslab.RemoveTask.removeTask;
import static pl.coderslab.TaskManager.fileCsv;
import static pl.coderslab.SaveTabToFile.saveTabtoFiles;
import static pl.coderslab.TaskManager.index;
import static pl.coderslab.TaskManager.tasks;

public class GetOption {

    public static void getOption() {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            switch (input) {
                case "list":
                    printTab(tasks);
                    break;
                case "add":
                    addTask();
                    break;
                case "remove":
                    removeTask(tasks, index);
                    break;
                case "exit":
                    saveTabtoFiles(fileCsv, tasks);
                    System.out.println(ConsoleColors.RED + "Bye, bye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a correct option (add, remove, list, exit)");
            }
        }
    }

}
