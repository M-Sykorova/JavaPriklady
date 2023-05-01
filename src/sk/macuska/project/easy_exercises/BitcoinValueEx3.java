/*You've bought a Bitcoin and now it's on the rise!!!

        Create a program that:

        Reads the value of the bitcoin at the time of purchase
        Reads the percentage of increase (or decrease)
        Prints the total value of your bitcoin
        Prints the increase or decrease value
        Example: bitcoin_value = 10000, bitcoin_increase = 10
        Output: total_bitcoin_value = 11000, bitcoin_increase_value = 1000

 */

package sk.macuska.project.easy_exercises;

public class BitcoinValueEx3 {
    public static void main(String[] args) {
        double bitcoinValue = 10000;
        double percentageOfRise = 10;

        double totalBitcoinValue = ((100+percentageOfRise) * bitcoinValue/100);
        double bitcoinRiseValue = totalBitcoinValue - bitcoinValue;

        System.out.println("Total bitcoin value is: " + totalBitcoinValue);

         if (bitcoinRiseValue < 0){
             System.out.println("Bitcoin decrease value is: " + bitcoinRiseValue);
         } else if(bitcoinRiseValue == 0) {
             System.out.println("Bitcoin rise value is 0.");
         } else {
            System.out.println("Bitcoin increase value is: " + bitcoinRiseValue);
         }
    }
}
