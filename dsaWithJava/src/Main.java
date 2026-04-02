public class Main{
    public static void main(String[] args) {
        System.out.println("hello");

//        int p = 67, t = 2, r = 5;
//        double si = p*t*r/100d;
//        System.out.println(si);

//        int r = 3;
//        int c = 5;

//        for (int i = 1; i<=3; i++){
//            for (int j = 1; j<=5; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        int n = 4;
//        * * * *
//        * * *
//        * *
//        *
//        for (int i = 1; i<=n; i++){
//            for (int j = n; j>=i; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //product of the array elements
        int[] a = {2,4,5,3,6}, b = {2,4,5,3,6}, c = new int[a.length]; int p = 1;
        for(int i = 0; i<a.length; i++) c[i] = a[i]*b[i];
        for(int res: c) System.out.print(res + " ");





    }
}