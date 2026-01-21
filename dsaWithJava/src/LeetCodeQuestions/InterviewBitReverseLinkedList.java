package LeetCodeQuestions;

import java.util.Stack;

public class InterviewBitReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(!st.isEmpty()){
            temp.val = st.pop();
            temp = temp.next;
        }

        return head;
    }
}
