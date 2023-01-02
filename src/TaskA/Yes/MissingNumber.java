package TaskA.Yes;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long summ = ((n+1)*n)/2;
        for (int i=0; i<n-1; i++){
            long k = sc.nextLong();
            summ = summ - k;
        }
        System.out.println(summ);
    }
}
