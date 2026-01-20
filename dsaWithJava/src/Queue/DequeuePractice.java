package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeuePractice {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addLast(90);
        dq.addFirst(20);

        System.out.println(dq);
    }
}
