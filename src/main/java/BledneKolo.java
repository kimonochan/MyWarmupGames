import java.util.Scanner;

public class BledneKolo {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Witaj w Blednym Kole. Podaj imie, a moze Ci sie poszczesci. ");
        String imie = skaner.nextLine();

        while (!imie.equals("Justyna")) {

            System.out.println("Witaj w Blednym Kole. Podaj imie, a moze Ci sie poszczesci. ");
            imie = skaner.nextLine();

        }
            System.out.println("Udalo Ci sie uciec.");
        }




    }

