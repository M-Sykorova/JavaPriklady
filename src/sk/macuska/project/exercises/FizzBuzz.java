package sk.macuska.project.exercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        //FIZZ BUZZ 1
        for(int i = 1; i <= 100; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.print("Fizz Buzz, ");
                } else if (i % 3 == 0){
                    System.out.print("Fizz, ");
                } else if(i % 5 == 0){
                    System.out.print("Buzz, ");
                } else {
                    System.out.print(i + ", ");
                }
        }
        */



         /*
        // FIZZ BUZZ 2 V POLI S RANDOM CISLAMI
        int[] numbers = new int[30];
        Random random2 = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random2.nextInt(100);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                System.out.print("Fizz Buzz, ");
            } else if (numbers[i] % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (numbers[i] % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

        */



        /*
        //FIZZ BUZZ V POLI SO SCANEROM
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        int index = 0;
        System.out.println("Please enter the numbers:");

        while(index < 4){
            numbers[index] = scanner.nextInt();
            index++;
        }
        scanner.close();


        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 0 && numbers[i] % 5 == 0){
                System.out.print("Fizz Buzz, ");
            } else if (numbers[i] % 3 == 0){
                System.out.print("Fizz, ");
            } else if(numbers[i] % 5 == 0){
                System.out.print("Buzz, ");
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

         */



        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Please enter the numbers:");

        while(scanner.hasNextInt() && !scanner.hasNextLine()){
            list.add(scanner.nextInt());


        }


        Integer[] number = list.toArray(new Integer[0]);
        for(Integer numbers : number){
            if(numbers % 3 == 0 && numbers % 5 == 0){
                System.out.print("Fizz Buzz, ");
            } else if (numbers % 3 == 0){
                System.out.print("Fizz, ");
            } else if(numbers % 5 == 0){
                System.out.print("Buzz, ");
            } else {
                System.out.print(numbers + ", ");
            }
        }

    /*
        Integer[] cisla = list.toArray(new Integer[0]);
        for(int i = 0; i < cisla.length; i++){
            if(cisla[i] % 3 == 0 && cisla[i] % 5 == 0){
                System.out.print("Fizz Buzz, ");
            } else if (cisla[i] % 3 == 0){
                System.out.print("Fizz, ");
            } else if(cisla[i] % 5 == 0){
                System.out.print("Buzz, ");
            } else {
                System.out.print(cisla[i] + ", ");
            }
        }

     */

    }
}

