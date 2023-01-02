package TaskA.Yes;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class test_task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, String> users = new HashMap<String, String>();
        HashMap<String, String> activeUsers = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            String request = sc.next();
            if (Objects.equals(request, "register")) {
                String username = sc.next();
                String password = sc.next();
                // Check is key exists in the Map
                if (users.containsKey(username)) {
                    System.out.println("fail: user already exists");
                } else {
                    users.put(username, password);
                    System.out.println("success: new user added");
                }
            } else if (Objects.equals(request, "login")) {
                String username = sc.next();
                String password = sc.next();
                if (!users.containsKey(username)) {
                    System.out.println("fail: no such user");
                } else if (!Objects.equals(users.get(username), password)) {
                    System.out.println("fail: incorrect password");
                } else if (activeUsers.containsKey(username)) {
                    System.out.println("fail: already logged in");

                } else {
                    activeUsers.put(username, password);
                    System.out.println("success: user logged in");
                }
            } else if (Objects.equals(request,  "logout")) {
                String username = sc.next();
                if (!users.containsKey(username)) {
                    System.out.println("fail: no such user");
                } else if (!activeUsers.containsKey(username)) {
                    System.out.println("fail: already logged out");
                } else {
                    System.out.println("success: user logged out");
                    activeUsers.remove(username);
                }
            }
        }
    }
}