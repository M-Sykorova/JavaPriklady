package sk.macuska.project.course;

public class Premenne {
    public static void main(String[] args) {
        String meno = "Marcela";
        int celeCislo = 123;
        float desatinneCislo = 234.56f;
        double des = 2.33;
        char znak = '9';
        boolean jeDnesStreda = true;
        int celeCislo2;
        celeCislo2 = 456;
        int celeCislo3 = 789;
        celeCislo3 = 0;   //naplnili sme premennu celeCislo3 hodnotou 0, zmenili sme pov.hodnotu 789


        double cenaBezDPH = 1000.0;
        double cenaSDPH = 0.0;

        cenaSDPH = cenaBezDPH * 1.20;
        System.out.println("Cena bez DPH: " + cenaBezDPH);
        System.out.println("Cena s DPH: " + cenaSDPH);


        System.out.println("Meno: " + meno);
        System.out.println("Cele cislo" + celeCislo);
        System.out.println("Desatinne cislo" + desatinneCislo);
        System.out.println("Desatinne cislo ako double" + des);
        System.out.println("Vypisany znak" + znak);
        System.out.println("Je dnes streda?" + jeDnesStreda);

        System.out.println("Vysvetluje to nasledovna citacia:");
        System.out.println("£%^&*#?@§°&£) \"Toto je citacia v uvodzovkach\"");



    }
}
