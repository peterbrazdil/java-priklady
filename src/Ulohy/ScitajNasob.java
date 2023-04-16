package Ulohy;

/*
Úloha na opakovanie: Premenné, cykly a jednoduchý algoritmus na súčet
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať,
         čiže výsledkom bude celkový súčet hodnôt.
        Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať
        výsledok po sčítaní.
        Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu nasob(), ktorá bude násobiť dané čísla.
*/
public class ScitajNasob {
    public static void main(String[] args) {
        int[] cisla = {1, 8, 9, 10, 12};
        int sum = 0; // Implicitna, zaciatocna hodnota
        // Funkcia scitania hodnot pola
        // Cyklus oznacovany ako foreeach prechadza kazdym pvkom pola
        for (int cislo : cisla) { // Cislo je kazde cislo pola "cisla"
            // sum = sum + cislo;
            sum += cislo; // Je to identicka logika scitania ako pri riadku vyssie
            // System.out.println(cislo); // Vypiseme obsah kazdeho prvku pola
        }
        System.out.println("Vysledok scitania je: " + sum);

        // TODO Funkcia nasobenia hodnot pola
        // * pre nasobenie a / pre delenie
        int nas = 1;
        for (int cislo : cisla) {
            nas *= cislo;
        }
            System.out.println("Vysledok nasobenia je: " + nas);

    }
}
