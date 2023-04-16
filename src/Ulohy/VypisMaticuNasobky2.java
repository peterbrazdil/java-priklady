package Ulohy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//Bonusová úloha: Vytvorte obdobnú maticu, ktorá bude obsahovať 2-násobok tej predchádzajúcej
// hodnoty (začneme 1), takže bude to vyzerať nasledujúco:
public class VypisMaticuNasobky2 {
    public static void main(String[] args) {

        // Vypiseme aktualny cas
        String timeStampStart = new SimpleDateFormat("HH:mm:ss:SSSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampStart);
        // TODO Test efektivnosti kodu, resp. cyklu
        // Riesenie: Na zaciatku kodu by som zobrazil, resp naplnil premennu aktualnym casom
        // Na konci taktiez, resp odpocital rozdiel trvania
        int j = 1;
        // koncovu hodnotu navysime na velke cislo
        for (int i = 1; i <= 16384 ; i=i*2) {
            System.out.print(i + " ");
            if (j % 5 == 0) System.out.println();
            j++;

        }

        // Vypiseme aktualny cas=otestujeme cas trvania vypoctu
        String timeStampEnd = new SimpleDateFormat("HH:mm:ss:SSSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampEnd);
    }
}
