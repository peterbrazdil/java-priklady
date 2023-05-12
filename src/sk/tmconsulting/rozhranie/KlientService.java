package sk.tmconsulting.rozhranie;

public class KlientService implements IklientPrototype, IOsobaPrototyp {

       @Override
    public int akoCastoNavstevujeDanuSluzbu(Klient klient) {
        return 0;
    }

    @Override
    public boolean jePocitacovoGramotny(Klient klient) {
        return false;
    }

    @Override
    public void zobrazOsobneUdaje(Klient klient) {
        System.out.println(klient);

    }

    @Override
    public boolean maPobytNaSlovensku() {
        return false;
    }
}
