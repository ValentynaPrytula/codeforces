package TaskA.Yes;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Bayan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String shopName = sc.nextLine();
            if (result.containsKey(shopName)) {
                int newKey = result.get(shopName) + 1;
                result.put(shopName, newKey);
            } else {
                result.put(shopName, 1);
            }
        }
//        System.out.println(result);



//        Set<String> keySet = result.keySet();
//        Iterable<String> iterable = keySet;
//        Iterator<String> iterator = iterable.iterator();
//        for(String nickname = iterator.next(); iterator.hasNext(); ){
//            int cnt = result.get(nickname);
//            if (cnt > 1) {
//                System.out.println(nickname);
//            }
//        }

        int resultNumber = 0;
        for (String shopName : result.keySet()) {
            int cnt = result.get(shopName);
            if (cnt > 1) {
            resultNumber = resultNumber + cnt - 1;
            }
        }
        System.out.println(resultNumber);
    }
}
