package pl.coderslab;

public class PleaseSelectAnOption {
//    metoda wyświetlająca dostępne w programie opcje
    public static void pleaseSelectAnOption(String[] table) {
        System.out.println(ConsoleColors.BLUE);//dla nagłówka wybieramy kolor BLUE
        System.out.println("Please select an option:" + ConsoleColors.RESET);//usuwamy kolor
        for (String option : table) System.out.println(option);
    }
}
