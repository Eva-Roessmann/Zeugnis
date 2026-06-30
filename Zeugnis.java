import java.util.ArrayList;     // ArrayList für die Liste der Schulfächer
import java.util.Collections;   // Collections.swap() für den Bubblesort

// Klasse Zeugnis
// ---------------
// Verwaltet die Personendaten, die Schulfächer (max. 10) und den Notendurchschnitt
// eines einzelnen Zeugnisses.
public class Zeugnis {
    String schuelername;             // Name des Schülers/der Schülerin
    String geburtsdatum;             // Geburtsdatum, Format: TT.MM.JJJJ
    String zeugnisdatum;             // Datum der Zeugnisausstellung, Format: TT.MM.JJJJ
    ArrayList<Schulfach> faecher;    // Liste der Schulfächer (max. 10 Einträge)
    double notenschnitt;             // berechneter Notendurchschnitt

    // Konstruktor: liest alle Basisdaten ein und legt eine leere Fächerliste an
    public Zeugnis(String schuelername, String geburtsdatum, String zeugnisdatum) {
        this.schuelername = schuelername;     // Namen speichern
        this.geburtsdatum = geburtsdatum;      // Geburtsdatum speichern
        this.zeugnisdatum = zeugnisdatum;      // Zeugnisdatum speichern
        this.faecher = new ArrayList<>();      // leere Liste für die Fächer erstellen
        this.notenschnitt = 0;                 // Notenschnitt startet bei 0
    }

    // addSubject(Schulfach fach)
    // Fügt ein neues Fach hinzu, solange noch Platz ist (max. 10 Fächer)
    public void addSubject(Schulfach fach) {
        if (faecher.size() < 10) {             // nur einfügen, wenn noch unter 10 Fächern
            faecher.add(fach);                 // Fach zur Liste hinzufügen
        } else {
            System.out.println("Maximal 10 Fächer erlaubt!");  // Hinweis bei Überschreitung
        }
    }

    // berechnetDurchschnitt()
    // Berechnet den Notendurchschnitt aus allen Fächern und speichert ihn in notenschnitt
    public void berechneDurchschnitt() {
        if (faecher.isEmpty()) return;         // keine Fächer -> nichts zu berechnen

        int summe = 0;                         // Summe aller Noten
        for (Schulfach f : faecher) {          // jedes Fach in der Liste durchgehen
            summe = summe + f.note;            // Note zur Summe addieren
        }
        notenschnitt = (double) summe / faecher.size();  // Summe durch Anzahl Fächer teilen
    }

    // sortSubjects()
    // Sortiert die Fächerliste aufsteigend nach Note mittels Bubblesort.
    // Es wird absichtlich NICHT die Standard-Sortierfunktion der Liste verwendet,
    // sondern der Algorithmus selbst nachgebaut (wie in der Angabe mit int[] gezeigt).
    public void sortSubjects() {
        for (int i = 1; i < faecher.size(); i++) {           // äußere Schleife: Anzahl Durchläufe
            for (int j = 0; j < faecher.size() - i; j++) {   // innere Schleife: Nachbarn vergleichen
                if (faecher.get(j).note > faecher.get(j + 1).note) {  // wenn linke Note größer ist
                    Collections.swap(faecher, j, j + 1);     // beide Elemente in der Liste tauschen
                }
            }
        }
    }

    // printCertificate()
    // Gibt das fertig gestaltete Zeugnis in der Konsole aus.
    public void printCertificate() {
        System.out.println("==================================");
        System.out.println("              ZEUGNIS");
        System.out.println("==================================");
        System.out.println("Name:            " + schuelername);   // Schülername ausgeben
        System.out.println("Geburtsdatum:    " + geburtsdatum);    // Geburtsdatum ausgeben
        System.out.println("----------------------------------");
        System.out.println("Fach                      Note");
        System.out.println("----------------------------------");
        for (Schulfach f : faecher) {                               // alle Fächer ausgeben
            System.out.printf("%-25s %d%n", f.bezeichnung, f.note); // formatiert: Fach links, Note rechts
        }
        System.out.println("----------------------------------");
        System.out.printf("Notendurchschnitt: %.2f%n", notenschnitt);  // Durchschnitt mit 2 Nachkommastellen
        System.out.println("==================================");
        System.out.println("Zeugnisdatum: " + zeugnisdatum);        // Zeugnisdatum am Ende ausgeben
    }
}
