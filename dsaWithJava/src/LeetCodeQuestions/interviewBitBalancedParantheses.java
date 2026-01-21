package LeetCodeQuestions;

import java.util.Stack;

public class interviewBitBalancedParantheses {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(solve(s));
    }

    public static int solve(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push('(');
            }else{
                if(st.isEmpty()){
                    return 0;
                }
                st.pop();

            }
        }
        return st.isEmpty() ? 1 : 0;
    }
}

