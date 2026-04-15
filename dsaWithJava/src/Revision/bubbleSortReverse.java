package Revision;

public class bubbleSortReverse {
    public static void main(String[] args) {
        int[] arr = {5,8,6,1,4,8,7,9,3,4};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int res : arr){
            System.out.print(res + " ");
        }
    }
}
