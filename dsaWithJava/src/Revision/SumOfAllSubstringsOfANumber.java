package Revision;

public class SumOfAllSubstringsOfANumber {
    public static void main(String[] args) {
        String s = "6759";
        System.out.println(sumSubstrings(s));
    }
    public static int sumSubstrings(String s) {
        // code here
        int sum  = 0;
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){

                sum = sum + Integer.parseInt(s.substring(i, j));
            }
        }
        return sum;
    }
}
