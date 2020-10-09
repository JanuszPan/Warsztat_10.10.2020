package pl.coderslab;

import java.util.Scanner;

import static pl.coderslab.AddTask.addTask;

public class GetOption {
    public static void getOption() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        switch (input) {
            case "add":
                addTask();
                break;
            case "remove":
                break;
            case "list":
                break;
            case "exit":
                System.out.println(ConsoleColors.RED + "Bye, bye.");
                break;
            default:
                System.out.println("Please select a correct option (add, remove, list, exit)");
        }
    }
}
