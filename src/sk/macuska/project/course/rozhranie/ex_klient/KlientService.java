package sk.macuska.project.course.rozhranie.ex_klient;

import sk.macuska.project.course.rozhranie.ex_klient.IKlientPrototyp;
import sk.macuska.project.course.rozhranie.ex_klient.Klient;

public class KlientService implements IKlientPrototyp {

    @Override
    public int akoCastoNavstevujeDanuSluzbu() {
        return 0;
    }

    @Override
    public boolean jePocitacovoGramotny() {
        return false;
    }

    @Override
    public void zobrazOsobneUdaje(Klient klient) {
        System.out.println(klient);
    }
}
