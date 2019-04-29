package dayone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Iterate {
    public static void main(String[] args) {

        int n=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to iterate");
        try {
            n = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("enter only number");
            System.exit(3);
        }
        numIterate(n);
    }
    public static void numIterate(int n){

        int  i, j;
        for(i=1; i<=n; i++){
            for (j=1; j<=i; j++){
                System.out.print(i+" " );
            }
        }
    }

}
