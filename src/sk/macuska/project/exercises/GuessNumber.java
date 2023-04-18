package sk.macuska.project.exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
//        boolean isStillGuessing = true;
        int guessedNumber = Integer.MAX_VALUE;

        while(guessedNumber != number) {
            System.out.println("Try to guess my number.");
            System.out.println("Guess the number from 1 - 10: ");
            guessedNumber = scanner.nextInt();

            if (guessedNumber > number){
                System.out.println("Nooo. My number is lower.");

            } else if(guessedNumber < number){
                System.out.println("Nooo. My number is higher.");

            } else {
            System.out.println("BINGO! You got it!");
//            isStillGuessing = false;
            }
        }
    }
}
