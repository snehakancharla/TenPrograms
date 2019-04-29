package dayone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {

        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        try {
            n = in.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("enter number only");
            System.exit(1);
        }
        FindOddEven(n);
    }
    public static void FindOddEven(int n){
        if((n%2==0) && (n>20 && n<30)){
            System.out.println("jerry");
        }
        else if ((n%2!=0) && (n>20 && n<30 )){
            System.out.println("tom");
        }

    }
}
