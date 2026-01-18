package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);
        q.add(40);q.add(50);

        System.out.println(reverseQueue(q));
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();

        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        return q;
    }
}
