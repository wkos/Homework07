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

    public int getAmountOfNumbers() {
        return numbers.length;
    }

    public void readAmountOfNumbers() {
        System.out.print("Na ilu liczbach wykonywać operacje? - ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        numbers = new double[size];
    }

    public String getCorrectFormOfNounWithNumeral(int number, String word) {
        if (number == 1)
            return word + "ę";
        else if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4)
            return word + "y";
        else
            return word;
    }

    public void readNumbers() {
        int len = numbers.length;
        System.out.print("Podaj " + len + " " + getCorrectFormOfNounWithNumeral(len, "liczb") + "\n");
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
