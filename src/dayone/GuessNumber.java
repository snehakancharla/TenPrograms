package dayone;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

    public static void main(String args[]) {
        System.out.println("Enter the Guessing number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        NumberToGuess(input);
    }
   public  static void  NumberToGuess(int input) {
        if (input >= 1 && input <= 50) {
            System.out.println("Number guessed matches the original number");
        } else if (input < 1) {
            System.out.println("Number guessed is less than the original number");
        } else {
            System.out.println("Number guessed is more than the original number");
        }
        return;
    }

}
