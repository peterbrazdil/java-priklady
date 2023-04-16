package opakovanie;

// Vytvorte program, ktory nacita z pola ciselne cele hodnoty a vyplnte, ci je dana hodnota parna alebo neparna
public class Pole {
    public static void main(String[] args) {
        int[] cisla = {1, 8, 10, 0, 97}; // Hranate zatvorky urcuju, ze sa jedna o "staticke" pole

// Prechdzame jednotlivymi polozkami (teda cislami) pole ...
        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[i]); // ...  a vypiseme ich do konzoly
            // TODO Nastavit logiku, ktoru vypise ci je cislo parne alebo nie
            // Riesenie: Ak je cislo delitelne 2-mi tak je parne, a ak nie, tak je neparne.
            // Mozeme pouzit IF, ELSE a modulo

            if (cisla[i] % 2 == 0) {
                System.out.println("cislo " + cisla[i] + " je parne");
            } else {
                System.out.println("cislo " + cisla [i] + " je neparne");
            }


        }
    }
}
