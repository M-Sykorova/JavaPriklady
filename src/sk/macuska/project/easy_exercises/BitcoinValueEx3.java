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
