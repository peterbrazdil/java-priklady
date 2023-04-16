public class Premenne {
    //2.lekcia: https://www.w3schools.com/java/java_variables.asp
    public static void main(String[] args) {
        String meno="Juraj";
        int celeCislo=123;
        float desatinneCislo = 234.56f;
        double desatinneCisloAkoDouble = 1.23;
        char znak = '9'; //AltGr p vlozi znak '
        boolean jeDnesStreda = true; //true znamena, ze je pravda (ano), false je nepravda

        int celeCislo2;
        celeCislo2 = 456;
        int celeCislo3 = 789;
        celeCislo3 = 0; // naplnili sme premennu celeCislo3 hodnotou 0, zmenili sme povodnu hodnotu 789

        double cenaBezDPH = 1000.0;
        double cenaSDPH = 0.0;

        cenaSDPH= cenaBezDPH * 1.20; // premennu cenuBezDPH sme vynasobili 1,20 a vysledok sme umiestnili spat do premennej cenaSDPH
        System.out.println("Cena bez DPH:"+cenaBezDPH);
        System.out.println("Cena s DPH:" + cenaSDPH);

        System.out.println("Meno: " + meno);
        System.out.println("Cele číslo: " + celeCislo);
        System.out.println("Desatinne číslo:" + desatinneCislo);
        System.out.println("Destatinne čislo ako double: " + desatinneCisloAkoDouble);
        System.out.println("Vypisany znak: " + znak);
        System.out.println("Je dnes streda?" + jeDnesStreda);
        System.out.println("Cele cislo 2:" + celeCislo2);
        System.out.println("Cele čislo 3:" + celeCislo3);
        System.out.println(" vysvetluje: \n €?  \" toto je citacia \"  ");

        // \n vlozi prazdny riadok a musi byt vpisane v ramci texu, reps. v uvodzovkach
        // mozeme pouzit \t reprezentuje tabulator, teda odsadenie
        System.out.println("\tTento text je odsadeny");




    }


}
