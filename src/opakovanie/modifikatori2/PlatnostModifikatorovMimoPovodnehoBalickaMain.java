package opakovanie.modifikatori2;
import opakovanie.modifikatori.PlatnostModifikatorov;

public class PlatnostModifikatorovMimoPovodnehoBalickaMain  extends PlatnostModifikatorov {
    public static void main(String[] args) {
        PlatnostModifikatorovMimoPovodnehoBalickaMain pmpb = new PlatnostModifikatorovMimoPovodnehoBalickaMain();
        System.out.println(pmpb.protectedText); // Dostupna je len premenna s modifikatorom protected, ale aj to len prostrednictvom dedenia

        PlatnostModifikatorov pm = new PlatnostModifikatorov();
        System.out.println(pm.publicText);

    }

}
