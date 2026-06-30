import java.util.Scanner;   // Scanner-Klasse importieren, um Benutzereingaben zu lesen

// Hauptklasse Main
// -----------------
// Erstellt ein Zeugnis-Objekt, liest Fächer und Noten ein, sortiert die Fächer
// und gibt das fertige Zeugnis aus.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner für Benutzereingaben erstellen

        // --- Schritt 1: Basisdaten des Zeugnisses einlesen ---
        System.out.print("Schülername: ");
        String name = sc.nextLine();           // Namen einlesen
        System.out.print("Geburtsdatum (TT.MM.JJJJ): ");
        String geburtsdatum = sc.nextLine();   // Geburtsdatum einlesen
        System.out.print("Zeugnisdatum (TT.MM.JJJJ): ");
        String zeugnisdatum = sc.nextLine();   // Zeugnisdatum einlesen

        Zeugnis zeugnis = new Zeugnis(name, geburtsdatum, zeugnisdatum);  // Zeugnis-Objekt erstellen

        // --- Schritt 2: Fächer und Noten einlesen, bis Benutzer "X" eingibt ---
        System.out.println("\nFächer eingeben (Bezeichnung 'X' zum Beenden):");
        while (true) {                                  // Endlosschleife, wird mit "break" verlassen
            System.out.print("Fach: ");
            String bezeichnung = sc.nextLine();          // Fachbezeichnung einlesen
            if (bezeichnung.equalsIgnoreCase("X")) break; // Schleife verlassen, sobald "X" eingegeben wird

            System.out.print("Note (1-5): ");
            int note = sc.nextInt();                     // Note einlesen
            sc.nextLine();                                // verbleibenden Zeilenumbruch "leeren"

            zeugnis.addSubject(new Schulfach(bezeichnung, note));  // neues Fach zum Zeugnis hinzufügen
        }

        // --- Schritt 3: Durchschnitt berechnen, Fächer sortieren, Zeugnis ausgeben ---
        zeugnis.berechneDurchschnitt();    // Notendurchschnitt berechnen und speichern
        zeugnis.sortSubjects();            // Fächer aufsteigend nach Note sortieren (Bubblesort)
        zeugnis.printCertificate();        // fertiges Zeugnis ausgeben

        sc.close();   // Scanner schließen, da er nicht mehr benötigt wird
    }
}
