/*
package Ulohy;
import java.util.Random;
import java.util.Scanner;
*/
/*
Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10. Používateľ musí uhádnuť číslo. Ak uhádne menšie,
        tak mu Java vypíše Neuhádol si, moje číslo je väčšie, analogicky Neuhádol si, moje číslo je menšie a pri úspešnom uhádnutí BINGO! Uhádol si!
        Bonusová úloha:        Ak si trúfate, doplňte algoritmus hádania dovtedy, kým neuhádne.
*//*

public class HadajCislo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random(System.in);
        int CisloNaHadanie = r.nextInt(10) + 1;
        int TipovaneCislo;
                System.out.println("Napis cislo od 1 do 10 : ");
        TipovaneCislo = input.nextInt();


        String cislo = input.nextLine();
        if (input > cislo) {
            System.out.println("Neuhádol si, moje číslo je väčšie");

        } else if (input < cislo) {
            System.out.println("Neuhádol si, moje číslo je menšie");
        }

    }

}
*/
