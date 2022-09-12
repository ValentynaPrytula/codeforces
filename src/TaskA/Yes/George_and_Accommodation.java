package TaskA.Yes;

import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int room = 0;
        for (int i=0; i<n; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (p+2 <=q){
                room = room+1;
            }
        }
        System.out.println(room);
    }
}
