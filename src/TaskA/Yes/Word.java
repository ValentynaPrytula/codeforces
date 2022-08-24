package TaskA.Yes;

import java.util.Locale;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int small = 0;
        int capital = 0;
        for (int i=0; i<s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                capital = capital+1;
            }
            else {small = small+1;
            }
        }
        if (capital>small){
            System.out.println(s.toUpperCase());
        }
        else {
            System.out.println(s.toLowerCase());
        }
    }
}
