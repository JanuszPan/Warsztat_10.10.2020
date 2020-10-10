package pl.coderslab;

public class PrintTab {
//    wyświetlanie listy zadań znajdującej się w zmiennej tasks
    public static void printTab(String[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + " : ");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
