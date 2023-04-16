/*Zadanie:
Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.*/
public class PriradenieZnamky{
    public static void main(String[] args) {
        int percento = 75;
        boolean jeClovek = false;
        boolean jeRobot = true;

        if (jeClovek){
            System.out.println("Ano je človek");
        } else {
            System.out.println(("Nie je človek"));
        }
        // ! vykričník znamena negujem
        if (!jeRobot){
            System.out.println("Ano je robot");
        }else {
            System.out.println("Nie je človek");
        }
        //!= nerovna sa     == equals rovna sa
        // >    <
        // >=   <=
        //if je vyraz
        if (percento > 90 )
            // akonahle chcem pouzit viac prikazov v IF, tak musim ich dat do zlozenych zatvoriek, cize {}
        {System.out.println("Máš známku A");
            System.out.println("Hodnotenie A oznamime aj emailom");        }

        //POZOR NA PORADIE PODMIENOK, IDE OD HORA DOLE!!!! NEMOZE IST NAJSKOR >65 A POTOM >75

        else if (percento >75)
            {System.out.println("Máš známku B");        }
        else if (percento >65)
        {System.out.println("Máš známku C");        }
        else {
            System.out.println("Prepadol si");
        }


    }
}
