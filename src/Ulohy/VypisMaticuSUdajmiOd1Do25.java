/*
Vypíš maticu s údajmi od 1 do 25
        Vytvorte (vypíšte) maticu údajov do konzoly, ktoré budú vyzerať nasledovne:
        1        2        3        4
        5        6        7        8        9        10
        11        12        13        14        15
        16        17        18        19        20
        21        22        23        24        25
*/

package Ulohy;

public class VypisMaticuSUdajmiOd1Do25 {
    public static void main(String[] args) {
        // Vypoctove operatory porovnania v ramci IF su nasledovne:
        // > vacsie
        // < mensie
        // >= vacsie a rovna sa
        // <= mensie a rovna sa
        // == rovna sa

        final int MAX = 25; // "final" je klucove slovo pre vytvorenie konstanty (konstanty sa pisu velkymi pismenami)
        //int MAX=125;
        // MAX = 10; // max mozem zmenit  bez int, ale neda sa zmenit pri "final"

        // Riesenie cislo 1:
        for (int i = 1; i <= MAX; i++) {
            // Ked i nadobudne hodnotu 7 a viac, tak je v nasom pripade hned splnena prva podmienka

            if (i == 6 || i == 11 || i == 16 || i == 21) {
                System.out.println(); // novy riadok aj pri 7cke aj pri 8cke
            }
            System.out.print(i + " ");
        }
        System.out.println("\n\n"); // vlozi nove 2 riadky

        // Riesenie cislo 2 cez modulo:
        for (int i = 1; i <= MAX; i++) {
            // Ked i nadobudne hodnotu 7 a viac, tak je v nasom pripade hned splnena prva podmienka
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }

        // Bonusová úloha: Vytvorte obdobnú maticu, ktorá bude obsahovať 2-násobok tej predchádzajúcej:
        int j = 1;
        for (int i = 1; i <= MAX; i++) {
            if (i % 5 == 0)  {
                System.out.println(j);

            }else{
                System.out.print(j + " ");
            }
            j = j * 2;
        }
    }
}

