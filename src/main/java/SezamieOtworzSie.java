import java.util.Scanner;

public class SezamieOtworzSie {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Aby sezam sie otworzyl, podaj swoje imie.");

        String imie = skaner.nextLine();

        if (imie.equals("Justyna")) {

            System.out.println("Witaj na jedynym slusznym i elitarnym czacie Valoru.");
        } else if (imie.equals("Mateusz")) {
            System.out.println("Typowy Mati - brak dostepu. ");
        } else
            System.out.println("WYNOCHA Z MOJEJ DZUNGLI ! ");

    }
}






