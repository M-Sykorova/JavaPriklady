/*You have started working and you are wondering how many things you can buy with the money you've earned. A PS4 costs 200$, a Samsung phone 900$, a TV 500$, a game skin 9.99$

        Create a program:

        Notice that you can't but half TV or 1/4 of PS4.
        Reads how many hours you've worked
        Reads your hourly income
        Prints how many items you can buy
        Output: "I can buy 4 PS4, 1 Samsung, 3 TV, 80 game skin"

 */

package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class HowManyThingsICanBuyEx11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Odpracovane hodiny: ");
        float hodiny = scanner.nextFloat();

        System.out.println("Hodinova sadzba:");
        float sadzba = scanner.nextFloat();

        int ps4 = 200;
        int phone = 900;
        int tv = 500;
        float gameSkin = 9.99f;

        float totalEarned = hodiny * sadzba;

        int howManyPS4 = (int) (totalEarned / ps4);
        int howManyphones = (int) (totalEarned / phone);
        int howManytvs = (int) (totalEarned / tv);
        int howManyGameSkins = (int) (totalEarned / gameSkin);

        System.out.println("Mozes si kupit : " + howManyPS4 + " PS4, " + howManyphones + " telefonov, " + howManytvs +
                " tv, " + howManyGameSkins + " game skinov.");
    }
}
