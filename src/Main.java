public class Main {
    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka(10);

        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin: Ostatnie życzenie", "Andrzej Sapkowski", 332, true);
        Ksiazka ksiazka2 = new Ksiazka("Diuna", "Frank Herbert", 688, true);
        Ksiazka ksiazka3 = new Ksiazka("Rok 1984", "George Orwell", 328, true);

        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);

        czytelnik czytelnik1 = new czytelnik("Kacper", "Psikuta", 122, 2 );
        czytelnik czytelnik2 = new czytelnik("Anna", "Domagała", 162, 0 );

        System.out.println("\n--- Przed Wypożyczeniem ---");
        biblioteka.wypiszDostępneKsizaki();

        System.out.println("\n--- Po wypożyczeniu---");
        biblioteka.wypozycksiazke("Wiedźmin: Ostatnie życzenie", czytelnik1);

        biblioteka.wypiszDostępneKsizaki();

        czytelnik1.wypiszDane();



        System.out.println("\n---Zwrot---");
        biblioteka.zwrocKsiazke("Wiedźmin: Ostatnie życzenie", czytelnik1);
        czytelnik1.wypiszDane();
        biblioteka.wypiszDostępneKsizaki();












    }
}