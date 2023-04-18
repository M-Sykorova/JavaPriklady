package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class GradesEx2Ex9 {
    public static void main(String[] args) {
        int geometry = 0;
        int algebra = 0;
        int physics = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj znamky z predmetu geometria: ");
        geometry = scanner.nextInt();
        System.out.println("Zadaj znamky z predmetu algebra: ");
        algebra = scanner.nextInt();
        System.out.println("Zadaj znamky z predmetu fyzika: ");
        physics = scanner.nextInt();

        System.out.println("Geometry = " + geometry);
        System.out.println("Algebra = " + algebra);
        System.out.println("Physics = " + physics);



        int average = (geometry + algebra + physics) / 3;
        System.out.println("priemerne_skore = " + average);
        if(average >= 7 ){
            System.out.println("Dobra praca!");
        } else if(average >= 4 && average <= 6){
            System.out.println("Musite tvrdsie pracovat!");
        } else if(average > 0 && average < 4) {
            System.out.println("Nepodarilo sa, naozaj musite pracovat tvrdsie!");
        }
    }
}

