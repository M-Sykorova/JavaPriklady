package sk.macuska.project.course.oop.knihy;

public class Kniha {
    private String nazov;
    private String autor;
    private String zaner;
    private String vydavatelstvo;
    private int pocetStran;


    public Kniha() {
    }

    public Kniha(String nazov, String autor, String zaner, String vydavatelstvo, int pocetStran) {
        this.nazov = nazov;
        this.autor = autor;
        this.zaner = zaner;
        this.vydavatelstvo = vydavatelstvo;
        this.pocetStran = pocetStran;
    }


    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    public String getVydavatelstvo() {
        return vydavatelstvo;
    }

    public void setVydavatelstvo(String vydavatelstvo) {
        this.vydavatelstvo = vydavatelstvo;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }
}
