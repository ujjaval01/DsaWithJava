package SortBubble;
/*
Best case T.C - O(n)
Avg & worst case T.C- O(n*n)
*/
public class BubbleSortOptimized {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4};
        int n = arr.length;
        sortArray(arr,n);
        for(int e: arr){
            System.out.print(e + " ");
        }
    }

    static void sortArray(int[] arr, int n){
        for(int i = 0; i<n; i++){
            boolean flag = false;
            for (int j = 0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }
}
/*
Pass 1 (i = 0)
i	j	Compare	Swap?	Array State	    flag
0	0	1 > 2	 No	    [1, 2, 5, 3, 4]	false
0	1	2 > 5	 No	    [1, 2, 5, 3, 4]	false
0	2	5 > 3	Yes	    [1, 2, 3, 5, 4]	true
0	3	5 > 4	Yes	    [1, 2, 3, 4, 5]	true

👉 Pass 1 ke baad array sorted ho gaya, flag = true.

Pass 2 (i = 1)
i	j	Compare	Swap?	Array State	    flag
1	0	1 > 2	No	    [1, 2, 3, 4, 5]	false
1	1	2 > 3	No	    [1, 2, 3, 4, 5]	false
1	2	3 > 4	No	    [1, 2, 3, 4, 5]	false

👉 Is pass me koi swap nhi hua, flag = false.
👉 Condition if(!flag) break; → loop break ho jaayega.
*/
