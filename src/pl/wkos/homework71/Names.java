package pl.wkos.homework71;

import java.util.Scanner;

public class Names {
    private String [] names;
    private int currentName;

    public Names(int size) {
        this.names = new String[size];
        this.currentName = 0;
    }

    public void addNameFromConsole() {
        if (currentName < names.length) {
            Scanner scanner = new Scanner(System.in);
            names[currentName++] = scanner.nextLine();
        } else {
            System.out.println("Brak miejsca w tablicy");
        }
    }

    public String showNames() {
        String buffer = "";
        for (String item : names) {
            buffer += "Cześć " + item + "\n";
        }
        return buffer;
    }

    public String showNamesBackwards() {
        String buffer = "";
        for (int i = 0; i < names.length; i++) {
            buffer += "Cześć " + names[names.length - i - 1] + "\n";
        }
        return buffer;
    }
}
