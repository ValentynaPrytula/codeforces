package TaskA.Yes;

import java.util.Scanner;

public class Bit_PlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int problemSolve = 0;
//        while (n-- > 0) {
            for (int i = 1; i <=n; i++){
            String st = sc.next();
            if (st.equals("++X") || st.equals("X++")) {
                problemSolve = problemSolve + 1;
            } else {
                problemSolve = problemSolve - 1;
            }
        }
        System.out.println(problemSolve);
    }
}
