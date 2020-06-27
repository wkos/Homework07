package pl.wkos.homework72;

public class DoubleNumbersTest {
    public static void main(String[] args) {
        DoubleNumbers doubleNumbers = new DoubleNumbers();
        doubleNumbers.readNumberOfNumbers();
        doubleNumbers.readNumbers();
        int size = doubleNumbers.getNumberOfNumbers();
        double number;
        for (int i = 0; i < size - 1; i++) {
            number = doubleNumbers.getNumber(i);
            System.out.print(number + "*" + number + " + ");
        }
        number = doubleNumbers.getNumber(size - 1);
        System.out.println(number + "*" + number + " = " + doubleNumbers.sumOfSquares());
    }
}
