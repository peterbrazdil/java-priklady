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
import opakovanie.service.KnihaService;

import java.util.*;

public class Kniznica {
    public static void main(String[] args) {
        ArrayList<Kniha> vsetkyKnihy = new ArrayList<Kniha>(); // Vytvorime dynamicke pole, teda Arraylist, ktory je novy, teda prazdny
       KnihaService knihaService = new KnihaService(); // Vytvorenie objektu, resp zavolanie konstruktora sa urobi iba tam, kde sa vytvara

        while (true) {
           // TODO Zobraz menu z KnihaService
            // ak chceme volat metody z inej triedy, tak musime najskor vytvorit objekt, ktory vlozime do premennej
            // cize v tomto pripade sme vytvorili objekt KnihaService (cize napisali sme new KnihaService) a vlozili ho do
            // knihaSErvice
            // Potom mozeme volat metody cez nazov daje premennej a pouzitim bodky (nasledne zobrazi vsetky dostupne metody - aj tie nase naprogramovane)

            knihaService.zobrazMenu();

            Scanner scn = new Scanner(System.in);
            String menuPolozka = scn.nextLine();

            if (menuPolozka.equals("1")) {
                knihaService.pridajKnihu(vsetkyKnihy);
            } else if (menuPolozka.equals("2")) {
                knihaService.zobrazVsetkyKnihy(vsetkyKnihy);
            } else if (menuPolozka.equals("3")) {
                knihaService.zobrazKnihuPodlaIndexu(vsetkyKnihy);
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

            } else if (menuPolozka.equals("5")) {
                System.out.println("celkovy pocet knih je: " + vsetkyKnihy.size());

            } else if (menuPolozka.equals("6")) {
                System.out.println(" zadaj nazov hladanej knihy");
                String hladanyNazovKnihy = scn.nextLine();
                //Pri hladani nazvu konkretnej knihy budeme prechadzat vsetkycmi knihami, resp. ich nazvami
                // a cez prikaz (metodu) contains, cize fulltextovo
                boolean jeNajdena = false;
                                for (Kniha knihaVZozname: vsetkyKnihy){
                    if (knihaVZozname.getNazov().contains(hladanyNazovKnihy)){
                        System.out.println("Kniha zodpovedajuca hladaniu: \n" + knihaVZozname);
                        jeNajdena = true; // Kniha bola najdena a hovori o tom aj tento priznak, teda premenna jeNajdena

                    }
                    if (jeNajdena == false)  System.out.println("Nebola najdena ziadna kniha podla nazvu.");
                                    // jeNajdena == false
                                    // alebo
                                    // !jeNajdena
                                    // su rovnake vyrazy, resp. maju vyznam

                }
            } else if (menuPolozka.equals("9")) {
                vsetkyKnihy.removeAll(vsetkyKnihy);
                System.out.println("Knihy su odstranene.  Kniznica je prazna!");
              //  Collections.sort(vsetkyKnihy);

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
