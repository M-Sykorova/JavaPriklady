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
