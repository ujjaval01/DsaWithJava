package LeetCodeQuestions;

public class interviewBitSortBinaryLinkedList
{
    public static void main(String[] args) {

    }
    public ListNode solve(ListNode head) {
        int count0 = 0, count1 = 0;
        ListNode temp = head;

        // Step 1: count 0s and 1s
        while (temp != null) {
            if (temp.val == 0) count0++;
            else count1++;
            temp = temp.next;
        }

        // Step 2: rewrite values
        temp = head;
        while (count0-- > 0) {
            temp.val = 0;
            temp = temp.next;
        }
        while (count1-- > 0) {
            temp.val = 1;
            temp = temp.next;
        }

        return head;
    }
}
