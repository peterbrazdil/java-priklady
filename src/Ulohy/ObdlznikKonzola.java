package Ulohy;
/*Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom.
        Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class ObdlznikKonzola {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = 0;
        double b = 0;
        try {
            System.out.println("Zadaj stranu a");
            a = scn.nextDouble();
            System.out.println("Zadaj stranu b");
            b = scn.nextDouble();
        }catch (InputMismatchException e) {
            // Tu dopisem vlastny ko, ktory naraba s chybou
            System.out.println("Zadali ste nespravny format hodnoty: ");

        }

        System.out.println("Obvod prveho obdlznika je: " + Obdlznik.vypocitajObvod(a, b));
        System.out.println("Obsah prveho obdlznika je: " + Obdlznik.vypocitajObsah(a, b));


    }
}
