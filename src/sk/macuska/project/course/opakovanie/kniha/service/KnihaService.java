package sk.macuska.project.course.opakovanie.kniha.service;

import sk.macuska.project.course.opakovanie.kniha.model.Kniha;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KnihaService {
    private Scanner scanner;

    //PRAZDNY KONSTRUKTOR
    public KnihaService() {
        //V KONTRUKTORE ZADEFINUJEME RESP. NAPLNIME PREMENNE, RESP.OBJEKTY, CIZE NIECO INICIALIZUJEME
        //KONSTRUKTOR SLUZI NA INICIALIZACIU UDAJOV TRIEDY
        scanner = new Scanner(System.in);
        //VYTVARA SA LEN KED JE PRAZDNY
        //SINGLETON
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    public void zobrazMenu(){
        System.out.println("Menu s možnosťami:\n" +
                "        1. Zadaj novú knihu\n" +
                "        2. Zobraz všetky knihy\n" +
                "        3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                "        4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                "        5. Zobraz počet všetkých kníh\n" +
                "        6. Vyhladaj knihu podla nazvu\n" +
                "        9. Vymaž všetky knihy\n" +
                "        Koniec = skončí zadávanie novej knihy");
    }

    public void pridajKnihu(ArrayList<Kniha> vsetkyKnihy){
        Kniha kniha = new Kniha();

        System.out.println("Zadaj novú knihu");
        kniha.setNazov(scanner.nextLine());

        System.out.println("Zadaj autora");
        kniha.setAutor(scanner.nextLine());

        System.out.println("Zadaj rok vydania");
        kniha.setRokVydania(scanner.nextInt());

        vsetkyKnihy.add(kniha);
    }

    public void zobrazVsetkyKnihy(ArrayList<Kniha> vsetkyKnihy){
        System.out.println("Zobraz všetky knihy");
        if(vsetkyKnihy.isEmpty()){
            System.out.println("Kniznica je prazdna.");
        }
        for( Kniha kniha: vsetkyKnihy){
            System.out.println(kniha);
        }
    }

    public void zobrazKnihuPodlaIndexu(ArrayList<Kniha> vsetkyKnihy){
        try {
            System.out.println("Zobraz konkrétnu knihu (podľa indexu)");
            System.out.println("Knihu na ktorom indexe chces zobrazit?");
            int index = scanner.nextInt();
            System.out.println(vsetkyKnihy.get(index));
        } catch (InputMismatchException e) {
            System.out.println("Zadal si písmeno namiesto číselného indexu");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Zadal si neexistujúce číslo indexu");
        } catch (Exception e) {
            System.out.println("Neznáma chyba!");
        }
    }

}
