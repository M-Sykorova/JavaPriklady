package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class LastDigitIntegerEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj cislo: ");
        int number = scanner.nextInt();

        int result;
        result = number % 10;

        System.out.println(result);

    }
}
