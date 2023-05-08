package opakovanie;
/*Vytvorte knižnicu (Kniznica), kde bude môcť používateľ zadať knihy (názov, autora, rok vydania) cez konzolu kým nezadá
slovo quit. Tie na konci vypíšeme. Opakovanie na ArrayList.
        Menu s možnosťami
        -----------------
        Zadaj novú knihu
        Zobraz všetky knihy
        Zobraz konkrétnu knihu (podľa indexu)
        Vymaž konkrétnu knihu (podľa indexu)
        Zobraz počet všetkých kníh
        9. Vymaž všetky knihy
        Koniec = skončí zadávanie novej knihy*/

import opakovanie.model.Kniha;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kniznica {
    public static void main(String[] args) {
        ArrayList<Kniha> vsetkyKnihy = new ArrayList<Kniha>(); // Vytvorime dynamicke pole, teda Arraylist, ktory je novy, teda prazdny
        while (true) {
            System.out.println("\n        Menu s možnosťami\n" +
                    "        -----------------\n" +
                    "       1. Zadaj novú knihu\n" +
                    "       2. Zobraz všetky knihy\n" +
                    "       3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                    "       4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                    "       5. Zobraz počet všetkých kníh\n" +
                    "       9. Vymaž všetky knihy\n" +
                    "       Koniec = skončí zadávanie novej knihy");

            Scanner scn = new Scanner(System.in);
            String menuPolozka = scn.nextLine();

            // TODO Vytvorte kod, ktory bude reagovat zatial iba "slovne", teda vypise do konzoly, co ste vybrali. Hint: pouzijeme funkciu IF, prip. SWITCH, CASE

            if (menuPolozka.equals("1")) {
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

            } else if (menuPolozka.equals("2")) {
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
            } else if (menuPolozka.equals("3")) {
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
            } else if (menuPolozka.equals("4")) {
                //4. Vymaž konkrétnu knihu (podľa indexu)\n"
                try {
                    //funkcionalita tohto menu je nasledujuca: Zobraz konkretnu knihu (podla indexu)\n
                    System.out.println("Zadaj index knihy, ktoru chces ZMAZAŤ (pozn. od 1 po N)");
                    int indexKnihy = scn.nextInt(); // od pouzivatela vyzadujeme index knihy, tj. preto scn.nextInt()

                    // Knihy, resp index v Arrayliste implicitne  zacina hodnotou 0, nie 1, preto nizsie pouzijeme syntax indexKnihy-1
                    Kniha najdenaKniha = vsetkyKnihy.remove(indexKnihy - 1); // Tymto zapisom sme ziskali knihu podla jeho indexu
                    System.out.println("ZMAZALA sa prave tato kniha: ");
                    System.out.println(najdenaKniha); //Tym, ze v triede Kniha mame metodu toString tak ju mozeme vypisat takto priamo
                } catch (InputMismatchException e) {
                    System.out.println("Zadal si pismeno namiesto ciselneho indexu");
                    // throw new RuntimeException(e);

                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Zadal si neexistujuce cislo indexu");
                } catch (Exception e) {
                    System.out.println("Neznama chyba");
                }

            } else if (menuPolozka.equalsIgnoreCase("koniec")) {
                break; // Prerusi cyklus while (true)
            } else {
                System.out.println("Nevybral si ani jednu spravnu odpoved");
            }
        }

        /*System.out.println("\nTeraz vypisujem odpoved cez SWITCH, CASE");

        switch (menuPolozka) {
            case "1":
                System.out.println("Vybral si 1");
                System.out.println("Dakujem za vyber");
                break;
            case "2":
                System.out.println("Vybral si 2");
                break;
            default:
                System.out.println("Nevybral si ani jednu spravnu odpoved");

        }
        //Konvertor slovnej znamky na ciselnu:
        String znamka = "pat";
        switch (znamka){
            case "päť":
            case "pat":
                System.out.println("Zvolena znamka je po konverzii 5");

        }*/

    }

}
