package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RearrangeQueueUsingStack
{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5); q.add(6); q.add(7); q.add(8);
        System.out.println( rearrangeQueue(q));
    }
    public static Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        // code here
        int n = q.size();

        // first half elements (1 2 3 4) stack me daal diye
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n/2; i++)  st.push(q.remove());

        // add stack all elements in the queue  5 6 7 8 4 3 2 1
        while(!st.isEmpty())  q.add(st.pop());

        // again first helf elemets (5 6 7 8) statck me daal diye
        for(int i = 0; i<n/2; i++)  st.push(q.remove());

        // jab tk stack khali nhi ho jaata tab tk ek element stack ka aur ek element queue ka remove and add karte raho
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }

        // ab order shi krne k liye saare elements stack me daal do
        while(q.size()>0)  st.push(q.remove());

        // rearranged order k liye stack k saare elements queue me daal do
        while(st.size()>0)  q.add(st.pop());
        return q;
    }

}
