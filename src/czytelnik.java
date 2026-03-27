public class czytelnik {

    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypożyczeń;

    public czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypożyczeń) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypożyczeń = liczbaWypożyczeń;
    }

    public void wypiszDane() {
        System.out.println("\n--- Informacje o Czytelniku ---");
        System.out.println("Czytelnik: " + imie + " " + nazwisko + " " +
                "| Karta nr: " + numerKarty + " " + "| Wypożyczone książki: " + liczbaWypożyczeń);
    }

    public void zwiększLiczbeWypożyczeń() {
        liczbaWypożyczeń ++;
    }

    public void zmniejszLiczbeWypożyczeń(){
        if(liczbaWypożyczeń > 0) {
            liczbaWypożyczeń --;
        }

    }

}
