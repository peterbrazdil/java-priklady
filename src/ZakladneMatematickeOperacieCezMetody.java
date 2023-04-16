//pravy klik na nazov clasy, "Reformat code", odfajknut vsetko
public class ZakladneMatematickeOperacieCezMetody {

    public static double scitaj(double cis1, double cis2) {
        return cis1 + cis2;
    }

    public static double odcitaj(double x, double y) {
        return x - y;
    }

    public static double vydel(double x, double y) {
        return x / y;
    }

    public static double vynasob(double x, double y) {
        return x * y;
    }

    public static double modulo(double x, double y) {
        return x % y;
    }

    public static void main(String[] args) {
        double cislo1 = 5.0;
        double cislo2 = 2.5;
        double x = 5.0;
        double y = 2.5;

        System.out.printf("\nVýsledkom sčítania hodnôt " + cislo1 + " a " + cislo2 + " je: " + scitaj(cislo1, cislo2));
        System.out.printf("\nVýsledkom odčítania hodnôt " + x + " a " + y + " je: " + odcitaj(x, y));
        System.out.printf("\nVýsledkom delenia hodnôt " + x + " a " + y + " je: " + vydel(x, y));
        System.out.printf("\nVýsledkom zvyškku po delení hodnôt " + x + " a " + y + " je: " + modulo(x, y));
        System.out.printf("\nVýsledkom násobenia hodnôt %.2f a %.2f je= %.2f", x, y, vynasob(x, y));


    }
}
