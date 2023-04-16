/*
ZADANIE:
Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný, dobrý, dostatočný,
nedostatočný vypíše zodpovedajúcu známku čiže 1, 2, 3, 4, 5.
*/

import java.text.Normalizer;
import java.util.Scanner;

public class PriradTextoveHodnotenieKCiselnemu {

    public static String odstranDiakritiku(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
    public static void main(String[] args) {
        String slovnaZnammka = ""; // slovnaZnamka na zaciatku nema ziadne slovne hodnotenie,text je prazdny, cize ""

        // START, cyklus zacne
        while (!slovnaZnammka.equals("koniec")) {
            //while (true) { // cyklus pojde do nekonecna, pretoze while obsahuje v sebe true
            System.out.println("Zadaj slovnú známku (výborný, chválitebný, dobrý, dostatočný, nedostatočný)");
            System.out.println("Poznámka: Po zadani príkazu 'koniec' program ukončí svoju činnosť");

            Scanner scn = new Scanner(System.in); // inicializujeme konzolu pre vstup hodnoty od pouzivatela
            slovnaZnammka = scn.nextLine(); //scn.nextLine() v konzole zobrazi kurzor a poziada pouzivatela o vstupnu text. hodnotu

            // Ak chceme vyhodnotit 2 a viac podmienok, ktore platia jedna ALEBO druha, tak pouzijeme || (tzv. pipe=rúra = ALTGR+W)
            // Pipe je ekvivalentnom prikazu OR z inych programovacich jazykov
            // Pozn.: Pre prikaz AND existuje javovsky zapis
            // TOD ako vyriesit diakritiku
            // Riesenie: Zo slovnej znamky odstranime diakritiku a prerobime funcnost IF, aby porovnavala hodnoty bez diaktritiky

            slovnaZnammka = odstranDiakritiku(slovnaZnammka);
            //System.out.println("Slovná známka už bez diakrititky vyzerá takto: " + slovnaZnammka);
            //slovnaZnammka = slovnaZnammka.toLowerCase(); // Prikaz toLowerCase prekonvertuje text na male pismena
            //System.out.println("Slovná známka po zmene na malé písmená vyzerá takto: " + slovnaZnammka);
            //slovnaZnammka = slovnaZnammka.toUpperCase();
            //System.out.println("Slovná známka po experimente s 2 metodami (príkazmi) vyzerá takto: " + slovnaZnammka);

            if (slovnaZnammka.equalsIgnoreCase("vyborny")) {
                System.out.println(1);
            } else if (slovnaZnammka.equalsIgnoreCase("chvalitebny")) {
                System.out.println(2);
            } else if (slovnaZnammka.equalsIgnoreCase("dobry")) {
                System.out.println(3);
            } else if (slovnaZnammka.equalsIgnoreCase("dostatocny")) {
                System.out.println(4);
            } else if (slovnaZnammka.equalsIgnoreCase("nedostatocny")) {
                System.out.println(5);

            } else {
                System.out.println("Zadaná známka neexistuje!");
            }
        }
        // Koniec cyklu
    }
}
