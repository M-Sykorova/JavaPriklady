package sk.macuska.project.course;

import org.testng.annotations.Test;

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
                System.out.println("Zadaj stranu a: ");
                double stranaA = scanner.nextDouble();

                System.out.println("Zadaj stranu b: ");
                double stranaB = scanner.nextDouble();

                System.out.println("Obvod obdlznika je: " + vypocitajObvod(stranaA, stranaB));
                System.out.println("Obsah obdlznika je: " + vypocitajObsah(stranaA, stranaB));
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

// JUnit TESTOVANIE
    @Test
    void otestujvypocitajObsah(){
        assertEquals(40.0, vypocitajObsah(10,4));
    }

    @Test
    void otestujvypocitajObvod(){
        assertEquals(28.0, vypocitajObvod(10,4));
    }
}
