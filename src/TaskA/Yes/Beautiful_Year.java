package TaskA.Yes;

import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; ; i++) {
            n += 1;
            int a = n / 1000;
            int b = n / 100 % 10;
            int c = n / 10 % 10;
            int d = n % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                break;
            }
        }
        System.out.println(n);
    }
}