import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double cislo1;
        double cislo2;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj čísla:");

        cislo1 = scanner.nextDouble();
        cislo2 = scanner.nextDouble();

        System.out.println("Zadaj operátor");

        operator = scanner.next().charAt(0);

        scanner.close();

        double result;
        if(operator == '+'){
            result = cislo1 + cislo2;
            System.out.println("Výsledok sčítaných čísel: " + result);
        } else if(operator == '-'){
            result = cislo1 - cislo2;
            System.out.println("Výsledok odčítaných čísel: " + result);
        } else if(operator == '*'){
            result = cislo1 * cislo2;
            System.out.println("Výsledok vynásobených čísel: " + result);
        } else if(operator == '/'){
            if(cislo2 != 0){
                result = cislo1 / cislo2;
                System.out.println("Výsledok vydelených čísel: " + result);
            } else {
                System.out.println("Táto operácia sa nedá vykonať.");
            }
        }
    }
}
// TODO: 27. 3. 2023 prerobit na switch