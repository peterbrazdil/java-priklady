import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PremenneUloha {
    public static void main(String[] args) {
        System.out.println("Ahoj");
        System.out.println(3+3);
        // System.out.println("3+3");
        System.out.println(13535.000000000/59.000000000000000000000);
        //toto je komentar
        System.out.println("Študent Jozef Mrkvička sa narodil 03.04.2000," +
                " z maturitnej skúšky má známku 1.5 a od septembra 2022" +
                " nastúpi do nového zamestnania ako Java programátor.V Bratislave dňa 18.06.2022");
        char pohlavie = 'M';
        char krvnaSkupina = 'B';

        System.out.println("Pohlavie: "+pohlavie);
        System.out.println("KS:"+krvnaSkupina);

        //Uloha c 1
        System.out.println("Študent Jozef Mrkvička sa narodil");
        String DatumNarodenia="03.04.2000";
        System.out.println("DN:" +DatumNarodenia);
        System.out.println("z maturitnej skúšky má známku");
        double znamka=1.5;

        System.out.println("a od septembra");
        int NastupDoZamestnania = 2022;
        System.out.println(+NastupDoZamestnania);
        System.out.println("nastúpi do nového zamestnania ako Java programátor.V Bratislave dňa");

        Date datum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(formatDatumu.format(datum));

        System.out.printf("znamka : %.2f", +znamka); //1.moznost cez printf-%f znamená desatinné číslo a .2 znamená,
        // že chceme zobraziť dve desatinné miesta.

        DecimalFormat df = new DecimalFormat("#0.0"); //riesenie z GPT
        String vysledok = df.format(znamka);
        System.out.println("\nznamka:"+vysledok);



    }
}
