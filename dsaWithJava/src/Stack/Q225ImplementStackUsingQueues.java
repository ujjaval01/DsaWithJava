package Stack;

import java.util.LinkedList;
import java.util.Queue;

class MyStackk {

    Queue<Integer> q;

    public MyStackk() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int n = q.size();
        for(int i = 1; i<=n-1; i++){
            q.add(q.remove());
        }
        return q.remove();
    }

    public int top() {
        int n = q.size();
        for(int i = 1; i<=n-1; i++){
            q.add(q.remove());
        }
        int p = q.peek();
        q.add(q.remove());
        return p;
    }

    public boolean empty() {
        return (q.size() == 0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class Q225ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStackk st = new MyStackk();
        st.push(10); st.push(20);
        st.push(30); st.push(40);

        System.out.println( st.pop());
    }
}
