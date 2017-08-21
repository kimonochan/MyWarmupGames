import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main (String [] args) {

        Scanner skaner = new Scanner(System.in);

        Random r = new Random();

        System.out.println ("Witaj. Twoim zadaniem jest odgadniecie losowej liczby od 1 do 100. ");
        System.out.println ("Program podaje czy szukana liczba x jest wieksza czy mniejsza od podanej przez Ciebie, wiec czytaj uwaznie. ");
        System.out.println ("Podaj pierwsza liczbe:");

        int genNumber = r.nextInt (100)+1;

        int predictedNumber = skaner.nextInt();

        int counter = 1;

        while (genNumber != predictedNumber){

            if (predictedNumber>100 | predictedNumber<0) {
                System.out.println("Program zgaduje jedynie liczby z przedzialu od 1 do 100.");
            }
            else if (genNumber>predictedNumber) {
                System.out.println("Liczba x jest wieksza od podanej");
            }
            else if (genNumber<predictedNumber) {
                System.out.println("Liczba x jest mniejsza od podanej.");
            }

            System.out.println ("Podaj liczbę:");
            predictedNumber = skaner.nextInt();
            counter++;
        }

        System.out.println ("Udalo Ci sie odgadnac liczbe x w " + counter + " ruchach. Gratulacje.");












    }
}
