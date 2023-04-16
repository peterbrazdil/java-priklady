package Ulohy;
// continue a rozne ukoncenie programu
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 2) continue; // Pri hodnote i == 2 preskoci na dalsiu iterakciu
              //  if (i == 7) break; // Ukonci cyklus pri hodnote 7, potom pokracuje od 8
              //  if (i == 7) System.exit(1); // Ukonci cely program exitom ktoremu sme priradili cislo 1
             //  if (i == 7) return; // Ukonci cyklus a aj program
                System.out.println(i);
            }
        }
        System.out.println("Koniec programu");
    }
}

