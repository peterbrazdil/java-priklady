package Ulohy;

public class DatabazaVydavkov {
    public static void main(String[] args) {
        Vydavok vydavok1 = new Vydavok("Kava", 1.80, true);
        System.out.println(vydavok1.getNazov());
        System.out.println(vydavok1.getSuma());
        System.out.println(vydavok1.isJeOobny());
        System.out.println(); // prazdny riadok

        Vydavok vydavok2 = new Vydavok();
        vydavok2.setNazov("Cola (=Šofokola)");
        vydavok2.setSuma(5.0);
        vydavok2.setJeOobny(false);

        System.out.println(vydavok2.getNazov());
        System.out.println(vydavok2.getSuma());
        System.out.println(vydavok2.isJeOobny());
        System.out.println(); // prazdny riadok

        Vydavok vydavok3 = new Vydavok();
        System.out.println(vydavok3.getNazov());
        System.out.println(vydavok3.getSuma());
    }
}
