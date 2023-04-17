package Ulohy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod),
        druhá na výpočet jeho obsahu (vypocitajObsah).*/
public class Obdlznik {
    public static double vypocitajObvod(double StranaA, double StranaB) { // syntax metody
        return 2 * (StranaA + StranaB);
    }

    public static void main(String[] args) {
        double a = 2; // Strana a
        double b = 3; // Strana b
        System.out.println("Obvod obdlznika je: " + vypocitajObvod(a, b)); // vyvolali sme metodu
    }

    // Vlozime jUnit test
    // Otestujeme funkcnost metody vypocitajObvod
    @Test
    void otestujVypocitajObvod(){
        assertEquals(10.0, vypocitajObvod(2, 3));
        assertEquals(3.0, vypocitajObvod(1, 2));

}}
