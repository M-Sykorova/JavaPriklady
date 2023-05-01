/*Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).

        Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program
        vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.
        Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.

        Update programu, vylepšená verzia by mohla robiť toto:
        Popis programu:
        Po spustení programu vypíše jednoduché menu, kde používateľa zadá možnosť:
        s alebo q
        pričom písmeno s od používateľa bude žiadať zadanie strán a, b. Po zadaní týchto strán vypočíta obvod a obsah obdlžnika a zobrazí ho do konzoly.
        Toto bude opakovať dovtedy, kým v menu nezadáme písmeno q. Po zadaní písmena q, program ukončí svoju činnosť a vypíše Koniec programu.
 */

package sk.macuska.project.course;

import org.junit.platform.commons.function.Try;
import org.testng.annotations.Test;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.testng.AssertJUnit.assertEquals;

public class Obdlznik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prikaz = "";


        while(!prikaz.equals("q")){
            System.out.println("Zadaj s pre vypocet, alebo q pre koniec programu");

            prikaz = scanner.next();

            if (prikaz.equals("s")) {

                try {
                    System.out.println("Zadaj stranu a: ");
                    double stranaA = scanner.nextDouble();

                    System.out.println("Zadaj stranu b: ");
                    double stranaB = scanner.nextDouble();

                    System.out.println("Obvod obdlznika je: " + vypocitajObvod(stranaA, stranaB));
                    System.out.println("Obsah obdlznika je: " + vypocitajObsah(stranaA, stranaB));

                } catch (InputMismatchException e) {
                    System.out.println("Nezadali ste spravne cislo. Cislo musi byt vo formate 0.00");
                } catch (NoSuchElementException e) {
                    System.out.println("Nieco je zle.");
                }
            }
            }
        System.out.println("Koniec programu.");

        /*do {
            System.out.println("zadaj s pre vypocet, alebo q pre koniec programu");

            prikaz = scanner.nextLine();


            if (prikaz.equals("s")){
                System.out.println("Zadaj stranu a: ");
                double stranaA = scanner.nextDouble();

                System.out.println("Zadaj stranu b: ");
                double stranaB = scanner.nextDouble();

                System.out.println("Obvod obdlznika je: " + vypocitajObvod(stranaA, stranaB));
                System.out.print("Obsah obdlznika je: " + vypocitajObsah(stranaA, stranaB));


            } else if (prikaz.equals("q")) {
                System.out.println("Koniec programu.");
            }

        } while (!prikaz.equals("q"));

         */

    }
    public static double vypocitajObvod(double stranaA, double stranaB){
        return (2*(stranaA + stranaB));

    }
    public static double vypocitajObsah(double stranaA, double stranaB){
        return (stranaA * stranaB);
    }
}

