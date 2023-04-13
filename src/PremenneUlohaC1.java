import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PremenneUlohaC1 {
    public static void main(String[] args) {

        float znamka = 1.5f;
        int rok = 2023;

        LocalDate localDate = LocalDate.of(2000, 4, 3);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//      String datumNarodenia = "03.04.2000";

        Date datum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");


        System.out.println("Student Marcela Sykorova sa narodila " + localDate.format(df) +
                ", z maturitnej skusky ma znamku " +  String.valueOf(znamka).replace('.', ',') +
                " a\nod septembra " + rok + " nastupi do noveho zamestnania ako Java programator.\n" +
                "V Bratislave dna " + formatDatumu.format(datum) + ".");


        System.out.printf("%.1f%n",znamka);

        System.out.printf("Som Maca, mam %d rokov a mam %d %s", 28, 4, "macky");
    }

}

