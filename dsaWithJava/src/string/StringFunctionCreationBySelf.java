package string;

public class StringFunctionCreationBySelf {
    public static void main(String[] args) {
        String a = "Ujjcval";
        String b = "Ujjaval";
        System.out.println(compairTo(a,b));
    }


    public static String modify(String s) {
        int a = (int)s.charAt(0);
        if(a >= 97) return s.toLowerCase();
        return s.toUpperCase();
    }

    public static int compairTo(String a, String b){
        int n = Math.min(a.length(), b.length());
        for(int i = 0; i<n; i++){
            if(a.charAt(i) != b.charAt(i)){
              return (int)(a.charAt(i)) - (int)(b.charAt(i));
            }
        }
        return a.length() - b.length();
    }
}
