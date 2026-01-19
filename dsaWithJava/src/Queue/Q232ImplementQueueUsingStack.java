package Queue;

import java.util.Stack;

class MyQueuee {
    Stack<Integer> st;
    Stack<Integer> helper;

    public MyQueuee() {
        st =  new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int frontVal = st.pop();
        while(!helper.isEmpty()){
            st.push(helper.pop());
        }
        return frontVal;
    }

    public int peek() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int frontVal = st.peek();
        while(!helper.isEmpty()){
            st.push(helper.pop());
        }
        return frontVal;
    }

    public boolean empty() {
        return (st.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class Q232ImplementQueueUsingStack {
    public static void main(String[] args) {
        MyQueuee q = new MyQueuee();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        System.out.println(q.peek()); // 10
        System.out.println(q.pop());  // 10
        System.out.println(q.pop());  // 20
        System.out.println(q.peek()); // 30
        System.out.println(q.empty()); // false
        System.out.println(q.pop());  // 30
        System.out.println(q.pop());  // 40
        System.out.println(q.empty()); // true
    }
}

