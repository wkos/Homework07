package pl.wkos.homework71;

public class NamesTest {
    public static void main(String[] args) {
        Names names = new Names(5);
        System.out.println("Podaj 5 imion");
        for (int i = 0; i < 5; i++) names.addNameFromConsole();
        System.out.println("----------");
        //System.out.println("Imiona w kolejności wczytywania:");
        //System.out.print(names.showNames());
        //System.out.println("----------");
        System.out.println("Imiona w odwrotnej kolejności:");
        System.out.print(names.showNamesBackwards());
    }
}
