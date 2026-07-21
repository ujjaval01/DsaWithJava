package SortBubble;

import java.util.ArrayList;

public class MoveAllZerosInTheEnd {
    public static void main(String[] args) {
        int[] arr = {3,5,0,0,4};
        int n = arr.length;
//        int j = 0;
//
//        for(int i = 0; i<n; i++){
//            if(arr[i] !=0 ){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//
//        for(int e: arr){
//            System.out.print(e + " ");
//        }

        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for (int j : arr) {
            if (j != 0) al.add(j);
            else count++;
        }
        for(int i = 0; i<count; i++){
            al.add(0);
        }
        for (int i = 0; i<n; i++){
            arr[i] = al.get(i);
        }
        for(int e: arr){
            System.out.print(e + " ");
        }





    }
}
