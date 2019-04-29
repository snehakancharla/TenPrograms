package dayone;

import java.util.Scanner;

public class VowCon {

    public static void main(String args[]) {

        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        str = in.next();
        FindVowcon(str);
    }
    public static void FindVowcon(String str){

        int i;
        char[] ch = str.toCharArray();
        for (i = 0; i <ch.length; i++)
        {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                System.out.println(ch[i]+" -Vowels ");
            } else {
                System.out.println(ch[i]+" -Consonants ");
            }

        }
    }
}