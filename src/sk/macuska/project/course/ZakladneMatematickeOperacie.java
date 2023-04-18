package sk.macuska.project.course;

import java.io.IOException;

public class ZakladneMatematickeOperacie {

    public static void main(String[] args) throws IOException {


        //DEKLARACIA A INICIALIZACIA PREMENNEJ
        double cislo1 = 2;
        double cislo2 = 3;


        //PRIRADENIE HODNOTY DO PREMENNEJ RESULT
        double resultScitanie = cislo1 + cislo2;
        double resultOdcitanie = cislo1 - cislo2;
        double resultNasobenie = cislo1 * cislo2;
        //PRETYPOVANIE PREMENNEJ
        double resultDelenie = cislo1 / cislo2;

        //VYPISANIE HODNOT DO KONZOLY
        System.out.printf("Výsledkom delenia hodnôt %.0f a %.0f je %.0f.%n", cislo1, cislo2, resultScitanie);
        System.out.printf("Výsledkom odčítania hodnôt %.0f a %.0f je %.0f.%n", cislo1, cislo2, resultOdcitanie);
        System.out.printf("Výsledkom násobenia hodnôt %.0f a %.0f je %.0f.%n", cislo1, cislo2, resultNasobenie);
        System.out.printf("Výsledkom delenia hodnôt %.0f a %.0f je %.2f.%n", cislo1, cislo2, resultDelenie);


        //************************************************************************
        //ZAVOLANIE METODY A VYPISANIE DO KONZOLY
        double result1 = scitanie(cislo1, cislo2);
        System.out.printf("Výsledkom delenia hodnôt %.0f a %.0f je %.0f.%n", cislo1, cislo2, result1);

        double result2 = odcitanie(cislo1, cislo2);
        System.out.printf("Výsledkom odčítania hodnôt %.0f a %.0f je %.0f.%n", cislo1, cislo2, result2);

        double result3 = nasobenie(cislo1, cislo2);
        System.out.printf("Výsledkom násobenia hodnôt %.0f a %.0f je %.0f.%n", cislo1, cislo2, result3);

        double result4 = delenie(cislo1, cislo2);
        System.out.printf("Výsledkom delenia hodnôt %.0f a %.0f je %.2f.%n", cislo1, cislo2, result4);

    }
    //VYTVOTENIE METOD
    public static double scitanie(double prveCislo, double druheCislo){
        return prveCislo + druheCislo;
    }
    public static double odcitanie(double prveCislo, double druheCislo){
        return prveCislo - druheCislo;
    }
    public static double nasobenie(double prveCislo, double druheCislo) {
        return prveCislo * druheCislo;
    }
    public static double delenie(double prveCislo, double druheCislo) {
        return prveCislo / druheCislo;
    }

}


   /* Vytvorte jednoduchý program, ktorého cieľom bude výpočet 4 základných matematických operácií a to na sčítanie, odčítanie, násobenie a delenie.
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.


        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítanie hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.


        Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?
     */
