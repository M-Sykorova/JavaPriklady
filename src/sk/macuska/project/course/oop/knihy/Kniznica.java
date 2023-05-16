/*Vytvorte knižnicu (Kniznica), kde bude môcť používateľ zadať knihy (názov, autora, rok vydania) cez konzolu kým nezadá
        slovo quit. Tie na konci vypíšeme. Opakovanie na ArrayList.

        Menu s možnosťami
        Zadaj novú knihu
        Zobraz všetky knihy
        Zobraz konkrétnu knihu (podľa indexu)
        Vymaž konkrétnu knihu (podľa indexu)
        Zobraz počet všetkých kníh
        9. Vymaž všetky knihy
        Koniec = skončí zadávanie novej knihy

 */

package sk.macuska.project.course.oop.knihy;

import sk.macuska.project.course.opakovanie.kniha.model.Kniha;
import sk.macuska.project.course.opakovanie.kniha.service.KnihaService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kniznica {
    public static void main(String[] args) {

        ArrayList<Kniha> vsetkyKnihy = new ArrayList<>();

        while (true) {
            //AK CHCEME VOLAT METODY Z INEJ TRIEDY, TAK MUSIME NAJPRV VYTVORIT OBJEKT, KTORY VLOZIME DO PREMENNEJ
            //CIZE V TOMTO PRIPADE SME VYTVORILI OBJEKT knihaService A VLOZILI HO DO PREMENNEJ knihaService
            KnihaService knihaService = new KnihaService();
            knihaService.zobrazMenu();

            Scanner scanner = new Scanner(System.in);
            String menu = scanner.nextLine();


            if (menu.equals("1")){
                knihaService.pridajKnihu(vsetkyKnihy);

            } else if (menu.equals("2")){
                knihaService.zobrazVsetkyKnihy(vsetkyKnihy);

            } else if (menu.equals("3")){
                knihaService.zobrazKnihuPodlaIndexu(vsetkyKnihy);

            } else if (menu.equals("4")){
                try {
                    System.out.println("Vymaž konkrétnu knihu (podľa indexu)");
                    System.out.println("Knihu na ktorom indexe chces vymazat?");
                    int index = scanner.nextInt();
                    vsetkyKnihy.remove(index);
                } catch (InputMismatchException e) {
                    System.out.println("Zadal si písmeno namiesto číselného indexu");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Zadal si neexistujúce číslo indexu");
                } catch (Exception e) {
                    System.out.println("Neznáma chyba!");
                }



            } else if (menu.equals("5")) {
                System.out.println("Zobraz počet všetkých kníh");
                System.out.println(vsetkyKnihy.size());

            } else if(menu.equals("6")){
                System.out.println("Zadaj nazov hladanej knihy");
                String hladanyNazovKnihy = scanner.nextLine();
                boolean jeNajdena = false;
                for(Kniha kniha: vsetkyKnihy){
                    if(kniha.getNazov().contains(hladanyNazovKnihy)){
                        System.out.println("Kniha zodpoveduca hladaniu: " + kniha);
                        jeNajdena = true;
                    }
                }
                if (jeNajdena == false) {
                    System.out.println("Nebola najdena ziadna kniha podla nazvu.");
                }


            } else if (menu.equals("9")){
                System.out.println("Vymaž všetky knihy");
                vsetkyKnihy.clear();


            } else if (menu.equals("koniec")){
                System.out.println("skončí zadávanie novej knihy");
            } else {
                System.out.println("Nezadal si platny znak");
            }
        }
    }
}
