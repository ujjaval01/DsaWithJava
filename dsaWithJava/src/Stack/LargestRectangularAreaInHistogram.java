package Stack;

import java.util.Stack;

public class LargestRectangularAreaInHistogram {
    public static void main(String[] args) {
        int[] arr = {60,20,50,40,10,50,60};
        int ans = largestRectangleArea(arr);
        System.out.println(ans);
    }
    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        nse[n-1] = n;
        st.push(n-1);
        for(int i= n-2; i>=0; i--){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        while(!st.isEmpty()) st.pop();

        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i = 1; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for(int i = 0; i<n; i++){
            int area = arr[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
