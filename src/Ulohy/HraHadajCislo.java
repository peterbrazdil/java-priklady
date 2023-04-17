package Ulohy;
/*
Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10. Používateľ musí uhádnuť číslo. Ak uhádne menšie,
        tak mu Java vypíše Neuhádol si, moje číslo je väčšie, analogicky Neuhádol si, moje číslo je menšie a pri úspešnom uhádnutí BINGO! Uhádol si!
        Bonusová úloha:        Ak si trúfate, doplňte algoritmus hádania dovtedy, kým neuhádne.
*/

import java.util.Random;
import java.util.Scanner;

public class HraHadajCislo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Inicializacia skeneru, resp. konzoly pre pouzivatelsky vstup (scn je premenna)
        Random r = new Random(); // vytvorili sme objekt a vlozili do r
        int maximalnaHodnota = 10;
        int minimalnaHodnota = 1;
        int nahodneCisloGenerovaneJavou = r.nextInt(maximalnaHodnota - minimalnaHodnota + 1) + minimalnaHodnota;
        System.out.println("CHEAT: Vygerenoval som taketo nahodne cislo " + nahodneCisloGenerovaneJavou);
        // Zaciatok Opakovania!
       int zadaneCisloPouzivatelom = 0; // Priamo v konzole zobrazi, resp pozaduje zadanie cisla
        while (nahodneCisloGenerovaneJavou != zadaneCisloPouzivatelom) {
          //while(true) {
            System.out.println("Zadaj čislo od 1  do 10 a potvrd ENTER");
            zadaneCisloPouzivatelom = scn.nextInt(); // Priamo v konzole zobrazi, resp pozaduje zadanie cisla(nemoze byt znovu INT)
            if (nahodneCisloGenerovaneJavou == zadaneCisloPouzivatelom) {
                System.out.println("Áno, uhadol si! ");
            //    break; // Prikazom break prerusime cyklus
            } else if (nahodneCisloGenerovaneJavou > zadaneCisloPouzivatelom) {
                System.out.println("Nie, neuhadol si, moje vygenerovane čislo je väčšie!");
            } else {
                System.out.println("Nie, neuhadol si, moje vygenerovane číslo je menšie");
            }
        }
        // Koniec opakovania!
    }
}

