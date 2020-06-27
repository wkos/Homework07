package pl.wkos.homework72;

import java.util.Locale;
import java.util.Scanner;

public class DoubleNumbers {
    private double[] numbers;

    public DoubleNumbers() {
    }

    public double[] getNumbers() {
        return numbers;
    }

    public double getNumber(int i) {
        return numbers[i];
    }

    public int getNumberOfNumbers() {
        return numbers.length;
    }

    public void readNumberOfNumbers() {
        System.out.print("Na ilu liczbach wykonywać operacje? - ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        numbers = new double[size];
    }

    public void readNumbers() {
        int len = numbers.length;
        if (len == 1)
            System.out.println("Podaj " + len + " liczbę");
        else if (len % 10 == 2 || len % 10 == 3 || len % 10 == 4)
            System.out.println("Podaj " + len + " liczby");
        else
            System.out.println("Podaj " + len + " liczb");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
    }

    public double sumOfSquares() {
        double sum = 0.0;
        for (double item : numbers) {
            sum += item * item;
        }
        return sum;
    }
}
