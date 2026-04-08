package Revision;

import java.util.ArrayList;
import java.util.Collections;

public class AddOne {
    public static void main(String[] args) {
        int[] arr = {4,9,9,9};
        int carry = 1;
        int n = arr.length-1;

        ArrayList<Integer> res = new ArrayList<>();
        for(int i = n; i>=0; i--){
            if((arr[i] + carry) <= 9){
                res.add(arr[i] + carry);
                carry = 0;
            }else{
                res.add(0);
            }
        }
        if(carry == 1) res.add(1);
        Collections.reverse(res);

        System.out.println(res);
    }
}
