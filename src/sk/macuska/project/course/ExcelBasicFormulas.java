package sk.macuska.project.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcelBasicFormulas {
    public static void main(String[] args) {
        List<Double> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10D);
        listOfNumbers.add(20D);


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
