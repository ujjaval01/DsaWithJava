package Revision;

public class ChangeTheString {
    public static void main(String[] args) {
        String s = "Abcd";

        // modifying the string(Like spelling correction)
        String a = "ujjaval";
        a = a.substring(0, 4) + 'b' + a.substring(5,7);
        System.out.println(a);

//        System.out.println(modify(s));
    }
    public static String modify(String s) {
        int a = (int)s.charAt(0);
        if(a >= 97) return s.toLowerCase();
        return s.toUpperCase();
    }
}
