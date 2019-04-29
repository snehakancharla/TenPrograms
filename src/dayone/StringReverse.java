package dayone;

import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]){
        String str;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string:");
        str=in.next();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        char c[]=str.toCharArray();
        int i=0,j=c.length-1;
        while (i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return new String(c);


    }



}
