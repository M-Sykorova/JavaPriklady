/*Vytvorte dynamicke pole (prostredníctvom ArrayList), ktorý od používateľa bude žiadať zadanie číselných hodnôt, ktoré budeme do dynamického poľa pridávať.
 Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
 Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
 Poznámka: Skúsme “ošetriť” zadanie textových hodnôt tak, aby program nespadol.
 Bonusová úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.

 */

package sk.macuska.project.course;

import java.util.*;

public class ArrListScanSum {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        int number = 0;

        System.out.println("Zadajte kladne cisla. Zadavanie do pola ukoncite zapornym cislom.");

        do {
            Scanner scanner = new Scanner(System.in);

            try {
                number = scanner.nextInt();
                if (number >= 0) {
                    listOfNumbers.add(number);
                }
            } catch (InputMismatchException e) {
                System.out.println("Nezadali ste cislo. Prosim zadajte cele cislo.");
            } catch (NoSuchElementException e) {
                System.out.println("Nieco sa pokazilo.");
            }

        } while (number >= 0);


        System.out.println("Pole cisel je: ");
        for (int n : listOfNumbers) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("Sucet cisel je: " + getSum(listOfNumbers));
    }

    public static int getSum(List<Integer> listNumbers) {
        int sum = 0;
        for( int n: listNumbers){
            sum = sum + n;
        }
        return sum;
    }
}
