package LeetCodeQuestions;

import java.util.Stack;

public class InterviewBitReverseString {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reverseString(s));

    }
    public static String reverseString(String s) {
        Stack<Character> ch = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            ch.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while(!ch.isEmpty()){
            sb.append(ch.pop());
        }

        return sb.toString();
    }
}
