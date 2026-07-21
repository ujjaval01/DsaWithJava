package Revision;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "ujjaval";
        char[] arr = s.toCharArray();
        int i = 0, j = s.length()-1;

        while(i<j){
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

//        String ans = new String(arr);
        System.out.println(new String(arr));
    }
}
