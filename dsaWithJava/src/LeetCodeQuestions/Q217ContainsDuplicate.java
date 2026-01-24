package LeetCodeQuestions;

import java.util.HashSet;

public class Q217ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(arr[i]);
        }

        // if(arr.length == set.size()) return false;
        // else return true;

        return (n !=set.size());

    }
}
