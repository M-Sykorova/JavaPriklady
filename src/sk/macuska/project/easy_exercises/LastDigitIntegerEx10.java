/*Create a program that prints the last digit of a given integer

        Create a program that:

        Reads the integer
        Prints the last digit
        Warning! Do not use the programming language MAGIC. After you complete the exercise feel free to do so.

        Warning! Don't try to convert the number into string etc.

        Warning! For this problem it's ok after spending some time to look for the solution.

 */

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
