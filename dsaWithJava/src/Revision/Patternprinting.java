package Revision;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Patternprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        for (int i=0;i<num;i++){
            for (int j=num;j>i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
