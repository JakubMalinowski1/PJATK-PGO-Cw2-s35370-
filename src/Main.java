public class Main {
    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka(10);

        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin: Ostatnie życzenie", "Andrzej Sapkowski", 332, true);
        Ksiazka ksiazka2 = new Ksiazka("Diuna", "Frank Herbert", 688, true);
        Ksiazka ksiazka3 = new Ksiazka("Rok 1984", "George Orwell", 328, false);

        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);

        czytelnik czytelnik1 = new czytelnik("Kacper", "Psikuta", 122, 2 );
        czytelnik czytelnik2 = new czytelnik("Anna", "Domagała", 162, 0 );



        System.out.println("\n--- Stan początkowy ---");
        czytelnik1.wypiszDane();
        czytelnik2.wypiszDane();


        System.out.println("\n--- Operacja na czytelniku 1");
        czytelnik1.wypiszDane();
        czytelnik1.zmniejszLiczbeWypożyczeń();
        czytelnik1.zwiększLiczbeWypożyczeń();

        System.out.println("\n--- Operacja na czytelniku 2");
        czytelnik2.wypiszDane();
        czytelnik2.zmniejszLiczbeWypożyczeń();
        czytelnik2.zwiększLiczbeWypożyczeń();

        biblioteka.wypiszDostępneKsizaki();

        int IloscKsiazek = biblioteka.policzDostępneKsizaki();
        System.out.println("\nliczba dostępnych ksiązek: " + IloscKsiazek);

        System.out.println("\n Szukam książki; Diuna");
        Ksiazka znaleziona = biblioteka.znajdzKsiazkePoTytule("Diuna");
        if(znaleziona != null){
            System.out.println("znaleziona");
            znaleziona.wypiszInfo();
        }
        else {
            System.out.println("nie ma");
        }






    }
}