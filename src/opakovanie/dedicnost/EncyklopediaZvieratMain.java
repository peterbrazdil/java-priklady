package opakovanie.dedicnost;

public class EncyklopediaZvieratMain {
    public static void main(String[] args) {
        System.out.println("Delfin");
        Delfin delfin = new Delfin();
        delfin.hybeSa();
        delfin.sajeMlieko();
        System.out.println("JE_TEPLOKRVNY? " + delfin.JE_TEPLOKRVNY);
        System.out.println(delfin.MA_SRST);

        System.out.println("\nVlk");
        Vlk vlk = new Vlk();
        vlk.hybeSa();
        vlk.sajeMlieko();
        System.out.println(vlk.JE_TEPLOKRVNY);
        System.out.println(vlk.MA_SRST);



    }
}
