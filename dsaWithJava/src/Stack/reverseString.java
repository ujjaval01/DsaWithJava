package Stack;

import java.util.Stack;

public class reverseString {
    public static String reverse(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int j = 0; j<s.length(); j++){
            char ch = s.charAt(j);
            st.push(ch);
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "ujjavalSaini";
        System.out.println(reverse(str));
    }
}
