package dayone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnSpecified {
    public static void main(String args[]){
        int n=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the range number");
        try {
            n = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("enter only string");
            System.exit(0);
        }
        Add(n);
    }
    public static void Add(int n){

        int insert,sum=0;
        int[] addnum=new int[n];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        for (insert=0;insert<n;insert++){
            addnum[insert]=in.nextInt();
            sum +=addnum[insert];
        }

        System.out.println(sum);
    }
}
