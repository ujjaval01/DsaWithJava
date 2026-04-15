package Revision;

public class moveZerosInTheEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,3,0,5};
        int n = arr.length;
        int i = 0, j = 0;
        while(j<n){
            if(arr[j] == 0){
                j++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        for(int res : arr){
            System.out.print(res + " ");
        }
    }
}
