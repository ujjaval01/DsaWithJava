package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKEle {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);
        q.add(40);q.add(50);

        int k = 2;

        System.out.println(reverseFirstK(q, k));
    }
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        int n = q.size();
        if(n<k) return q;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<k; i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        for(int j = 0; j<n-k; j++){
            q.add(q.remove());
        }

        return q;
    }
}
