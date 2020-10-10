package pl.coderslab;

import java.util.Arrays;
import java.util.Scanner;

public class AddTask {


    public static void addTask(String[][] tasks){
        Scanner scan =new Scanner(System.in);
        System.out.println("Please add task description");
        String description=scan.nextLine();
        System.out.println("Please add task due date: yyyy-mm-dd");
        String dueDate=scan.nextLine();
        System.out.println("Is your task important: true/false");
        String isImportant=scan.nextLine();
        tasks = Arrays.copyOf(tasks, tasks.length+1);
        tasks[tasks.length-1]=new String[3];
        tasks[tasks.length-1][0]=description;
        tasks[tasks.length-1][1]=dueDate;
        tasks[tasks.length-1][2]=isImportant;
    }
}
