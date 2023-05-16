package sk.macuska.project.course.dedicnost.ex_vozidlo;

public class Auto extends Vozidlo {
        private final int POCET_SEDADIEL = 5;

        public Auto() {
            super.kolkoSedadielMas(POCET_SEDADIEL);
        }

        @Override
        public void akeSiVozidlo() {
            System.out.println("Som auto!");
        }
}
