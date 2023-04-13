public class Pole {
    public static void main(String[] args) {
        String[] auta = {"Honda", "Audi", "BMW"};
        //CYKLUS S PEVNYM POCTOM OPAKOVANI, VYPISANIE OBSAHU POLA
        for(int i = 0; i < auta.length; i++){
            System.out.println(auta[i]);
        }
        //FOREACH, EFEKTIVNEJSI SPOSOB VYPISOVANIE POLA
            for(String auto: auta) {
                System.out.println(auto);
            }

            int[] celeHodnoty = {1, 8, 10, 11, 12};
            //FOREACH FUNGUJE AJ NA PRIMITIVNE TYPY
        for(int celaHodnota: celeHodnoty) {
            System.out.println(celaHodnota);
        }

        //PRIKLAD NA SCITANIE
        double[] hodnoty = {1.90, 8, 10, 12, 15};
        double sum = 0;
        for (int i = 0; i < hodnoty.length; i++) {
            sum = sum + hodnoty[i];
        }
        System.out.println("Sucet je " + sum);

        for(double hodnota: hodnoty){
            System.out.println(hodnota);
        }



    }




}
