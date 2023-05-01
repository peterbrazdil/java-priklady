package Ulohy;

import java.util.ArrayList;

public class DatabazaZamestnancov {
    public static void main(String[] args) {
        // Vytvorime zamestnanca cez prikaz new a nazov triedy, teda objekt zamestnanec1 alebo synonymum je instancia triedy
        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.meno = "Jan";
        zamestnanec1.priezvisko = "Zitniak";
        zamestnanec1.pohlavie = 'm'; // Apostrof vlozime cez ALTGR+P
        zamestnanec1.rok = 2000;
        // Chceme vypisat osobne udaje zamestnanca, tak to urobime presne rovnako ako sme do neho vpisali
        System.out.println(zamestnanec1.meno);
        System.out.println(zamestnanec1.priezvisko);
        System.out.println(zamestnanec1.pohlavie);
        System.out.println(zamestnanec1.rok);

        //Chceme vyťvorit dalsieho zamestnanca, cize zamestnanca c.2
        Zamestnanec zamestnanec2 = new Zamestnanec();
        zamestnanec2.meno = "jozko";
        zamestnanec2.priezvisko = "Mrkvicka";
        zamestnanec2.pohlavie = 'm';
        zamestnanec2.rok = 2010;
        // Chceme vypisat osobne udaje zamestnanca, tak to urobime presne rovnako ako sme do neho vpisali
        System.out.println(zamestnanec2.meno);
        System.out.println(zamestnanec2.priezvisko);
        System.out.println(zamestnanec2.pohlavie);
        System.out.println(zamestnanec2.rok);

        //Chceme ulozit zamestnancov do ArrayListu
        ArrayList<Zamestnanec> dynamickePoleZamestnancov = new ArrayList<Zamestnanec>();
        dynamickePoleZamestnancov.add(zamestnanec1);
        dynamickePoleZamestnancov.add(zamestnanec2);

        // Ako ich vypisat
        // Hint: Pouzijes foreach
        System.out.println("\nVypisujem zamestnancov cez for each");
        System.out.println("-----------------------------------");
        for (Zamestnanec konkretnyZamestnanec: dynamickePoleZamestnancov) {
            System.out.println(konkretnyZamestnanec.meno);
            System.out.println(konkretnyZamestnanec.priezvisko);
            System.out.println(konkretnyZamestnanec.pohlavie);
            System.out.println(konkretnyZamestnanec.rok);

        }
    }
}
