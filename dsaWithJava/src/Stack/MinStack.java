package Stack;

import java.util.Stack;

class SpecialStack {
    // Define Stack
    Stack<Integer> st;
    Stack<Integer> minSt;

    public SpecialStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    public void push(int val) {
        // Add an element to the top of Stack
        st.push(val);
        if(minSt.size()==0 || val < minSt.peek()) minSt.push(val);
        else minSt.push(minSt.peek());
    }

    public void pop() {
        // Remove the top element from the Stack
        st.pop();
        minSt.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(!st.isEmpty()){
            return st.peek();
        }
        return -1;
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(!st.isEmpty()){
            return minSt.peek();
        }
        return -1;

    }
}

public class MinStack {
    public static void main(String[] args) {
        SpecialStack ss = new SpecialStack();
//        ss.push(10); ss.push(17); ss.push(21);
//        ss.push(14); ss.push(19); ss.push(9);

        System.out.println(ss.getMin());
        System.out.println(ss.isEmpty());
    }


}
