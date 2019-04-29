package dayone;

import java.util.Scanner;

public class Palindrome {
    public static  void main(String[] args) {

        long number;
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        number = in.nextLong();
        findPalindrome(number);
    }
    public static void findPalindrome(long number){
        long r, sum = 0, temp, add = 0;
        temp=number;
        while (number>0)
        {

            r=number%10;
            sum = (sum * 10) + r;
            number = number/10;

            if(r%2==0)
                add = add+r;


        }

        if( (temp == sum) && (add>25) )
            System.out.println(temp + " is palindrome and the sum of even numbers is greater than 25");

        else if ((temp == sum) && (add<25))
        {
            System.out.println(temp + "is  a palindrome and the sum of even number is less than 25");
        }
        else
        {
            System.out.println(temp +" is not a palindrome");
        }


    }

}
