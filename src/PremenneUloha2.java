import java.text.SimpleDateFormat;
import java.util.Date;
//zadanie na program:
//Vypíšte do konzoly nasledujúci text:
////       Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5
//        a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
//        V Bratislave dňa 18.06.2022
public class PremenneUloha2 {
    public static void main(String[] args) {
        String meno= "Jožko Mrkvičcka";
        String mesiac = "septembra";
        //Zadefinovanie premennej s nazvom datumNarodenia a naplnenim konkretneho datumu. String je datovy typ pre text.
        String datumNarodenia = "03.04.2000";
        double znamka = 1.5;
        //prekonvertovali sme znamku na znamku s desat.ciarkou. %.1f - 1 desati.cislo
        String znamkaSDesatinnouCiarkou = String.format("%.1f",znamka);
        int rok = 2022;
        //String aktualnyDatum = "18.06.2022";

        Date aktualnyDatum = new Date(); //vytvorili sme premennu aktu.datum v angl.formate
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Študent " +meno+ " sa narodil: " +datumNarodenia+ ", z maturitnej skúšky má známku "
                +znamkaSDesatinnouCiarkou+ " a od " + mesiac+ " " + rok+ " nastúpi do nového zamestnania ako Java programátor. \n\tV Bratislave dňa "
                +formatDatumu.format(aktualnyDatum));

    }
}
