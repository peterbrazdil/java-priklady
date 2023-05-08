package opakovanie.model;
// Constructor na vyplnenie:
public class Kniha {
    private String nazov;
    private String autor;
    private int rokVydania;

    // konstruktor sluzi na inicializaciu fields (udajov triedy, resp atributy, resp premenne


    public Kniha() {
        // Inicializacia objektu Kniha
        this.nazov = "-";
        this.autor = "-";
        this.rokVydania = 2000;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    // toSTring musi byt samostantne mimo Constructora
    @Override
    public String toString() {
        return "Nazov Knihy: "  + nazov + "\nAutor knihy: " + autor + "\nRok vydania: " +  rokVydania;
    }
}
