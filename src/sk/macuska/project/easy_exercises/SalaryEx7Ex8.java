package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class SalaryEx7Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kolko rokov je zamestnanec zamestnany: ");
        int yearsOfEmployment = scanner.nextInt();

        System.out.println("Kolko deti ma zamestnanec: ");
        int amountOfChilren = scanner.nextInt();

        System.out.println("Odpracovane vsetky dni (ano - nie): ");
        String attendance = scanner.next();

        boolean absence = false;
        if(attendance.equals("nie")){
            absence = true;
        }


        int minWage = 400;
        int moneyForYears = 20 * yearsOfEmployment;
        int moneyForChildren = 30 * amountOfChilren;
        int moneyForNoAbsence = 100;

        int salary = minWage + moneyForYears + moneyForChildren + (absence? 0: moneyForNoAbsence);
        System.out.println("Vysledny plat je " + salary + "€. " + "Zaklad: " + minWage + "€ + odpracovane roky: "
                + yearsOfEmployment + " - " + moneyForYears + "€ + pocet deti: " + amountOfChilren + " - "
                + moneyForChildren + "€" + (absence? ".":  " + prispevok za dochadzku: " + moneyForNoAbsence + "€." ));



    }
}
