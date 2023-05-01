/*You want to buy something from Amazon. The seller charges different prices for shipping cost based on location. For US it's 5$ for Europe it's 7$ for Canada it's 3$ for other places it's 9$

        Create a program that:

        Reads the cost of the product
        Reads your location
        Print the amount of money you have to pay
        Ouput: "You have to pay 23$, 20$ for the product and 3$ for shipping cost"

 */

package sk.macuska.project.easy_exercises;

import java.util.Locale;
import java.util.Scanner;

public class AmazonOrderEx14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cena produktu: ");
        float cenaProduktu = scanner.nextFloat();
        System.out.println("Lokalita objednania: ");
        String lokalitaObjednania = scanner.next().toLowerCase();

        float total;

        switch (lokalitaObjednania){
            case "us":
                total = cenaProduktu + 5;
                System.out.println("Vysledna cena je " + total + "€, " + cenaProduktu + "€ za produkt a 5€ za postovne.");
                break;
            case "europe":
                total = cenaProduktu + 7;
                System.out.println("Vysledna cena je " + total + "€, " + cenaProduktu + "€ za produkt a 7€ za postovne.");
                break;
            case "canada":
                total = cenaProduktu + 3;
                System.out.println("Vysledna cena je " + total + "€, " + cenaProduktu + "€ za produkt a 3€ za postovne.");
                break;
            default:
                total = cenaProduktu + 9;
                System.out.println("Vysledna cena je " + total + "€, " + cenaProduktu + "€ za produkt a 9€ za postovne.");
                break;
        }

    }
}
