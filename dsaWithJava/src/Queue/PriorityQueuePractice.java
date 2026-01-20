package Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        // Min Priority queue (java byDefault priority queue, Smallest first remove)
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        minPq.add(90);
        minPq.add(50);
        minPq.add(20);
        minPq.add(10);

        System.out.println(minPq);
        System.out.println( minPq.remove());
        System.out.println( minPq.remove());
        System.out.println(minPq);

        System.out.println("------------------------");

        // Max priority queue (largest first remove)
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        maxPq.add(90);
        maxPq.add(20);
        maxPq.add(50);
        maxPq.add(10);
        System.out.println(maxPq);
        System.out.println(maxPq.remove());
        System.out.println(maxPq.remove());
        System.out.println(maxPq);


    }
}
