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
        System.out.println("Czytelnik:" + imie + " " + nazwisko +
                " Karta nr: " + numerKarty + " " + "Wypożyczone książki:" + liczbaWypożyczeń);
    }

    public void zwiększLiczbeWypożyczeń() {
        liczbaWypożyczeń ++;
        System.out.println("Czytelnik:" + imie + " " + nazwisko + " " + "posiada:" + " " + liczbaWypożyczeń + " " + "wypożyczone książki");
    }

    public void zmniejszLiczbeWypożyczeń(){
        if(liczbaWypożyczeń > 0) {
            liczbaWypożyczeń --;
            System.out.println("Czytelnik:" + imie + " " + nazwisko + " " + "posiada:" + liczbaWypożyczeń + "wypożyczone książki");
        }
        else {
            System.out.println("Czytelnik:" + imie + " " + nazwisko + " " + "nie ma żadnych książek wypożyczonych");
        }
    }

}
