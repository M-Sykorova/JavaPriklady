/*In a company the monthly salary of an employee is calculated by: the minimum wage 400$ per month, plus 20$ multiplied by the number of years employed, plus 30$ for each child they have.

        Create a program that:

        Reads the number of years employed
        Reads the number of children the employee has
        Prints the total amount of salary the employee makes
        Output: "The total amount is 560$. 400$ minimum wage + 100$ for 5 years experience + 60$ for 2 kids
The exercise is almost identical to a previous exercise with a minor change. In a company the monthly salary of an employee is calculated by minimum wage 400$ per month, plus 20$ multiply by the employment years, plus 30$ for each employee kid, plus 100$ if the employee didn't miss 1 day of work.

        Create a program that:

        Reads the employment years
        Reads the number of each employee kids
        Prints the total amount the employee must take
        Output: "The total amount is 660$, 400$ minimum wage + 100$ for 5 years experience + 60$ for 2 kids + 100$ for not missing a day at work"

 */

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
