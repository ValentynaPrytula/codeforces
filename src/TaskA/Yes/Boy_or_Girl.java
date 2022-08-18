package TaskA.Yes;

import java.util.HashSet;
import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        HashSet<Character> uniques = new HashSet<>();

        for (int i=0; i<name.length(); i++){
            uniques.add(name.charAt(i));
        }

        if (uniques.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
