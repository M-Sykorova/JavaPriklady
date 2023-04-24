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
