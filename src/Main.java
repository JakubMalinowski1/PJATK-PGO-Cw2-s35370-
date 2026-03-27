public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin: Ostatnie życzenie", "Andrzej Sapkowski", 332, true);
        Ksiazka ksiazka2 = new Ksiazka("Diuna", "Frank Herbert", 688, true);
        Ksiazka ksiazka3 = new Ksiazka("Rok 1984", "George Orwell", 328, false); // Ta książka jest od razu wypożyczona

        System.out.println("--- Stan początkowy ---");
        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();
        ksiazka3.wypiszInfo();

        System.out.println("\n--- Testowanie operacji ---");
        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka3.zwroc();
        ksiazka2.zwroc();

        System.out.println("\n--- Stan końcowy ---");
        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();
        ksiazka3.wypiszInfo();
    }
}