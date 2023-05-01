/*A cell phone company has the following billing policy

        Fixed cost 25$
        Call duration(in seconds)	Charge($/per second)
        1-500	0,01
        501-800	0,008
        801+	0,005
        Create a program that:

        Reads how many seconds was the calls duration
        Calculates the monthly bill for the subscriber
        Prints the total amount
        Output: "total amount: 48$"
        Notice that that the charge for the first 500 seconds it's 0,01$
        then for the next 501 to 800 seconds it's 0,008 and then it's 0,005$

 */

package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class TelephoneBillingEx15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pocet prevolanych sekund: ");
        int casVolania = scanner.nextInt();
        float total;

        if(casVolania <= 500){
            total = 25 + casVolania * 0.01f;
        } else if(casVolania <= 800) {
            total = 25 + 500 * 0.01f + (casVolania - 500) * 0.008f;
        } else {
            total = 25 + 500 * 0.01f + 300 * 0.008f + (casVolania - 800) * 0.005f;
        }

        System.out.println("Vysledna suma je: " + total);

    }
}
