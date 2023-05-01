package Ulohy;

import java.util.ArrayList;

public class DatabazaKnih {
    public static void main(String[] args) {
        Kniha kniha1 = new Kniha();
        kniha1.setNazov("Ja, robot");
        kniha1.setAutor("Isaac Asimov");
        kniha1.setPocetStran(200);

        Kniha kniha2 = new Kniha();
        kniha2.setNazov("Par prstenov");
        kniha2.setAutor("J.R.R.Tolkien");
        kniha2.setPocetStran(300);

        Kniha kniha3 = new Kniha ("Duna", "F.Herbert", "SCI-FI", "vydavatelstvo", 250); //musi byt napisane v rovnakom poradi ako v konstruktore

        ArrayList<Kniha> kniznica = new ArrayList<Kniha>();
        kniznica.add(kniha1);
        kniznica.add(kniha2);
        kniznica.add(kniha3);

        // Vypiseme vsetky knihy z kniznice, teda cez for each
        for(Kniha konkretnaKniha:kniznica) {
            System.out.println(konkretnaKniha.getNazov());
            System.out.println(konkretnaKniha.getAutor());
            System.out.println(konkretnaKniha.getPocetStran());
        }
    }
}
