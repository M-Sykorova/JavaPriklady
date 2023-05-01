/*You are interested in buying a new laptop. You check the price and you see that the price is 300$ without the 10% tax.

        Create a program that:

        Reads the price of the laptop
        Reads the tax percentage
        Prints the total amount
        Output: "The total price of the laptop is 330$"

 */

package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class LaptopPriceEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj hodnotu laptopu bez dane: ");
        double laptopPriceWithoutTax = scanner.nextDouble();

        System.out.println("Zadaj hodnotu dane: ");
        int tax = scanner.nextInt();

        double totalAmount = (laptopPriceWithoutTax / 100 * tax) + laptopPriceWithoutTax;

        System.out.println("The total price of laptop is " + totalAmount);
    }
}
