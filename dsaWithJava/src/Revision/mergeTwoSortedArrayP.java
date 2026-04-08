package Revision;

public class mergeTwoSortedArrayP {
    public static void main(String args[]) {
        int[] a = {2,3,5,6};
        int[] b = {1,3,4,7,9,11};
        int n = a.length + b.length;
        int[] c = new int[n];
        sortedArrayP(a, b,c);
        for(int ele: c){
            System.out.print(ele + " ");
        }
    }

    public static void sortedArrayP(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }

        while(j<b.length){
            c[k++] = b[j++];
        }
        while(i<a.length){
            c[k++] = a[i++];
        }
    }
}
