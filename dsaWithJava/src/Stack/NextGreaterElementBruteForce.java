package Stack;

import java.util.ArrayList;

public class NextGreaterElementBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,8,3,5,2,1,6,4};
//                  8 -1 5 6 6 6 -1 -1

        System.out.print(nge(arr));
    }

    static ArrayList<Integer> nge(int[] arr){
        int n = arr.length;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int nextGreater = -1;
            for(j = i+1; j<n; j++){
                if(arr[j] > arr[i]){
                   nextGreater = arr[j];
                    break;
                }
            }
            ans.add(nextGreater);
        }

        return ans;
    }
 }
