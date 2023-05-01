/*Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt (getAverage).
        Vstup hodnôt bude cez premenné, napr. value1 a value2.
        Dodatočná úloha: Doplňte ďalšie funkcie a to MAX (getMax), ktorá zistí (vráti, zobrazí) najvyššie zadané číslo, ďalej funkciu MIN (getMin), ktorá zistí najnižšie
         číslo a funkcia COUNT (getCount), ktorá zistí počet zadaných vstupných čísel.
        Pomôcka: Môžete použiť metódu max a min triedy Math, ktorá sa nachádza štandardne v Jave (inbuilt).
        System.out.println("The largest number of the two numbers is " + Math.max(1,2));
        Dodatočná úloha č. 2:  Upravme metódy tak, že bude dané funkcie počítať z ľubovoľného množstva čísel.

 */


package sk.macuska.project.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcelBasicFormulas {
    public static void main(String[] args) {
        List<Double> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10.0);
        listOfNumbers.add(20.0);


        System.out.println("Sucet vsetkych cisel je: " + getSum(listOfNumbers));
        System.out.println("Priemer vsetkych cisel je: " + getAverage(listOfNumbers));
        System.out.println("Najvacsie cislo je: " + maxValue(listOfNumbers));
        System.out.println("Najmensie cislo je: " + minValue(listOfNumbers));
        System.out.println("Pocet cisel je: " + getCount(listOfNumbers));
    }


    public static double getSum(List<Double> listNumbers){
        double sum = 0;
        for( double d: listNumbers ){
            sum = sum + d;
        }
        return sum;
    }

    public static double getAverage(List<Double> listNumbers){
        double sum = 0;
        for( double d: listNumbers){
            sum = sum + d;
        }
        double average = sum / listNumbers.size();
        return average;
    }

    public static double maxValue(List<Double> listNumbers){
        double max = Collections.max(listNumbers);
        return max;
    }

    public static double minValue(List<Double> listNumbers){
        double min = Collections.min(listNumbers);
        return min;
    }

    public static int getCount(List<Double> listNumbers){
        int counter = listNumbers.size();
        return counter;
    }
}
