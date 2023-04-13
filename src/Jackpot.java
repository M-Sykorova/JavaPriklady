import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Jackpot {
    public static void main(String[] args) {
        //ZAVOLANIE SPUSTACEJ METODY
        playLoto();
    }

        //METODA NA ZAVOLANIE OSTATNYCH METOD
    public static void playLoto(){
        int[] randomnumbers = randomNumbers();
        int[] userNumbers = userNumbers();
        int[] matchedNumbers = matchedNumbers(userNumbers, randomnumbers);

        System.out.println("Vyzrebovane cisla su: " + Arrays.toString(randomnumbers));
        System.out.println("Vase tipovane cisla su: " + Arrays.toString(userNumbers));
        if(matchedNumbers.length == 0){
            System.out.println("Neuhadli ste ziadne cislo.");
        } else {
            System.out.println("Vase uhadnute cisla su: " + Arrays.toString(matchedNumbers));
        }
        validateTicket(matchedNumbers);

    }

        //METODA, KTORA ZISTI CI SA TIPOVANE CISLA ZHODUJU S NAHODNYMI VYZREBOVANYMI
    public static int[] matchedNumbers(int[] userNumbers, int[] randomnumbers){
        int[] matchedNumbers = new int[5];
        int counterMatches = 0;
        for(int i = 0; i < userNumbers.length; i++){
            for(int j = 0; j < randomnumbers.length; j++){
                if(userNumbers[i] == randomnumbers[i]){
                    matchedNumbers[counterMatches] = userNumbers[i];
                    counterMatches++;
                    break;
                }
            }
        }
        return arrayCutter(matchedNumbers, counterMatches);
    }

        //METODA, KTORA OREZE ARRAY NA POZADOVANU VELKOST
    public static int[] arrayCutter(int[] arrayToCut, int finalSize){
        int[] result = new int[finalSize];

        for(int i = 0; i < result.length; i++){
            result[i] = arrayToCut[i];
        }
        return result;
    }

        //METODA KTORA VYHODNOTI TIPOVANE CISLA
    public static void validateTicket(int[] numbers){
        if(numbers.length == 5){
            System.out.println("JACKPOT!");
        } else if(numbers.length == 4){
            System.out.println("Gratulujeme, vyhrali ste 100 000€");
        } else if(numbers.length == 3){
            System.out.println("Gratulujeme, vyhrali ste 100€");
        } else {
            System.out.println("Lutujeme, skuste stastie nabuduce.");
        }
    }

        //METODA, KTORA VYTVORI NAHODNE CISLA
    public static int[] randomNumbers() {
        Random random = new Random();
        int[] randomnumbers = new int[5];

        for (int i = 0; i < randomnumbers.length; i++) {
            randomnumbers[i] = random.nextInt(50);

        }
        return randomnumbers;
    }

        //METODA, KTORA VYPYTA TIPOVANE CISLA OD UZIVATELA
    public static int[] userNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte pat cisel od 1 do 50.");

        int[] userNumbers = new int[5];

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Zadajte " + (i + 1) + ". číslo:");
            userNumbers[i] = scanner.nextInt();
        }
        return userNumbers;
    }


}
