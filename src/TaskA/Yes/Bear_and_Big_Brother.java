package TaskA.Yes;

import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int years = 0;
        while (b>=l){
            l = l*3;
            b = b*2;
            years = years+1;
        }
        System.out.println(years);
    }
}
