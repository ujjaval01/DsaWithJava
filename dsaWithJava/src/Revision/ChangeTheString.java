package Revision;

public class ChangeTheString {
    public static void main(String[] args) {
        String s = "Abcd";
        System.out.println(modify(s));
    }
    public static String modify(String s) {
        int a = (int)s.charAt(0);
        if(a >= 97) return s.toLowerCase();
        return s.toUpperCase();
    }
}
