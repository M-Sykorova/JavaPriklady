package sk.macuska.project.course.oop.zamestnanci;

import java.util.ArrayList;

public class DatabazaZamestnancov {
    public static void main(String[] args) {
        Zamestnanec zamestnanec1 = new Zamestnanec("Maca", "Sykorova", 'm', 1994);

        ArrayList<Zamestnanec> arrZamestnancov = new ArrayList<>();
        arrZamestnancov.add(zamestnanec1);

        System.out.println("Vypisujem zamestnancov cez for each:");
        for(Zamestnanec konkretnyZamestnanec: arrZamestnancov){
            System.out.println(konkretnyZamestnanec.getMeno());
            System.out.println(konkretnyZamestnanec.getPriezvisko());
            System.out.println(konkretnyZamestnanec.getPohlavie());
            System.out.println(konkretnyZamestnanec.getRokNarodenia());
        }
    }
}
