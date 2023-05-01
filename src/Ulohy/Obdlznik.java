package Ulohy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod),
        druhá na výpočet jeho obsahu (vypocitajObsah).*/
public class Obdlznik {
    public static double vypocitajObvod(double StranaA, double StranaB) { // syntax metody (bez STATIC by som nevedel
        // vyvolat metodu, ale mozem si vytvorit vela objektov)
        return 2 * (StranaA + StranaB);
    }
    public static double vypocitajObsah(double StranaA, double StranaB) { // syntax metody
        return (StranaA * StranaB);
    }

    public static void main(String[] args) {
        double a = 2; // Strana a
        double b = 3; // Strana b

        Obdlznik obdlznik1 = new Obdlznik(); // Vytvorili sme objekt (=instanciu tiedy) Obdlznik
        System.out.println("Obvod obdlznika je: " + obdlznik1.vypocitajObvod(a, b)); // vyvolali sme metodu (moze byt aj bez Obdlznik.)
        System.out.println("Obsah obdlznika je: " + obdlznik1.vypocitajObsah(a, b)); // vyvolali sme metodu (cez vytvoreny objekt)

        Obdlznik obdlznik2 = new Obdlznik();
        System.out.println("Obsah obdlznika je: " + obdlznik2.vypocitajObsah(a, b));
    }

    // Vlozime jUnit test
    // Otestujeme funkcnost metody vypocitajObvod
    @Test
    void otestujVypocitajObvod() {
        // Metoda assertEquals vyzaduje zadanie 2 aurgumentov, prvy je spravna (skutocna) hodnota, ktoru ocakavame ako ludia
        // Druhy argument je volanie metody, ktoru testujeme. Ta tiez vrati hodnotu, ktoru vlastne porovnava s tou skutocnou.
        assertEquals(10.0, vypocitajObvod(2, 3));
        assertEquals(3.0, vypocitajObvod(1, 2));
    }
    // Otestujeme funkcnost metody vypocitajObvod
    @Test
    void otestujVypocitajObsah() {
        assertEquals(4.0, vypocitajObsah(2, 2));
        assertEquals(6.0, vypocitajObsah(2, 3));
}}
