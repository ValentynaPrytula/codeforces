package TaskA.Yes;

import java.util.Scanner;

public class TeamProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int view = 0;
        int count = 0;
        int problemsCount = 0;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= 3; j++) {
                view = sc.nextInt();
                if (view == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                problemsCount++;
            }
        }
        System.out.println(problemsCount);
    }
}

