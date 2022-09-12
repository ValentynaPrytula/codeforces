package TaskA.Yes;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ber = sc.next();
        String bir = sc.next();
        StringBuilder n = new StringBuilder(bir);
        if (ber.equals(n.reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
