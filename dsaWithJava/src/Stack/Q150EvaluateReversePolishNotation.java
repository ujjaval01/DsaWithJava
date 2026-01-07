package Stack;

import java.util.Stack;

public class Q150EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] t = {"4","13","5","/","+"};
        System.out.println(evalRPN(t));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {

            if (s.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);

            } else if (s.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);

            } else if (s.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);

            } else if (s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);

            } else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}
