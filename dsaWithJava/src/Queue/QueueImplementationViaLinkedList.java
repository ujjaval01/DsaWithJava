package Queue;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class MyQueue{
    Node head;
    Node tail;
    int size = 0;

    public void addElement(int ele){
        // add elements in the rear...
        Node temp = new Node(ele);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int removeElements(){
        // remove the element int front = head.val;
        int front = head.val;
        if(size == 0){
            System.out.println("Invalid operation, Queue is empty!");
            return -1;
        }
        head = head.next;
        size--;
        return front;
    }

    public int getPeek(){
        // print the peek element...
        if(size == 0){
            System.out.println("Invalid operation, Queue is empty!");
            return -1;
        }
        return head.val;
    }

    public void display(){
        // display queue elements
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueImplementationViaLinkedList {
    public static void main(String[] args) {

        MyQueue q = new MyQueue();
        q.addElement(10); q.addElement(20);
        q.addElement(30); q.addElement(40);

        q.display();
        System.out.println(q.size);

        System.out.println( q.removeElements());
        System.out.println(q.size);






    }
}
