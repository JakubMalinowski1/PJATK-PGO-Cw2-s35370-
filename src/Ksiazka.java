public class Ksiazka {
    public String tytul;
    private String autor;
    private int liczbaStron;
    public boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        String status = dostepna ? "Tak" : "Nie";
        System.out.println("Tytuł: " + tytul + " | Autor: " + autor +
                " | Liczba stron: " + liczbaStron +
                " | Dostępna: " + status);
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Pomyślnie wypożyczono książkę: \"" + tytul + "\".");
        } else {
            System.out.println("Niestety, książka \"" + tytul + "\" jest aktualnie wypożyczona.");
        }
    }

    public void zwroc() {
        if (!dostepna) {
            dostepna = true;
            System.out.println("Pomyślnie zwrócono książkę: \"" + tytul + "\".");
        } else {
            System.out.println("Książka \"" + tytul + "\" nie była wypożyczona - znajduje się w bibliotece.");
        }
    }
}