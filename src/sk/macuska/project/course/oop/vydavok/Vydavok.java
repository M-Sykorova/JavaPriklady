package sk.macuska.project.course.oop.vydavok;

public class Vydavok {
    private String nazov;
    private double suma;
    private boolean jeOsobny;

    public Vydavok() {
        this.nazov = "chlieb";
        this.suma = 2.3;
        this.jeOsobny = false;
    }

    public Vydavok(String nazov, double suma, boolean jeOsobny) {
        this.nazov = nazov;
        this.suma = suma;
        this.jeOsobny = jeOsobny;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public boolean isJeOsobny() {
        return jeOsobny;
    }

    public void setJeOsobny(boolean jeOsobny) {
        this.jeOsobny = jeOsobny;
    }

    @Override
    public String toString() {
        return (nazov + " " + suma + " " + jeOsobny);
    }
}
