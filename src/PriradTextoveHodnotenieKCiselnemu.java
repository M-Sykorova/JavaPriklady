import java.text.Normalizer;
import java.util.Scanner;

public class PriradTextoveHodnotenieKCiselnemu {

    public static String odstranDiakritiku(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
    public static void main(String[] args) {

        String slovnaZnamka = "";


        Scanner scanner = new Scanner(System.in);

        slovnaZnamka = odstranDiakritiku(slovnaZnamka);
 //       System.out.println("Slovná známka bez diaktritiky vyzerá takto: " + slovnaZnamka);

       /*

       do{
            System.out.println("Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný).");
            slovnaZnamka = scanner.nextLine();
            if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("výborný"))){
                System.out.println(1);
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("chválitebný"))){
                System.out.println(2);
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("dobrý"))){
                System.out.println(3);
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("dostatočný"))){
                System.out.println(4);
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("nedostatočný"))){
                System.out.println(5);
            } else {
                System.out.println("Pre zadanú známku neexistuje číselná hodnota!");
            }
        } while (!slovnaZnamka.equals("koniec"));
        scanner.close();
        todo: na konci pise poslednu vetu v else - nizsie v cykle while to je vyriesene, tu to dorob
        */


        /*

        while(!slovnaZnamka.equals("koniec")) {

            System.out.println("Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný).");
            slovnaZnamka = scanner.nextLine();

            if(slovnaZnamka.equals("koniec")){
                break;
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("výborný"))){
                System.out.println(1);
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("chválitebný"))){
                System.out.println(2);
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("dobrý"))){
                System.out.println(3);
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("dostatočný"))){
                System.out.println(4);
            } else if (slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("nedostatočný"))){
                System.out.println(5);
            } else {
                System.out.println("Pre zadanú známku neexistuje číselná hodnota!");
            }
        }
        scanner.close();

         */

        while(!slovnaZnamka.equalsIgnoreCase(odstranDiakritiku("koniec"))){

            System.out.println("Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný).");
            slovnaZnamka = scanner.nextLine();

            switch (odstranDiakritiku(slovnaZnamka).toLowerCase()){
                case "vyborny":
                    System.out.println(1);
                    break;
                case "chvalitebny":
                    System.out.println(2);
                    break;
                case "dobry":
                    System.out.println(3);
                    break;
                case "dostatocny":
                    System.out.println(4);
                    break;
                case "nedostatocny":
                    System.out.println(5);
                    break;
                case "koniec":
                    break;
                default:
                    System.out.println("Pre zadanú známku neexistuje číselná hodnota!");
                    break;
            }
        }
    }
}
