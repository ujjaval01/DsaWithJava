package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveAtAnyPosition {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int pos = 3;

        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);
        q.add(40);q.add(50);

        System.out.println(q);

        System.out.println(addEle(q, pos));

    }

    public static Queue<Integer> addEle(Queue<Integer> q, int pos){
        int n = q.size();

        for(int i = 0; i<pos; i++){
//            System.out.println(q.peek());
            q.add(q.remove());
        }
        q.remove();
        for (int j = 0; j<n-pos-1; j++){
//            System.out.println(q.peek());
            q.add(q.remove());
        }

        return q;
    }
}

