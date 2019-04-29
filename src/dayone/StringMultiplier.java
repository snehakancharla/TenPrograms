package dayone;

import java.util.Scanner;

public class StringMultiplier {
    public static void main(String args[]) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        str = in.next();
        stringAdd(str);
    }
    public static void stringAdd(String str){
        String new_word;
        int valueMulti, i, len;
        new_word=str;
        Scanner in=new Scanner(System.in);
        System.out.println("enter multiplier value");
        valueMulti=in.nextInt();
        len=str.length();
        for(i=0 ; i<valueMulti ;i++){
            new_word= new_word+ str.substring(len - valueMulti,len);
        }
        System.out.println(new_word);
    }
}
