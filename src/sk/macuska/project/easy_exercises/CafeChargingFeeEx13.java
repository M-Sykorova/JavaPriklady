/*An internet cafe has 2 ways of charging. If the user is a member pays 2$/hour, Else the user pays 5$. Find if someone is a member or not and calculate the price based on how many hours the user spend. If the user is a member the tax is 10% else the tax is 20%.

        Create a program that:

        Reads how many hours the user spend
        Check if is a member
        Add the proper tax fee
        Print the total amount the user has to pay
        Output: "The user is a member stayed 2 hours for 2$/hour plus the 10% the total amount is 4.4$"

 */

package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class CafeChargingFeeEx13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pocet hodin nabijania: ");
        float chargingHours = scanner.nextFloat();
        System.out.println("Je clen vernostneho programu? A-ano, N-nie");
        String member = scanner.next();
        float total = 0;

        if(member.equals("ano")){
            total = chargingHours * 2 * 1.1f;
        } else if (member.equals("nie")){
            total = chargingHours * 5 * 1.2f;
        }
        System.out.println("Vysledna cena za nabijanie je: "  + total + "€");
    }
}
