package TaskA.Yes;

import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a <= h) {
                width = width + 1;
            } else {
                width = width + 2;
            }
        }
        System.out.println(width);
    }
}
