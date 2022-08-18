package TaskA.Yes;

import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m >= 1 && n <= 16) {
            int result = m * n / 2;
            System.out.println(result);
        }

    }
}