package Revision;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,8,6,1,4,8,7,9,3,4};
        int n = arr.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                   flag = true;
                   c++;
                }
            }
            if(!flag) break;
        }

        System.out.println(c);  // check how many swaps done...
        for(int res : arr){
            System.out.print(res + " ");
        }
    }

}
