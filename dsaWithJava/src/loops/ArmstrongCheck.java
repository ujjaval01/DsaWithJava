package loops;

import java.util.Scanner;
class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();     // 1 5 3
        int sum = 0;
        int digit = 0;

        int temp = num;
        while (temp != 0) {        // checking the digit
            temp = temp / 10;
            digit++;
        }
        // calculating the sum of the digit ^ digit
         temp = num;
         while (temp != 0) {
             int a = temp%10;
             sum = sum + (int) Math.pow(a, digit);
             temp = temp/10;
         }

//        System.out.println(sum);

         if(num == sum) System.out.println("Armstrong");
         else System.out.println("Not a armstrong");


    }
}
