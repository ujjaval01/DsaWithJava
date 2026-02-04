package LeetCodeQuestions;

public class Q53MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int currSum = 0;
        int maxSum = arr[0];

        for(int a : arr){
            currSum+=a;
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0) currSum = 0;
        }

        return maxSum;
    }
}
