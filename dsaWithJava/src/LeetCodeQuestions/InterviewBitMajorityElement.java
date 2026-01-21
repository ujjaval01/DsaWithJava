package LeetCodeQuestions;

public class InterviewBitMajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(final int[] arr) {
        int count = 0;
        int res = 0;

        for(int e : arr){

            if(count == 0) res = e;

            if(e == res) count++;
            else count--;
        }

        return res;
    }
}
