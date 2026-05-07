package Revision;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aaabbcdd";

        int i = 0, j = 1;
        while(j<s.length()-1){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j++;
            } else if (s.charAt(j) != s.charAt(j+1)) {
                System.out.println(s.charAt(j));

            }
        }
    }
}
