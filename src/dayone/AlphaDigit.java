package dayone;

import java.util.Scanner;

public class AlphaDigit {
    public static void main(String args[]) {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.println("enter any character/digit");
        ch = in.next().charAt(0);
        Check(ch);
    }
    public static void Check(char ch) {
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is uppercase alphabet.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is lowercase alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println("special symbol");
        }


    }
}
