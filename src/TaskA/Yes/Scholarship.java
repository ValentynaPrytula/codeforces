package TaskA.Yes;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double totalMark = 0;
        boolean threeExist = false;
        for ( int i=0 ; i<n; i++ ){
            int m = sc.nextInt();
            totalMark = totalMark + m;
//            if (m==3){
//                threeExist = true;
//            }
            if (m == 3.0) {
                System.out.println("None");
                return;
            }
        }
        double averageMark = totalMark/n;
//        if (averageMark==3){
//            System.out.println("None");
//        }
//        else if (averageMark > 3 && averageMark < 4.5 && !threeExist){
//            System.out.println("Common");
//        }
//        else if (averageMark>=4.5 && averageMark<5  && !threeExist){
//            System.out.println("High");
//        }
//        else if (averageMark==5){
//            System.out.println("Named");
//        }
        if (averageMark == 5.0) {
            System.out.println("Named");
        } else if (averageMark >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}
