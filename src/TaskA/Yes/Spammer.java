package TaskA.Yes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Spammer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String teamName = sc.next();
            if (result.containsKey(teamName)) {
                int newKey = result.get(teamName) + 1;
                result.put(teamName, newKey);
            } else {
                result.put(teamName, 1);
            }
        }


//        Set<String> keySet = result.keySet();
//        Iterable<String> iterable = keySet;
//        Iterator<String> iterator = iterable.iterator();
//        for(String nickname = iterator.next(); iterator.hasNext(); ){
//            int cnt = result.get(nickname);
//            if (cnt > 1) {
//                System.out.println(nickname);
//            }
//        }


        for (String nickname : result.keySet()) {
            int cnt = result.get(nickname);
            if (cnt > 1) {
                System.out.println(nickname);
            }
        }
    }
}
