/*You now own some property and you want to calculate the total area of the property.

        Create a program that:

        Reads the width and height
        Prints the area
        Example: width = 5, height = 2
        Output: total_area = 10

 */

package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class TotalAreaEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the width in meters: ");
        double width = scanner.nextDouble();

        System.out.println("Total area of your property is: " + totalArea(width, height) + "m2");
    }

    public static double totalArea(double a, double b){
        double total= a * b;
        return total;
    }
}
