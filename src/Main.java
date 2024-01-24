
import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int wrong = 0;
        System.out.println("Welcome To Guessing Number Game");
        System.out.print("Input Max Number: ");
        int max = input.nextInt();
        System.out.print("Input Min Number: ");
        int min = input.nextInt();
        int randomNumber = random.nextInt(max - min + 1) + min;

        while(true) {
            System.out.print("Please Input Your Number: ");
            int user_answer = input.nextInt();
            if (user_answer == randomNumber) {
                System.out.println("Bravo Your Guess is correct!!");
                System.out.println("Correct Answer: " + randomNumber);
                System.out.println("Wrong Guessed: " + wrong);
                return;
            } else if (user_answer > randomNumber) {
                System.out.println("Lower");
            } else {
                System.out.println("Higher");
            } if (user_answer > max || user_answer < min) {
                System.out.println("The Number Entered is Out of Range!!");
            } else {
                ++wrong;
                System.out.println("Incorrect! Please Try Again!");
            }
        }

    }
}
