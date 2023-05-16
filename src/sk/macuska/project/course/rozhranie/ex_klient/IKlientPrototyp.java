package sk.macuska.project.course.rozhranie.ex_klient;

public interface IKlientPrototyp {
    int akoCastoNavstevujeDanuSluzbu(); /* Zistujeme pocet navstev danej sluzby */
    boolean jePocitacovoGramotny();
    void zobrazOsobneUdaje(Klient klient);
}
