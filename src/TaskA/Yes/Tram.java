package TaskA.Yes;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            c = b - a + c;
            if (max < c) {
                max = c;
            }
        }
        System.out.println(max);
    }
}
