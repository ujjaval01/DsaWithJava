package string;

public class StringFunctionCreationBySelf {
    public static void main(String[] args) {
        String a = "Ujjcval";
        String b = "Ujjaval";
        System.out.println(compairTo(a,b));

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
