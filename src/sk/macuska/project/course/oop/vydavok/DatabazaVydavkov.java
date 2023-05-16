package sk.macuska.project.course.oop.vydavok;

public class DatabazaVydavkov {
    public static void main(String[] args) {
        Vydavok vydavok1 = new Vydavok("kava", 1.80, true);
        System.out.println(vydavok1.getNazov());
        System.out.println(vydavok1.getSuma());
        System.out.println(vydavok1.isJeOsobny());

        Vydavok vydavok2 = new Vydavok();
        vydavok2.setNazov("Cola");
        vydavok2.setSuma(5.0);
        vydavok2.setJeOsobny(false);

        System.out.println(vydavok2.getNazov());
        System.out.println(vydavok2.getSuma());
        System.out.println(vydavok2.isJeOsobny());

        Vydavok vydavok3 = new Vydavok();
        System.out.println(vydavok3.getNazov());
        System.out.println(vydavok3.getSuma());
        System.out.println(vydavok3.isJeOsobny());

        System.out.println(vydavok3);;
    }
}
