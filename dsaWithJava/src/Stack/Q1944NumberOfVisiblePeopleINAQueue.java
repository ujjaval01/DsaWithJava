package Stack;

import java.util.Stack;

public class Q1944NumberOfVisiblePeopleInAQueue {
    public static void main(String[] args) {
        int[] arr = {10,6,8,5,11,9};
        int[] ans = canSeePersonsCount(arr);
        for(int e:  ans){
            System.out.print(e + " ");
        }
    }
    public static int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = 0;
        for(int i = n-2; i >= 0; i--){
            int count = 0;
            while(!st.isEmpty() && st.peek() <= arr[i]){
                count++;
                st.pop();
            }
            if(!st.isEmpty()) count++;
            ans[i] = count;
            st.push(arr[i]);
        }
        return ans;

    }
}
