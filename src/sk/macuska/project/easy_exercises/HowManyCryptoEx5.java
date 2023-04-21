package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class HowManyCryptoEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Investovana suma: ");
        double investedMoney = scanner.nextDouble();

        System.out.println("Cena bitcoinu: ");
        double bitcoinPrice = scanner.nextDouble();

        System.out.println("Cena Etherea: ");
        double ethereumPrice = scanner.nextDouble();

        System.out.println("Cena Litecoinu: ");
        double litecoinPrice = scanner.nextDouble();

        int bitcoin = (int) (investedMoney / bitcoinPrice);
        int ethereum = (int) (investedMoney / ethereumPrice);
        int litecoin = (int) (investedMoney / litecoinPrice);

        System.out.println("Za sumu " + investedMoney + " si mozes kupit Bitcoin v hodnote: " + bitcoin +
                ", Ethereum v hodnote: " + ethereum + " a Litecoin v hodnote: " + litecoin);
    }

}
