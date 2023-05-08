package opakovanie.service;

import opakovanie.model.Kniha;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Trieda konciaca v nazve slovom Service riesi logiku konrektnej triedy, v nasom pripade modelu (triedy) Kniha
public class KnihaService {
    private Scanner scn = new Scanner(System.in);

    // Prazdny konstruktor
    public KnihaService() {
        // V konstruktore zadefinujeme, resp naplnime premenne, resp. objekty, cize nieco inicializujeme
        // Singleton
        if (scn == null) {
            scn = new Scanner(System.in);
        }
    }

    public KnihaService(Scanner scn) {
        this.scn = scn;
    }

    public void zobrazMenu () {
        System.out.println("\n        Menu s možnosťami\n" +
                "        -----------------\n" +
                "       1. Zadaj novú knihu\n" +
                "       2. Zobraz všetky knihy\n" +
                "       3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                "       4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                "       5. Zobraz počet všetkých kníh\n" +
                "       6. Vyhladaj knihu podla nazvu \n" +
                "       9. Vymaž všetky knihy\n" +
                "       Koniec = skončí zadávanie novej knihy");
    }
    public void pridajKnihu(ArrayList <Kniha> vsetkyKnihy){
       // Scanner scn = new Scanner (System.in);
        Kniha novaKniha = new Kniha(); // Vytvorime objekt knihy, cize prazdnu knihu
        System.out.println("Vybral si 1");

        System.out.println("Zadaj nazov knihy");
        novaKniha.setNazov(scn.nextLine());
        //String nazovKnihy = scn.nextLine(); // Pozadujeme od pouzivatela nazov knihy

        System.out.println("Zadaj meno autora");
        novaKniha.setAutor(scn.nextLine());

        System.out.println("Zadaj rok vydania");
        novaKniha.setRokVydania(scn.nextInt());
        //int rokVydania = scn.nextInt();

        vsetkyKnihy.add(novaKniha);
    }
    public void zobrazVsetkyKnihy(ArrayList <Kniha> vsetkyKnihy) {
        System.out.println("Vybral si 2");
        // Testujeme ci je kniznica, teda vsetky knihy, cize  Array list prazdny  a to cez  metodu isEmpty()
        if (vsetkyKnihy.isEmpty()) System.out.println("Kniznica je prazdna");

        // Hint: foreach
        for (Kniha konkretnaKniha : vsetkyKnihy) {
            //System.out.println("Nazov knihy: "+ konkretnaKniha.getNazov());
            //System.out.println("Autor: " + konkretnaKniha.getAutor());
            //System.out.println("Rok Vydania: "+ konkretnaKniha.getRokVydania());
            System.out.println(konkretnaKniha);
        }
    }
    public void zobrazKnihuPodlaIndexu (ArrayList <Kniha> vsetkyKnihy){
      //  Scanner scn = new Scanner(System.in);
        try {
            //funkcionalita tohto menu je nasledujuca: Zobraz konkretnu knihu (podla indexu)\n
            System.out.println("Zadaj index knihy, ktoru chces zobrazit (pozn. od 1 po N)");
            int indexKnihy = scn.nextInt(); // od pouzivatela vyzadujeme index knihy, tj. preto scn.nextInt()

            // Knihy, resp index v Arrayliste implicitne  zacina hodnotou 0, nie 1, preto nizsie pouzijeme syntax indexKnihy-1
            Kniha najdenaKniha = vsetkyKnihy.get(indexKnihy - 1); // Tymto zapisom sme ziskali knihu podla jeho indexu
            //sout "toto sa vykona?"
            System.out.println(najdenaKniha); //Tym, ze v triede Kniha mame metodu toString tak ju mozeme vypisat takto priamo
        } catch (InputMismatchException e) {
            System.out.println("Zadal si pismeno namiesto ciselneho indexu");
            // throw new RuntimeException(e);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Zadal si neexistujuce cislo indexu");
        } catch (Exception e) {
            System.out.println("Neznama chyba");
        }
    }

}
