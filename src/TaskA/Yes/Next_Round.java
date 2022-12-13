package TaskA.Yes;

import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
        int []a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for ( int i=0 ; i<n; i++ ){
            if (a[i]>0&&a[i] >= a[k-1]){
                result = result +1;
            }
        }
        System.out.println(result);
    }
}
