package sk.macuska.project.course.rozhranie.ex_klient;

public class EvidenciaKlientovMain {
    public static void main(String[] args) {
        Klient klient1 = new Klient();
        klient1.setMeno("Ján");
        klient1.setPriezvisko("Žitniak");

        KlientService klientService = new KlientService();
        klientService.zobrazOsobneUdaje(klient1);

    }
}
