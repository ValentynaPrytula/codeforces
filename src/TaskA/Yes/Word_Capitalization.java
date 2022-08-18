package TaskA.Yes;

import java.util.Locale;
import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(string.substring(0,1).toUpperCase() + string.substring(1));
    }
}
