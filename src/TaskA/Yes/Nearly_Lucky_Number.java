package TaskA.Yes;

import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String str = Integer.toString(n);
        String str = scanner.next();
        int count = 0;
        for (int i = 0; i < str.length(); i = i + 1) {
            if (str.charAt(i) == '4'|| str.charAt(i) == '7'){
                count = count+1;
            }
        }
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
