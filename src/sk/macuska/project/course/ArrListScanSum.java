package sk.macuska.project.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrListScanSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        int number;

        System.out.println("Zadajte kladne cisla. Zadavanie do pola ukoncite zapornym cislom.");

        do {
            number = scanner.nextInt();
            if (number >= 0) {
                listOfNumbers.add(number);
            }
        } while (number >= 0);


        System.out.println("sk.macuska.project.course.Pole cisel je: ");
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
