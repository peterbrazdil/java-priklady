package sk.tmconsulting.rozhranie;

public class EvidenciaKlientovMain {
    public static void main(String[] args) {
        Klient klient1 = new Klient();
        klient1.setMeno("Jan");
        klient1.setPriezvisko("Zitniak");

        KlientService klientService = new KlientService();
        klientService.zobrazOsobneUdaje(klient1);
    }

}
