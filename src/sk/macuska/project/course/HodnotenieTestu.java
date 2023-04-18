package sk.macuska.project.course;

import java.util.Scanner;

public class HodnotenieTestu {
    public static void main(String[] args) {
        float percenta;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj pocet percent:");

        percenta = scanner.nextFloat();

        scanner.close();

        hodnotenie(percenta);

    }
    public static void hodnotenie(float pocetPercent){

        if(pocetPercent >= 90 && pocetPercent <= 100){
            System.out.println("Vysledok testu: A");
        } else if(pocetPercent >= 75){
            System.out.println("Vysledok testu: B");
        } else if(pocetPercent >= 65){
            System.out.println("Vysledok testu: C");
        } else {
            System.out.println("Nedefinovane");
        }
    }
}


/*Úloha 1: Program na priradenie známky

        Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše
        známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.
*/