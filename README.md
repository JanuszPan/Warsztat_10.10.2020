# Warsztat_10.10.2020
Wstęp do warsztatu Tasks

Jak już wiesz, celem dzisiejszego warsztatu jest wytworzenie programu konsolowego do zarządzania zadaniami: Tasks.

Dane do zasilenia naszego programu będziemy przechowywać w pliku tekstowym w formacie CSV.

Będą one w następującym formacie:

Simple task - very important, 2020-03-09, true

Second task not so important, 2020-05-10, false

Throw away trash, 2020-03-09, false
Aplikacja musi posiadać możliwość wpisywania komend i wykonywania odpowiednich operacji w zależności od komendy, która została wpisana.

Aplikacja musi posiadać następujące funkcje:

    wyświetlanie wszystkich dostępnych zadań,
    wyjście z aplikacji,
    dodanie zadania,
    usuwanie zadania,
    wczytywanie danych z pliku przy starcie aplikacji,
    zapis danych do pliku,
    sprawdzanie poprawność wartości liczbowej podczas usuwania.

Czego nauczysz się podczas tego warsztatu?

Warsztat w formie wykonania jednego dużego zadania jakim jest przygotowanie jednego większego programu na pewno daje duży zastrzyk praktycznej wiedzy i pozwala na szybsze i bardziej pewne poruszanie się w kodzie Javy, czy programie IntelliJ.

W projekcie tym użyto praktycznie wszystkie rzeczy o których mówiliśmy podczas tego modułu takie jak:

    metody,
    wczytywanie danych
    tablice wielowymiarowe,
    czytanie plików,
    zapis danych do plików,
    import oraz wykorzystanie zewnętrznych bibliotek.

Wszystko to będzie możliwe do zastosowania w tym projekcie! To na pewno ugruntuje Twoją wiedzę.
Metody projektu Tasks
Metoda wyświetlająca opcje dostępne w programie

Pierwsza metoda ma wyświetlać dostępne w programie opcje do wykonania.

Dla nagłówka Please select an option: wybieramy kolor ConsoleColors.BLUE.

Opcje które mają być dostępne to:

    add
    remove
    list
    exit

Dla uproszczenia możemy je umieścić w tablicy typu String. Wywołaj metodę w metodzie main programu.
Metoda pobierająca dane z pliku

W metodzie main jako pierwszą wywołaj metodę, która z załączonego pliku tasks.csv wczyta dane do tablicy

static String[][] tasks;

Musisz skorzystać z odpowiedniej pętli do przetwarzania wierszy. Za pomocą metody split klasy String, możesz podzielić wiersz na poszczególne jego elementy.

Rozmiar tablicy musisz określić na podstawie ilości wierszy w pliku
Pobieranie wybranej akcji

Za pomocą klasy Scanner pobierz od użytkownika, jaka opcja programu ma zostać wywołana. W zależności od wybranej opcji wywołasz konkretną metodę. Możesz wykorzystać poniższy snippet:

switch (input) {

    case "add":

        addTask();

        break;

// other options

    default:

        System.out.println("Please select a correct option.");

}


Dodawanie zadania

Po wybraniu opcji add użytkownik zostanie odpytany o szczegóły zadania.

Następnie zadanie ma zostać dodane do tablicy tasks. Zwróć uwagę że konieczne będzie każdorazowe zwiększanie rozmiaru tablicy, możesz w tym celu skorzystać z metody:

Arrays.copyOf(tasks, tasks.length + 1);

Listowanie zadań

Po wybraniu opcji list wyświetl wszystkie zadania aktualnie znajdujące się w tablicy tasks.

Usuwanie zadania

Po wybraniu opcji remove odpytaj użytkownika o numer w tablicy, który należy usunąć.

Następnie usuń wskazany element z tablicy.

Możesz w tym celu wykorzystać metodę remove klasy ArrayUtils z załączonej biblioteki.
Usuwanie zadania — walidacja

Sprawdzaj poprawność wprowadzonej informacji:

    czy jest to wartość liczbowa
    czy jest większa równa 0

Sprawdzanie czy wartość nie jest większa niż rozmiar tablicy możesz przeprowadzić łapiąc odpowiedni wyjątek.

Jeżeli wartość nie jest poprawna, wyświetl komunikat i pobierz dane ponownie.
Zakończenie programu

Po wybraniu opcji exit dane z tablicy mają zostać zapisane do pliku tasks.csv zastępując całą dotychczasową zawartość znajdującą się w pliku. Zakończ działanie programu. Wyświetl komunikat w kolorze czerwonym.

Ogólne wskazówki

Przykład wykorzystania kolorów z klasy ConsoleColors:

public class SampleConsoleColors {


    public static void main(String[] args) {

        System.out.println(ConsoleColors.GREEN_BOLD + " green bold ");

        System.out.println(ConsoleColors.RED + " red ");

        System.out.println(ConsoleColors.BLUE + " blue ");

        System.out.println(ConsoleColors.RESET + " back to default");

    }

}

