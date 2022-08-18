package TaskA.Yes;
import java.util.Scanner;

public class wayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String st = sc.next();
            int length = st.length();
            if (length > 10) {
                System.out.print(st.charAt(0));
                System.out.print(length - 2);
                System.out.print(st.charAt(length - 1));
                System.out.println();
            } else {
                System.out.println(st);
            }
        }
    }


}

