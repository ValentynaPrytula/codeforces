package TaskA.Yes;

public class reverse_string {
    public static void main(String[] args) {
        String str = "Amo";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        System.out.println(result);}
}
