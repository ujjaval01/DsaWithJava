package maps_and_sets;

import java.util.HashSet;

public class FindDistinctElements {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        System.out.println(distinct(arr));
    }
    static int distinct(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        for(int e : arr){
            set.add(e);
        }

        return set.size();
    }
}