Usuwanie elementu tablicy za pomocą klasy ArrayUtils

Przykład wykorzystania metody:

public class ArrayUtilsSample {


    public static void main(String[] args) {

        String[] firstNames = {"Abigail", "Alexandra", "Alison", "Amanda"}; // tworzymy tablicę

        System.out.println(Arrays.toString(firstNames)); // wyświetlamy testowo jej elementy

        firstNames = ArrayUtils.remove(firstNames, 0); // 

        System.out.println(Arrays.toString(firstNames));

    }

}


Należy zwrócić uwagę że metoda remove klasy ArrayUtils zwraca nową tablicę, musimy więc przypisać jej wynik do zmiennej firstNames;
Sprawdzanie czy napis da się poprawnie przekształcić do wartości numerycznej

Klasa NumberUtils zawiera metodę isParsable, która zwraca true jeżeli wartość da się przekształcić na liczbę.

import org.apache.commons.lang3.math.NumberUtils;


public class NumberUtilsSample {


    public static void main(String[] args) {

        String[] numbers = {"1", "one"};

        System.out.println(NumberUtils.isParsable(numbers[0]));

        System.out.println(NumberUtils.isParsable(numbers[1]));

    }

}


##Zwiększanie rozmiaru tablicy i dodawanie nowej wartości

Przykład jak za pomocą metody copyOf klasy Arrays skopiować tablicę i dodać do niej nowy element.

import java.util.Arrays;


public class ArraysCopySample {


    public static void main(String[] args) {

        String[] firstNames = {"Abigail", "Alexandra", "Alison", "Amanda"};

        System.out.println(firstNames.length);

        System.out.println(Arrays.toString(firstNames));

        firstNames = Arrays.copyOf(firstNames, firstNames.length + 1);

        firstNames[firstNames.length - 1] = "Amelia";

        System.out.println(firstNames.length);

        System.out.println(Arrays.toString(firstNames));

    }

}

Sprawdzanie czy napis da się poprawnie przekształcić do wartości numerycznej

Klasa NumberUtils zawiera metodę isParsable, która zwraca true jeżeli wartość da się przekształcić na liczbę.

import org.apache.commons.lang3.math.NumberUtils;


public class NumberUtilsSample {


    public static void main(String[] args) {

        String[] numbers = {"1", "one"};

        System.out.println(NumberUtils.isParsable(numbers[0]));

        System.out.println(NumberUtils.isParsable(numbers[1]));

    }

}


Warto również zapoznać się z artykułem na stronie: https://www.baeldung.com/java-check-string-number zawiera on opis i porównanie najpopularniejszych sposobów na wykonanie tego zadania. Dostępne jest także porównanie czasu trwania dla różnych wariantów.

Trzymaj się zasady „od ogółu do szczegółu” – zacznij od najbardziej ogólnej struktury, czyli wyświetlania dostępnych opcji następnie wyszczególniaj metody i dodawaj kolejne możliwości.

Pamiętaj o pracowaniu na swoim własnym repozytorium, a nie lokalnym projekcie. Po zakończeniu jednej części np. pobierania z pliku, zrób commit do swojego repozytorium.
Jak zacząć pracę z tym projektem?
Repozytorium

Na początek stwórz nowe repozytorium! Szczegółowy opis tego jak to zrobić, znajduje się w temacie Przygotowanie repozytorium na GitHub. Po wykonaniu czynności tam opisanych, wróć do tego artykułu.

Utwórz projekt java a w nim pakiet pl.coderslab. W pakiecie utwórz klasę TaskManager w niej umieścimy cały kod naszego programu.
Zasoby

Do tego tematu, została przygotowana paczka z wszystkimi zasobami potrzebnymi do stworzenia projektu Tasks:

    dodatkowa klasa zawierająca zdefiniowane kolory ConsoleColors,
    biblioteka Apache Commons Lang,
    plik .gitignore

Rozpoczynając pracę nad projektem wykonaj następujące kroki:

    Pobierz plik "Zasoby do projektu.zip".
    Następnie rozpakuj archiwum używając dowolnego narzędzia.
    Skopiuj do projektu klasę ConsoleColors.
    Załącz do projektu bibliotekę Apache Commons Lang

Twoje repozytorium powinno zawierać teraz tylko folder src ze wszystkimi plikami projektu.
Testuj na bieżąco

Dodając każdą z nowych funkcjonalności testuj działanie programu. Nie staraj się zrobić całego warsztatu od razu. Jeżeli masz z czymś problem używaj debugera aby krok pop kroku śledzić działanie programu.
Metody

Rozpocznij pracę od dodania metody main w klasie TaskManager.

Początkowo całość kodu możesz zawrzeć w tej metodzie a dopiero później sukcesywnie wydzielać go do oddzielnych metod. W pierwszym kroku dodaj wczytywanie i wyświetlanie danych z pliku.

Następnie możesz oprogramować pozostałe metody ich kolejność może być dowolna.
Powodzenia!