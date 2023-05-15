package opakovanie.rozhranie;

// Nadtrieda (rodičovská trieda)
class Tvar {
    protected String farba;

    public Tvar(String farba) {
        this.farba = farba;
    }

    public void vykresli() {
        System.out.println("Vykresľujem tvar.");
    }
}

// Podtrieda (dedená trieda)
class Kruh extends Tvar {
    private double polomer;

    public Kruh(String farba, double polomer) {
        super(farba);
        this.polomer = polomer;
    }

    public void vykresli() {
        System.out.println("Vykresľujem kruh s polomerom: " + polomer);
    }

    public double vypocitajObsah() {
        return Math.PI * polomer * polomer;
    }
}

public class RozhranieMain {
    public static void main(String[] args) {
        // Vytvorenie objektu triedy Kruh
        Kruh kruh = new Kruh("červená", 5.0);

        // Volanie metód na objekte kruh
        kruh.vykresli();
        System.out.println("Obsah kruhu: " + kruh.vypocitajObsah());
    }
}