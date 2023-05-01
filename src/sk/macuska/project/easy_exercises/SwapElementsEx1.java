/*Create two variables a and b, and initially set them each to a different number. Write a program that swaps both values.

        Example: a = 10, b = 20
        Output: a = 20, b = 10

 */

package sk.macuska.project.easy_exercises;

public class SwapElementsEx1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("cislo a: " + a + " cislo b: " + b);
    }


}
