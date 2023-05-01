/*You are interested in buying crypto-currencies. You want to check the current amount of money you have and see how many coins you can buy in Bitcoin, Ethereum, and Litecoin.

        Create a program that:

        Reads the total amount of money you have
        Reads the price of Bitcoin, Ethereum, and Litecoin
        Prints the amount of Bitcoin, Ethereum, and Litecoin you can buy
        Example: money = 100, bitcoin_price = 50, ethereum_price = 25, litecoin_price = 10
        Output: "With 100$ you can buy: 2 Bitcoins, 4 Ethereum, and 10 Litecoins"
        (Warning! Τhe prices are made up for exercise purposes)

 */

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
