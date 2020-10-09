package pl.coderslab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddTask {
    public static void addTask(){
        System.out.println("Please add task description");
        Scanner scan = new Scanner(System.in);
        String nextLine = scan.nextLine();
        System.out.println("Please add task due date: yyyy-mm-dd");
        try{
            int number = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Wrong date format");
        }
        System.out.println("Is your task is important: true/false");
        try {
            boolean trueFalse = scan.nextBoolean();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong answer. Please write: true or false");
        }
    }
}
