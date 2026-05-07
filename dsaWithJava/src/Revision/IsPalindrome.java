package Revision;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "Madam";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
/*  best approach...
public class IsPalindrome {
    public static void main(String[] args) {
        String s = "Madam";
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

 */
