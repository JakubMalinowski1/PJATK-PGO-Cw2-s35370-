public class Biblioteka {

    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemność) {

        this.ksiazki = new Ksiazka[pojemność];
        this.liczbaKsiazek = 0;

    }

    public void dodajKsiazke(Ksiazka ksiazka) {

        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek++] = ksiazka;
            System.out.println("Dodano książke do biblioteki");
        }

        else {
        System.out.println("Nie ma miejsza na nowe książki");
        }
    }

    public void wypiszDostępneKsizaki(){

        System.out.println("\n---Lista dostępnych ksiazek---");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].dostepna) {
            ksiazki[i].wypiszInfo();
            }

        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].tytul.equals(tytul)) {
                return ksiazki[i];


            }
        }
        return null;
    }

    public int policzDostępneKsizaki(){
        int policz = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].dostepna) {
                policz++;
            }
        }
        return policz;
    }


}