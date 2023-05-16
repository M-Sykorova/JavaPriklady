package sk.macuska.project.course.dedicnost.ex_vozidlo;

public class Motorka extends Vozidlo {
        private final int POCET_SEDADIEL = 2;

        public Motorka() {
            super.kolkoSedadielMas(POCET_SEDADIEL);
        }

        @Override
        public void akeSiVozidlo() {
            System.out.println("Som motorka!");
        }
}
