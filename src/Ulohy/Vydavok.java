package Ulohy;

public class Vydavok {
    private String nazov;
    private double suma;
    private boolean jeOobny;

    // Prazdny konstruktor
    public Vydavok() {

        this.nazov = "Chlieb";
        this.suma = 2.2;
    }

    // konstruktor
    public Vydavok(String nazov, double suma, boolean jeOobny) {
        this.nazov = nazov;
        this.suma = suma;
        this.jeOobny = jeOobny;
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

    public boolean isJeOobny() {
        return jeOobny;
    }

    public void setJeOobny(boolean jeOobny) {
        this.jeOobny = jeOobny;
    }
}
