package sk.macuska.project.course.swing.easy_repository;

public class Produkt {
    private static int idCounter = 1;
    private int id;
    private String nazov;
    private int pocetkusov;


    public Produkt(String nazov, int pocetkusov) {
        this.id = idCounter;
        this.nazov = nazov;
        this.pocetkusov = pocetkusov;
        idCounter++;
    }


    public static int getNextId(){
        return idCounter;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getPocetkusov() {
        return pocetkusov;
    }

    public void setPocetkusov(int pocetkusov) {
        this.pocetkusov = pocetkusov;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", nazov: " + nazov + ", pocet ks na sklade: " + pocetkusov + "\n";
    }
}
