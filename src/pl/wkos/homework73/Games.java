package pl.wkos.homework73;

import java.util.Scanner;

public class Games {
    public void guessingGame1() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Podaj liczbę: ");
            int number = scanner.nextInt();
            if (number < 100) System.out.println("Liczba jest za mała");
            else if (number > 200) System.out.println("Liczba jest za duża");
            else if (number % 3 != 0) System.out.println("Liczba nie jest podzielna przez 3");
            else {
                System.out.println("Zagdłeś");
                return;
            }
        } while (true);
    }

    public void guessingGame2() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Podaj liczbę: ");
            number = scanner.nextInt();
            if (number < 100) System.out.println("Liczba jest za mała");
            else if (number > 200) System.out.println("Liczba jest za duża");
            else if (number % 3 != 0) System.out.println("Liczba nie jest podzielna przez 3");
        } while (number < 100 || number > 200 || number % 3 != 0);
        System.out.println("Zgadłeś");
    }
}
