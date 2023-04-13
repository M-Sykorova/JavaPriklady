import java.util.ArrayList;

public class ZakladneMatematickeOperacieMetody {
    public static void main(String[] args) {

        //ROZDELENIE DO DVOCH POLI PARNYCH A NEPARNYCH CISEL
        int[] numbers = {1, 8, 10, 12, 90};
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for( int i: numbers){
            if(i%2 == 0){
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }

        System.out.println("Pole parnych cisel je: " + evenNumbers);
        System.out.println("Pole neparnych cisel je: " + oddNumbers);
        System.out.println();


        //VOLANIE METOD
        evenOrOddNumbers(numbers);
        getSum(numbers);
        getMultiply(numbers);

    }
    //METODA PARNE/NEPARNE CISLA
    public static void evenOrOddNumbers(int[] numbers){
        //IF
        for( int i: numbers){
            if(i%2 == 0){
                System.out.println("Hodnota " + i + " je parna.");
            } else {
                System.out.println("Hodnota " + i + " je neparna.");
            }

        }
        System.out.println();

        //SWITCH
        for( int i: numbers) {
            switch (i%2) {
                case 0:
                    System.out.println("Hodnota " + i + " je parna.");
                    break;
                case 1:
                    System.out.println("Hodnota " + i + " je neparna.");
                    break;
                default:
                    System.out.println("Hodnota " + i + " nie je cele cislo.");
                    break;
            }
        }
        System.out.println();
    }

    //METODA SPOCITANIE
    public static void getSum(int[] numbers){
        int sum = 0;
        for( int i: numbers){
            sum = sum + i;
        }
        System.out.println("Sucet hodnot je: " + sum);

    }

    //METODA NASOBENIE
    public static void getMultiply(int[] numbers){
        int result = 1;
        for( int i: numbers){
            result = result * i;
        }
        System.out.println("Sucin hodnot je: " + result);

    }
}
