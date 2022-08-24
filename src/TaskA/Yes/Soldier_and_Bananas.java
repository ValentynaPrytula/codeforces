package TaskA.Yes;

import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int total = 0;
        for (int i = 0; i < w; i++) {
            int newPrice = k * (i + 1);
            total = total + newPrice;
        }

        int borrow = total - n;
        if (borrow <= 0) {
            System.out.println(0);
        } else {
            System.out.println(borrow);
        }
    }
}
