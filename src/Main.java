public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin: Ostatnie życzenie", "Andrzej Sapkowski", 332, true);
        Ksiazka ksiazka2 = new Ksiazka("Diuna", "Frank Herbert", 688, true);
        Ksiazka ksiazka3 = new Ksiazka("Rok 1984", "George Orwell", 328, false); // Ta książka jest od razu wypożyczona


        czytelnik czytelnik1 = new czytelnik("Kacper", "Psikuta", 122, 2 );
        czytelnik czytelnik2 = new czytelnik("Anna", "Domagała", 162, 0 );



        System.out.println("--- Stan początkowy ---");
        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();
        ksiazka3.wypiszInfo();

        System.out.println("\n--- Testowanie operacji ---");
        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka3.zwroc();
        ksiazka2.zwroc();

        System.out.println("--- Stan końcowy ---");
        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();
        ksiazka3.wypiszInfo();

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





    }
}