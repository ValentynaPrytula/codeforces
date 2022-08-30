package TaskA.Yes;

import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String q = sc.next();
        char[] queue = q.toCharArray();

        for (int k = 1; k <= t; k++) {
            for (int i = 1; i <= n - 1; i++) {
                if (queue[i - 1] == 'B' && queue[i] == 'G') {
                    Character temp = queue[i - 1];
                    queue[i - 1] = queue[i];
                    queue[i] = temp;
                    i++;
                }
            }
        }
        System.out.println(String.valueOf(queue));

    }
}
